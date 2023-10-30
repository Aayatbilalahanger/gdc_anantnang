package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity2 extends AppCompatActivity {
ImageView arrow;
RelativeLayout linear;
TextView t1 ,aboutus;
//flipper
    ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //    slider section
        int imagearray[] = {R.drawable.slider,R.drawable.logo,R.drawable.slider1};
        flipper = (ViewFlipper) findViewById(R.id.flipper);
        for(int i=0;i<imagearray.length;i++){
            showimage(imagearray[i]);
        }






        //

        //database connection
        //close database connection

        arrow = findViewById(R.id.arrow);
        linear = findViewById(R.id.linear);
        t1 = findViewById(R.id.t1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, aboutus.class);
                startActivity(intent);
            }
        });


        //aboutus intent
        aboutus = findViewById(R.id.aboutus);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent2);
            }
        });




    }

    public void hide(View view){
        linear.setVisibility(View.GONE);

    }
    public void sidebar(View view){
        linear.setVisibility(View.VISIBLE);
    }

    public void showimage(int img){
        ImageView Imageview = new ImageView(this);
        Imageview.setBackgroundResource(img);
        flipper.addView(Imageview);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);
        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }


}