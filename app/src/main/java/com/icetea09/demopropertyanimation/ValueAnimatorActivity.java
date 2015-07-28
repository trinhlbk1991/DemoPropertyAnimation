package com.icetea09.demopropertyanimation;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

/**
 * Created by Trinh Le on 7/28/2015.
 */
@SuppressWarnings("deprecation")
public class ValueAnimatorActivity extends ActionBarActivity {

    private ImageView mImgSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animator);

        mImgSample = (ImageView) findViewById(R.id.img_sample);
        executeAnimation();
    }

    private void executeAnimation() {
        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0, 1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                mImgSample.setAlpha(animation.getAnimatedFraction());
            }
        });
        valueAnimator.setDuration(1500);
        valueAnimator.setRepeatCount(ValueAnimator.INFINITE);
        valueAnimator.setRepeatMode(ValueAnimator.REVERSE);
        valueAnimator.start();
    }

}
