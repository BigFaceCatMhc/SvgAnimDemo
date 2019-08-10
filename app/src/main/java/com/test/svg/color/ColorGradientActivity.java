package com.test.svg.color;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.test.svg.R;

public class ColorGradientActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mSvgColorAnimView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_gradient);
        mSvgColorAnimView = findViewById(R.id.color_gradient_anim);
        findViewById(R.id.play_anim).setOnClickListener(this);
        findViewById(R.id.reset_anim).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.play_anim:
                playColorAnim();
                break;
            case R.id.reset_anim:
                resetColorAnim();
                break;
            default:
                break;
        }
    }

    private void playColorAnim() {
        ((AnimatedVectorDrawable) mSvgColorAnimView.getDrawable()).start();
    }

    private void resetColorAnim() {
        //reset()方法只能在API 23才能用，老版本暂时没找到好办法
        ((AnimatedVectorDrawable) mSvgColorAnimView.getDrawable()).reset();
    }
}
