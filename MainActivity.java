package com.noraizbabar.animationcar;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView Car;
    Button Farword, Backword, Right, Left;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car=findViewById(R.id.car);
        Farword= findViewById(R.id.farword);
        Backword= findViewById(R.id.backword);
        Right= findViewById(R.id.right_btn);
        Left= findViewById(R.id.left_btn);
        Car.setRotation(90f);


        Backword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final ObjectAnimator animation_y = ObjectAnimator.ofFloat(Car, "y", 190f, 380f, 190f);
                final ObjectAnimator animationrotate_y = ObjectAnimator.ofFloat(Car, "rotation", 0f, 270f);//now no rotation because zero degree..
                animation_y.setDuration(2000);
                animationrotate_y.setDuration(1000);
                AnimatorSet animatorSet_Y = new AnimatorSet();
                animatorSet_Y.playTogether(animationrotate_y);
                animatorSet_Y.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(animation_y);
                        animatorSet.start();

                    }
                },1900);

            }
        });
        Farword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ObjectAnimator animation_y = ObjectAnimator.ofFloat(Car, "y", 190f, 10f, 190);
                final ObjectAnimator animationrotate_y = ObjectAnimator.ofFloat(Car, "rotation", 0f, 90f);//now no rotation because zero degree..
                animation_y.setDuration(2000);
                animationrotate_y.setDuration(1000);
                AnimatorSet animatorSet_Y = new AnimatorSet();
                animatorSet_Y.playTogether(animationrotate_y);
                animatorSet_Y.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(animation_y);
                        animatorSet.start();

                    }
                },1900);

            }
        });
        Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ObjectAnimator animationy = ObjectAnimator.ofFloat(Car, "x", 1130f, 940f, 1130f);
                final ObjectAnimator animationrotatey = ObjectAnimator.ofFloat(Car, "rotation", 0f,0f);//now no rotation because zero degree..
                animationy.setDuration(2000);
                animationrotatey.setDuration(1000);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(animationrotatey);
                animatorSet.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(animationy);
                        animatorSet.start();


                    }
                },1900);

            }
        });
        Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ObjectAnimator animationy = ObjectAnimator.ofFloat(Car, "x", 1130f, 1330f, 1130f);
                final ObjectAnimator animationrotatey = ObjectAnimator.ofFloat(Car, "rotation", 0f,180f);//now no rotation because zero degree..
                animationy.setDuration(2000);
                animationrotatey.setDuration(1000);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(animationrotatey);
                animatorSet.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(animationy);
                        animatorSet.start();


                    }
                },1900);
            }
        });


    }
}
