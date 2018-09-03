package com.example.umeshyadav.tech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        //Button1 for
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();

            }
        });//button click code

        button2= (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();

            }
        });

        button3= (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();

            }
        });


        button4= (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();

            }
        });


    }//open activity code for next


    //method for open activity
    public void openActivity2(){
        Intent intent =new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent =new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent =new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
    public void openActivity5(){
        Intent intent =new Intent(this, Main5Activity.class);
        startActivity(intent);
    }//activity for second



}
