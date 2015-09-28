package za.co.rettakid.meds.view;

import android.content.Intent;
import android.location.Location;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import za.co.rettakid.meds.R;
import za.co.rettakid.meds.models.dto.PracticeDto;
import za.co.rettakid.meds.models.dto.PracticeListDto;
import za.co.rettakid.meds.network.NetworkAsyncTask;
import za.co.rettakid.meds.network.PracticeClient;

public class PracticeMapsActivity extends BaseActivity implements OnMapReadyCallback {

    private Map<Marker, PracticeDto> practices = new HashMap<>();
    private Location myLocation;

    @Override
    protected void onBaseCreate() {
        setContentView(R.layout.activity_practice_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        initMap(map);
        getPracticeDtos(map);
    }

    private void initMap(final GoogleMap map) {
        map.setMyLocationEnabled(true);
        myLocation = map.getMyLocation();
        if (myLocation!= null)  {
            centerCamera(map);
        }
        map.setOnMyLocationChangeListener(new GoogleMap.OnMyLocationChangeListener() {
            @Override
            public void onMyLocationChange(Location location) {
                if (myLocation == null) {
                    myLocation = location;
                    centerCamera(map);
                }
            }
        });
        map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Intent intent = new Intent(getBaseContext(), PracticeActivity.class);
                intent.putExtra("practiceDto", practices.get(marker));
                startActivity(intent);
                return false;
            }
        });
    }

    private void centerCamera(final GoogleMap map) {
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(myLocation.getLatitude(), myLocation.getLongitude()), 12));
    }

    private void getPracticeDtos(final GoogleMap map) {
        practices = new HashMap<>();
        getProgressView().start();
        NetworkAsyncTask networkAsyncTask = new NetworkAsyncTask<Object, Void, PracticeListDto>(getBaseContext()) {
            List<PracticeDto> practiceDtos = new ArrayList<>();

            @Override
            protected PracticeListDto doInBackground(Object... params) {
                PracticeClient practiceClient = new PracticeClient();
                return practiceClient.getPractices();
            }

            @Override
            protected void onFailure() {
                getProgressView().stop();
            }

            @Override
            protected void onPostExecute(PracticeListDto practiceListDto) {
                practiceDtos = practiceListDto.getPracticeList();
                for (PracticeDto practiceDto : practiceDtos) {
                    addPractice(practiceDto, map);
                }
                getProgressView().stop();


            }
        };
        networkAsyncTask.execute();
    }

    public void addPractice(PracticeDto practiceDto, GoogleMap map) {
        LatLng latLng = new LatLng(practiceDto.getLatitude(), practiceDto.getLongitude());
        MarkerOptions markerOptions = new MarkerOptions()
                .position(latLng)
                .title(practiceDto.getName())
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.doctor));
        practices.put(map.addMarker(markerOptions), practiceDto);
    }

}
