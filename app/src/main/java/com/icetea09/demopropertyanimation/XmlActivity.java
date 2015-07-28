package com.icetea09.demopropertyanimation;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

/**
 * Created by Trinh Le on 7/28/2015.
 */
@SuppressWarnings("deprecation")
public class XmlActivity extends ActionBarActivity {

    private ImageView mImgSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animator);

        mImgSample = (ImageView) findViewById(R.id.img_sample);
        executeAnimation();
    }

    private void executeAnimation() {
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.custom_animation);
        set.setTarget(mImgSample);
        set.start();
    }

}
