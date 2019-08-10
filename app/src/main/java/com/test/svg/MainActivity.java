package com.test.svg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.test.svg.clip.ClipAnimActivity;
import com.test.svg.color.ColorGradientActivity;
import com.test.svg.group.GroupAnimActivity;
import com.test.svg.shapeChange.ShapeChangeAnimActivity;
import com.test.svg.three.ThreeAnimActivity;
//参考链接：https://www.300168.com/yidong/show-2693.html
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.color_gradient_anim).setOnClickListener(this);
        findViewById(R.id.group_anim).setOnClickListener(this);
        findViewById(R.id.three_anim).setOnClickListener(this);
        findViewById(R.id.clip_anim).setOnClickListener(this);
        findViewById(R.id.shape_change_anim).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.color_gradient_anim:
                gotoActivity(ColorGradientActivity.class);
                break;
            case R.id.group_anim:
                gotoActivity(GroupAnimActivity.class);
                break;
            case R.id.three_anim:
                gotoActivity(ThreeAnimActivity.class);
                break;
            case R.id.clip_anim:
                gotoActivity(ClipAnimActivity.class);
                break;
            case R.id.shape_change_anim:
                gotoActivity(ShapeChangeAnimActivity.class);
                break;
            default:
                break;
        }
    }



    private void gotoActivity(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}
