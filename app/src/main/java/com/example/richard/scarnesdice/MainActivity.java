package com.example.richard.scarnesdice;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private ImageView randomImage;
    private TextView scoreUpdate;

    private int overallScore;
    private int turnScore;
    private int compScore;
    private int compTurnScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        overallScore = 5;
        compScore = 8;


        Log.i("mainActivity", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        scoreUpdate = (TextView) findViewById(R.id.textView);

        Log.i("mainActivity", "button1 clicked");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("mainActivity", "button1 clicked");

                Random rand = new Random();
                int random = rand.nextInt(6) + 1;

                randomImage = (ImageView) findViewById(R.id.imageView1);

                while (overallScore < 100) {
                    switch (random) {
                        case 1:
                            randomImage.setImageResource(R.drawable.dice1);
                            turnScore = 0;
                            break;
                        case 2:
                            randomImage.setImageResource(R.drawable.dice2);
                            turnScore += random;
                            break;
                        case 3:
                            randomImage.setImageResource(R.drawable.dice3);
                            turnScore += random;
                            break;
                        case 4:
                            randomImage.setImageResource(R.drawable.dice4);
                            turnScore += random;
                            break;
                        case 5:
                            randomImage.setImageResource(R.drawable.dice5);
                            turnScore += random;
                            break;
                        case 6:
                            randomImage.setImageResource(R.drawable.dice6);
                            turnScore += random;
                            break;
                        default:
                            break;
                    }
                }

                // put code about winning here

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                }

                // put code about winning here


        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }

            // put code about winning here


        });




    }



}
