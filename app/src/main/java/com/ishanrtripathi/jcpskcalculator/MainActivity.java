package com.ishanrtripathi.jcpskcalculator;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText et360,et300,et275,et250,et225,et200,et175,et150;
    TextView tv360,tv300,tv275,tv250,tv225,tv200,tv175,tv150,totalUnits,totalRM,totalMT;
    double rmList[]=new double[8];
    int tuList[]=new int[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et360=findViewById(R.id.et360);
        et300=findViewById(R.id.et300);
        et275=findViewById(R.id.et275);
        et250=findViewById(R.id.et250);
        et225=findViewById(R.id.et225);
        et200=findViewById(R.id.et200);
        et175=findViewById(R.id.et175);
        et150=findViewById(R.id.et150);
        tv360=findViewById(R.id.tv360);
        tv300=findViewById(R.id.tv300);
        tv275=findViewById(R.id.tv275);
        tv250=findViewById(R.id.tv250);
        tv225=findViewById(R.id.tv225);
        tv200=findViewById(R.id.tv200);
        tv175=findViewById(R.id.tv175);
        tv150=findViewById(R.id.tv150);
        totalUnits=findViewById(R.id.totalUnits);
        totalRM=findViewById(R.id.totalRM);
        totalMT=findViewById(R.id.totalMT);

        et360.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    //Toast.makeText(MainActivity.this, s.toString(), Toast.LENGTH_SHORT).show();
                    tuList[7] = Integer.parseInt(s.toString());
                    rmList[7] = tuList[7] * 3.60;
                }catch (NumberFormatException e)
                {
                    tuList[7]=0;
                    rmList[7]=0;
                }
                tv360.setText(String.valueOf(rmList[7]));
                updateTU();
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        et300.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    tuList[6] = Integer.parseInt(s.toString());
                    rmList[6] = tuList[6] * 3.00;
                }catch (NumberFormatException e)
                {
                    tuList[6]=0;
                    rmList[6]=0;
                }
                tv300.setText(String.valueOf(rmList[6]));
                updateTU();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        et275.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    tuList[5] = Integer.parseInt(s.toString());
                    rmList[5] = tuList[5] * 2.75;
                }catch (NumberFormatException e)
                {
                    tuList[5]=0;
                    rmList[5]=0;
                }
                tv275.setText(String.valueOf(rmList[5]));
                updateTU();
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        et250.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    tuList[4] = Integer.parseInt(s.toString());
                    rmList[4] = tuList[4] * 2.50;
                }catch (NumberFormatException e)
                {
                    tuList[4]=0;
                    rmList[4]=0;
                }
                tv250.setText(String.valueOf(rmList[4]));
                updateTU();
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        et225.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try{
                    tuList[3]=Integer.parseInt(s.toString());
                    rmList[3]=tuList[3]*2.25;
                }catch (NumberFormatException e)
                {
                    tuList[3]=0;
                    rmList[3]=0;
                }
                tv225.setText(String.valueOf(rmList[3]));
                updateTU();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        et200.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged( CharSequence s, int start, int before, int count) {
                try
                {
                    tuList[2]=Integer.parseInt(s.toString());
                    rmList[2]=tuList[2]*2.00;
                }catch (NumberFormatException e)
                {
                    tuList[2]=0;
                    rmList[2]=0;
                }
                tv200.setText(String.valueOf(rmList[2]));
                updateTU();

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        et175.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    tuList[1] = Integer.parseInt(s.toString());
                    rmList[1] = tuList[1] * 1.75;
                }catch (NumberFormatException e)
                {
                    tuList[1]=0;
                    rmList[1]=0;
                }
                tv175.setText(String.valueOf(rmList[1]));
                updateTU();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        et150.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    et150.setCursorVisible(true);
                    tuList[0] = Integer.parseInt(s.toString());
                    rmList[0] = tuList[0] * 1.5;
                }catch (NumberFormatException e)
                {
                    tuList[0]=0;
                    rmList[0]=0;
                }
                tv150.setText(String.valueOf(rmList[0]));
                updateTU();
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    private void updateTU() {
        int s=0;
        for(int i=0;i<8;i++)
        {
            s+=tuList[i];
        }
        totalUnits.setText(String.valueOf(s));
        updateTRM();
    }

    private void updateTRM()
    {
        double s=0;
        for(int i=0;i<8;i++)
        {
            s+=rmList[i];
        }
        totalRM.setText(String.format(Locale.US,"%.5g%n",s));
        totalMT.setText(String.format(Locale.US,"%.4g%n",s/78.74));
        Toast toast = Toast.makeText(MainActivity.this, "M T : "+totalMT.getText().toString()+"\nR M : "+totalRM.getText().toString(), Toast.LENGTH_LONG);
        View view = toast.getView();
        TextView text = view.findViewById(android.R.id.message);

        view.getBackground().setColorFilter(Color.parseColor("#c23616"), PorterDuff.Mode.SRC_IN);
        text.setTextColor(Color.WHITE);
        text.setTextSize(20);
        toast.show();
    }
}
