package com.example.gfgfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean opened;
    TextView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.view);
        view.setVisibility(View.INVISIBLE);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!opened){
                    view.setVisibility(View.VISIBLE);
                    TranslateAnimation animate = new TranslateAnimation(
                            0,
                            0,
                            view.getHeight(),
                            0);
                    animate.setDuration(500);
                    animate.setFillAfter(true);
                    view.startAnimation(animate);
                } else {
                    view.setVisibility(View.INVISIBLE);
                    TranslateAnimation animate = new TranslateAnimation(
                            0,
                            0,
                            0,
                            view.getHeight());
                    animate.setDuration(0);
                    view.startAnimation(animate);
                }
                opened = !opened;
            }
        });
    }
}