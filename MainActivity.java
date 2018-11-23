package com.example.singhritick.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup r;
    RadioButton r1,r2,r3;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r= findViewById(R.id.radio);

        but= (Button) findViewById(R.id.b);
                but.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        r1= findViewById(R.id.b1);
                        r2= findViewById(R.id.b2);
                        r3= findViewById(R.id.b3);
                        if(r1.isChecked()){
                            Toast.makeText(getApplicationContext(),"JAVA IS SELECTED", Toast.LENGTH_SHORT).show();
                    }
                    else
                        if(r2.isChecked()){
                            Toast.makeText(getApplicationContext(),"ANDROID IS SELECTED", Toast.LENGTH_SHORT).show();
                }
                else
                    if(r3.isChecked()){
                        Toast.makeText(getApplicationContext(),"C++ IS SELECTED", Toast.LENGTH_SHORT).show();

                        }
            }
      });

    }
}