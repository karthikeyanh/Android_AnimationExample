package com.example.animationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   Button rotateButton;

    Button nextAnimationButton,canvasButton;
    Animation rotateAnimation;
    Animation animationObject;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            rotateButton=findViewById(R.id.buttonRotate);

            ImageView img=findViewById(R.id.simpleImageView);
            nextAnimationButton=findViewById(R.id.nextAnimation);
            canvasButton=findViewById(R.id.canvasId);
            rotateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                 animationObject=  AnimationUtils.loadAnimation(getApplicationContext(), R.anim.secondanimation);
                img.startAnimation(animationObject);


                }
            });


            nextAnimationButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i =new Intent(getApplicationContext(),AnimationSecondPage.class);
                    startActivity(i);



                }
            });
            canvasButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent canvasIntent=new Intent(getApplicationContext(),canvasExample.class);
                    startActivity(canvasIntent);
                }
            });

        }

}





