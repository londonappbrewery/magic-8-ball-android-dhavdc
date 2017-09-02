package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_ask;
        final ImageView img_ball;
        btn_ask = (Button) findViewById(R.id.btn_ask);
        img_ball = (ImageView) findViewById(R.id.img_ball);
        final int[] ballimagearray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5,
        };
        btn_ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomnumber;
                Random randomgen = new Random();
                randomnumber = randomgen.nextInt(5);
                img_ball.setImageResource(ballimagearray[randomnumber]);

            }
        });
    }
}
