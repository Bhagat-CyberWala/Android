package com.web2hack.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioButton Btn1,Btn2,Btn3,Btn4;
    RadioGroup radioGroup;

    @SuppressLint("")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn1=findViewById(R.id.radioBtn1);
        Btn2=findViewById(R.id.radioBtn2);
        Btn3=findViewById(R.id.radioBtn3);
        Btn4=findViewById(R.id.radioBtn4);
        radioGroup=findViewById(R.id.radioGroup);
        getWindow().getDecorView().setBackgroundColor(Color.parseColor("white"));
        Btn1.setVisibility(View.VISIBLE);
        Btn2.setVisibility(View.INVISIBLE);
        Btn3.setVisibility(View.INVISIBLE);
        Btn4.setVisibility(View.INVISIBLE);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioBtn1:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
                        Btn1.setVisibility(View.VISIBLE);
                        Btn2.setVisibility(View.VISIBLE);
                        Btn3.setVisibility(View.INVISIBLE);
                        Btn4.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.radioBtn2:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000FF"));
                        Btn1.setVisibility(View.INVISIBLE);
                        Btn2.setVisibility(View.VISIBLE);
                        Btn3.setVisibility(View.VISIBLE);
                        Btn4.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.radioBtn3:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#008000"));
                        Btn1.setVisibility(View.VISIBLE);
                        Btn2.setVisibility(View.INVISIBLE);
                        Btn3.setVisibility(View.INVISIBLE);
                        Btn4.setVisibility(View.VISIBLE);
                        break;
                    case R.id.radioBtn4:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
                        Btn1.setVisibility(View.VISIBLE);
                        Btn2.setVisibility(View.INVISIBLE);
                        Btn3.setVisibility(View.INVISIBLE);
                        Btn4.setVisibility(View.VISIBLE);
                        break;

                }
            }
        });

    }
}
