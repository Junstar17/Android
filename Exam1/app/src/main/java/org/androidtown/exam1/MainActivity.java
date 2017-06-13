package org.androidtown.exam1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int select=0;
    ImageView imageView;
    ImageView imageView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = (ImageView) findViewById(R.id.imageView);
        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setVisibility(View.GONE);

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(select==1){
                   imageView.setVisibility(View.VISIBLE);
                   imageView6.setVisibility(View.GONE);
                   select=0;
            }

        }});
        imageButton2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(select==0){
                    imageView6.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.GONE);
                    select=1;
                }
            }
        });


        }
    }


