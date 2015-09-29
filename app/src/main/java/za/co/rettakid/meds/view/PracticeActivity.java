package za.co.rettakid.meds.view;

import android.databinding.DataBindingUtil;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import za.co.rettakid.meds.R;
import za.co.rettakid.meds.databinding.ActivityPracticeBinding;
import za.co.rettakid.meds.models.dto.PracticeDto;
import za.co.rettakid.meds.network.NetworkAsyncTask;
import za.co.rettakid.meds.utils.binding.BindPractice;

public class PracticeActivity extends BaseActivity {

    private ImageView practiceImage;
    private ActivityPracticeBinding binding;

    @Override
    protected void onBaseCreate() {
        setContentView(R.layout.activity_practice);
        PracticeDto practiceDto = (PracticeDto)getIntent().getSerializableExtra("practiceDto");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_practice);
        binding.setPractice(BindPractice.bindPractice(practiceDto));
    }

    @Override
    protected void onStart() {
        super.onStart();
        practiceImage = (ImageView)findViewById(R.id.practice_image);
        loadImage();
    }

    private void loadImage()    {
        getProgressView().start();
        NetworkAsyncTask networkAsyncTask = new NetworkAsyncTask<Object, Void, Bitmap>(getBaseContext()) {

            @Override
            protected Bitmap doInBackground(Object... params) {
                Bitmap bitmap = null;
                try {
                    String url = "http://41.185.28.23/meds/meds-php/image.php/" + params[0];
                    InputStream inputStream = (InputStream)new URL(url).getContent();
                    bitmap = BitmapFactory.decodeStream(inputStream);
                    Log.i("url",url);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return bitmap;
            }

            @Override
            protected void onFailure() {
                Toast.makeText(getBaseContext(),"failed",Toast.LENGTH_LONG).show();
            }

            @Override
            protected void onPostExecute(Bitmap bitmap) {
                practiceImage.setImageBitmap(bitmap);
                practiceImage.setAdjustViewBounds(true);
                getProgressView().stop();
            }
        };
        networkAsyncTask.execute(binding.getPractice().getImage().getFile().getGuid());
    }

    protected void floatingActionButtonAction() {
        Toast.makeText(getBaseContext(),"Done it",Toast.LENGTH_LONG).show();
    }

}
