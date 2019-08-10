package com.test.svg.shapeChange;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.test.svg.R;

//参考链接：https://www.jianshu.com/p/00f1f6bb96b3
public class ShapeChangeAnimActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mSvgAnimView1;
    private ImageView mSvgAnimView2;
    private ImageView mSvgAnimView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape_change_anim);
        mSvgAnimView1 = findViewById(R.id.svg_anim_1);
        findViewById(R.id.play_anim_1).setOnClickListener(this);
        findViewById(R.id.reset_anim_1).setOnClickListener(this);

        mSvgAnimView2 = findViewById(R.id.svg_anim_2);
        findViewById(R.id.play_anim_2).setOnClickListener(this);
        findViewById(R.id.reset_anim_2).setOnClickListener(this);

        mSvgAnimView3 = findViewById(R.id.svg_anim_3);
        findViewById(R.id.play_anim_3).setOnClickListener(this);
        findViewById(R.id.reset_anim_3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.play_anim_1:
                playColorAnim1();
                break;
            case R.id.reset_anim_1:
                resetColorAnim1();
                break;
            case R.id.play_anim_2:
                playColorAnim2();
                break;
            case R.id.reset_anim_2:
                resetColorAnim2();
                break;
            case R.id.play_anim_3:
                playColorAnim3();
                break;
            case R.id.reset_anim_3:
                resetColorAnim3();
                break;
            default:
                break;
        }
    }

    private void playColorAnim1() {
        ((AnimatedVectorDrawable) mSvgAnimView1.getDrawable()).start();
    }

    private void resetColorAnim1() {
        //reset()方法只能在API 23才能用，老版本暂时没找到好办法
        ((AnimatedVectorDrawable) mSvgAnimView1.getDrawable()).reset();
    }


    private void playColorAnim2() {
        ((AnimatedVectorDrawable) mSvgAnimView2.getDrawable()).start();
    }

    private void resetColorAnim2() {
        //reset()方法只能在API 23才能用，老版本暂时没找到好办法
        ((AnimatedVectorDrawable) mSvgAnimView2.getDrawable()).reset();
    }


    private boolean mIsAnim3Checked = false;

    private void playColorAnim3() {
        mIsAnim3Checked = !mIsAnim3Checked;
        mSvgAnimView3.setImageState(intArrayOf(), true);
    }


    private int[] intArrayOf() {
//        if (mIsAnim3Checked) android.R.attr.state_checked
//        else -android.R.attr.state_checked)
        if(mIsAnim3Checked) {
            return new int[]{android.R.attr.state_checked};
        }
        else {
            return new int[]{-android.R.attr.state_checked};
        }
    }

    private void resetColorAnim3() {

    }
}
