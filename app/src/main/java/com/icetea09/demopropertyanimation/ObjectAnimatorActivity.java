package com.icetea09.demopropertyanimation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.animation.AnticipateInterpolator;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Trinh Le on 7/28/2015.
 */
@SuppressWarnings("deprecation")
public class ObjectAnimatorActivity extends ActionBarActivity {

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

        objectAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                Toast.makeText(ObjectAnimatorActivity.this, "onAnimationStart", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                Toast.makeText(ObjectAnimatorActivity.this, "onAnimationEnd", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                Toast.makeText(ObjectAnimatorActivity.this, "onAnimationCancel", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                Toast.makeText(ObjectAnimatorActivity.this, "onAnimationRepeat", Toast.LENGTH_SHORT).show();
            }
        });

        objectAnimator.setDuration(1500);
        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        objectAnimator.setRepeatMode(ValueAnimator.REVERSE);
        objectAnimator.start();
    }

}
