package com.ishanrtripathi.jcpskcalculator;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    EditText et360,et300,et275,et250,et225,et200,et175,et150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b10=findViewById(R.id.b10);
        b11=findViewById(R.id.b11);
        b12=findViewById(R.id.b12);
        b13=findViewById(R.id.b13);
        b14=findViewById(R.id.b14);
        b15=findViewById(R.id.b15);
        b16=findViewById(R.id.b16);
        et360=findViewById(R.id.et360);
        et300=findViewById(R.id.et300);
        et275=findViewById(R.id.et275);
        et250=findViewById(R.id.et250);
        et225=findViewById(R.id.et225);
        et200=findViewById(R.id.et200);
        et175=findViewById(R.id.et175);
        et150=findViewById(R.id.et150);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.b2:
                et360.setText(String.valueOf(Integer.parseInt(et360.getText().toString())-50));
                break;
            case R.id.b5:
                et300.setText(String.valueOf(Integer.parseInt(et300.getText().toString())-50));
                break;
            case R.id.b3:
                et275.setText(String.valueOf(Integer.parseInt(et275.getText().toString())-50));
                break;
            case R.id.b4:
                et250.setText(String.valueOf(Integer.parseInt(et250.getText().toString())-50));
                break;
            case R.id.b6:
                et225.setText(String.valueOf(Integer.parseInt(et225.getText().toString())-50));
                break;
            case R.id.b8:
                et200.setText(String.valueOf(Integer.parseInt(et200.getText().toString())-50));
                break;
            case R.id.b9:
                et175.setText(String.valueOf(Integer.parseInt(et175.getText().toString())-50));
                break;
            case R.id.b7:
                et150.setText(String.valueOf(Integer.parseInt(et150.getText().toString())-50));
                break;
            //------------------------------------------------------//
            case R.id.b10:
                et360.setText(String.valueOf(Integer.parseInt(et360.getText().toString())+50));
                break;
            case R.id.b11:
                et300.setText(String.valueOf(Integer.parseInt(et300.getText().toString())+50));
                break;
            case R.id.b1:
                et275.setText(String.valueOf(Integer.parseInt(et275.getText().toString())+50));
                break;
            case R.id.b16:
                et250.setText(String.valueOf(Integer.parseInt(et250.getText().toString())+50));
                break;
            case R.id.b15:
                et225.setText(String.valueOf(Integer.parseInt(et225.getText().toString())+50));
                break;
            case R.id.b14:
                et200.setText(String.valueOf(Integer.parseInt(et200.getText().toString())+50));
                break;
            case R.id.b12:
                et175.setText(String.valueOf(Integer.parseInt(et175.getText().toString())+50));
                break;
            case R.id.b13:
                et150.setText(String.valueOf(Integer.parseInt(et150.getText().toString())+50));
                break;
        }
    }

    public void updateValues()
    {
        //------------------------------------//
        /*updateRM();
        updateTotalRM();
        updateTotalUnits();
        updateMT();*/
        //------------------------------------//
    }
}
