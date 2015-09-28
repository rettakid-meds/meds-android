package za.co.rettakid.meds.utils.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import za.co.rettakid.meds.R;

/**
 * Created by Lwazi Prusent on 2015/09/27.
 */
public class FloatingActionButton extends RelativeLayout {

    public FloatingActionButton(Context context) {
        super(context);
        init();
    }

    public FloatingActionButton(Context context,AttributeSet attributeSet) {
        super(context,attributeSet);
        init();
    }

    public FloatingActionButton(Context context,AttributeSet attributeSet,int defStyleAttr) {
        super(context,attributeSet,defStyleAttr);
        init();
    }

    private void init()  {
        inflate(getContext(),R.layout.floating_action_button, null);
    }

}
