package com.example.suman_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random_class;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button user_recritue = (Button) findViewById(R.id.Recritue);
        Button computer_recritue = (Button) findViewById(R.id.Recritue2);
        TextView win_loose = (TextView) findViewById(R.id.Result);
        ImageView user_dice= (ImageView) findViewById(R.id.user_dice);
        ImageView computer_dice = (ImageView) findViewById(R.id.computer_dice);
        random_class = new Random();

        user_recritue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int user_random = generate_random();
                int computer_random = generate_random();
                if(user_random == computer_random){
                    win_loose.setText("Its a Tie!");
                }
                else if(user_random > computer_random){
                    win_loose.setText("User WIN!");
                }
                else {
                    win_loose.setText("Computer Win!");
                }

                switch (user_random){
                    case 1:
                        user_dice.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        user_dice.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        user_dice.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        user_dice.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        user_dice.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        user_dice.setImageResource(R.drawable.dice6);
                        break;
                }
                switch (computer_random){
                    case 1:
                        computer_dice.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        computer_dice.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        computer_dice.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        computer_dice.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        computer_dice.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        computer_dice.setImageResource(R.drawable.dice6);
                        break;
                }
            }
        });
        computer_recritue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int user_random = generate_random();
                int computer_random = generate_random();
                if(user_random == computer_random){
                    win_loose.setText("Its a Tie!");
                }
                else if(user_random < computer_random){
                    win_loose.setText("User WIN!");
                }
                else {
                    win_loose.setText("Computer Win!");
                }

                switch (user_random){
                    case 1:
                        user_dice.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        user_dice.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        user_dice.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        user_dice.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        user_dice.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        user_dice.setImageResource(R.drawable.dice6);
                        break;
                }
                switch (computer_random){
                    case 1:
                        computer_dice.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        computer_dice.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        computer_dice.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        computer_dice.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        computer_dice.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        computer_dice.setImageResource(R.drawable.dice6);
                        break;
                }
            }
        });
    }

    public int generate_random(){
        return  random_class.nextInt(6) + 1;
    }
}