package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView im1,im2;
    private Button btn;
    private Random randNum=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im1=findViewById(R.id.image1);
        im2=findViewById(R.id.image2);
        btn=findViewById(R.id.btnRoll);

        im1.setVisibility(View.INVISIBLE);
        im2.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im1.setVisibility(View.VISIBLE);
                im2.setVisibility(View.VISIBLE);
                rollDice();
            }
        });

    }
    public void rollDice(){
        switch(randNum.nextInt(6)+1){
            case 1:
                im1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                im1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                im1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                im1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                im1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                im1.setImageResource(R.drawable.dice6);
                break;
        }
        switch(randNum.nextInt(6)+1){
            case 1:
                im2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                im2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                im2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                im2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                im2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                im2.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
