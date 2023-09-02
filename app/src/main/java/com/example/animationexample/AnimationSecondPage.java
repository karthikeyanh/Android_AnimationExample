package com.example.animationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AnimationSecondPage extends AppCompatActivity {
ImageView frameImageView;
Button frameButton,cancelAnimationButton;
AnimationDrawable animationdraw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_second_page);
        frameImageView=findViewById(R.id.imageView);
        cancelAnimationButton=findViewById(R.id.cancelAnimationbtnId);
        frameButton=findViewById(R.id.frameId);
        frameImageView.setBackgroundResource(R.drawable.thirdanimation);
        animationdraw=(AnimationDrawable)frameImageView.getBackground();
        frameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            animationdraw.start();
            }
        });
        cancelAnimationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationdraw.stop();
            }
        });
    }
}