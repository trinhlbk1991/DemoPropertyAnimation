package com.icetea09.demopropertyanimation;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

@SuppressWarnings("deprecation")
public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_value_animator).setOnClickListener(this);
        findViewById(R.id.btn_object_animator).setOnClickListener(this);
        findViewById(R.id.btn_animator_set).setOnClickListener(this);
        findViewById(R.id.btn_interpolator).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_value_animator:
                navigate(ValueAnimatorActivity.class);
                break;
            case R.id.btn_object_animator:
                navigate(ObjectAnimatorActivity.class);
                break;
            case R.id.btn_animator_set:
                navigate(AnimatorSetActivity.class);
                break;
            case R.id.btn_interpolator:
                navigate(InterpolatorActivity.class);
                break;
        }
    }

    /**
     * Navigate to another activity
     *
     * @param destination destination activity
     */
    private void navigate(Class<? extends Activity> destination) {
        Intent intent = new Intent(this, destination);
        startActivity(intent);
    }
}
