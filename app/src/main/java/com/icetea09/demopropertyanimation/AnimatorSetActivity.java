package com.icetea09.demopropertyanimation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

/**
 * Created by Trinh Le on 7/28/2015.
 */
@SuppressWarnings("deprecation")
public class AnimatorSetActivity extends ActionBarActivity {

    private ImageView mImgSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animator);

        mImgSample = (ImageView) findViewById(R.id.img_sample);
        executeAnimation();
    }

    private void executeAnimation() {
        ObjectAnimator fadeAnim = ObjectAnimator.ofFloat(mImgSample, "alpha", 0, 1);
        fadeAnim.setDuration(1000);
        ObjectAnimator rotateAnim = ObjectAnimator.ofFloat(mImgSample, "rotation", 0, 360);
        rotateAnim.setDuration(1000);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(fadeAnim).before(rotateAnim);

        ObjectAnimator fadeOutAnim = ObjectAnimator.ofFloat(mImgSample, "alpha", 0);
        AnimatorSet secondAnimatorSet = new AnimatorSet();
        secondAnimatorSet.play(fadeOutAnim).after(animatorSet);
        secondAnimatorSet.start();
    }

}
