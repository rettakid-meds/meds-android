package za.co.rettakid.meds.view;

import android.databinding.DataBindingUtil;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import za.co.rettakid.meds.R;
import za.co.rettakid.meds.databinding.ActivityPracticeBinding;
import za.co.rettakid.meds.models.dto.PracticeDto;
import za.co.rettakid.meds.utils.binding.BindPractice;

public class PracticeActivity extends BaseActivity {

    private ActivityPracticeBinding binding;

    @Override
    protected void onBaseCreate() {
        setContentView(R.layout.activity_practice);
        PracticeDto practiceDto = (PracticeDto)getIntent().getSerializableExtra("practiceDto");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_practice);
        binding.setPractice(BindPractice.bindPractice(practiceDto));

    }

    protected void floatingActionButtonAction() {
        Toast.makeText(getBaseContext(),"Done it",Toast.LENGTH_LONG).show();
    }

}
