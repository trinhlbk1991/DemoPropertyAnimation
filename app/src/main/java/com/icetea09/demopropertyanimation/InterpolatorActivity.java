package com.icetea09.demopropertyanimation;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;

/**
 * Created by Trinh Le on 7/28/2015.
 */
@SuppressWarnings("deprecation")
public class InterpolatorActivity extends ActionBarActivity {

    private ImageView mImgSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animator);

        mImgSample = (ImageView) findViewById(R.id.img_sample);
        executeAnimation();
    }

    private void executeAnimation() {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(mImgSample, "rotation", 0, 360);
        objectAnimator.setDuration(5000);
        objectAnimator.setInterpolator(new AccelerateInterpolator());
        objectAnimator.start();
    }

}
