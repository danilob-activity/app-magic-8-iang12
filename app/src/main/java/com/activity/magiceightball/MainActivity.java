package com.activity.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton = findViewById(R.id.askButton);
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);
        final int [] ballArray = { //final torna o array constante
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random numberRandom = new Random();
                int number = numberRandom.nextInt(5); //aleatório [0,5];
                ballDisplay.setImageResource(ballArray[number]);
                number = numberRandom.nextInt(5);
            }
        });
    }
}
