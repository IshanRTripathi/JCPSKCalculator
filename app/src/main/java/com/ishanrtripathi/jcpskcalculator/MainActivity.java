package com.ishanrtripathi.jcpskcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextWatcher{

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    EditText et360,et300,et275,et250,et225,et200,et175,et150;
    TextView tv360,tv300,tv275,tv250,tv225,tv200,tv175,tv150,totalUnits,totalRM,totalMT;
    int unitList[]=new int[8];
    double a1,a2,a3,a4,a5,a6,a7,a8;
    int index;
    EditText e;
    public MainActivity()
    {}

    public MainActivity(EditText et,int in)
    {
        e=et;
        index=in;
        //setTotalUnits();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
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

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et275.getText().toString());
                x=x+50;
                et275.setText(String.valueOf(x));
                unitList[5]=x;
                a6=unitList[5]*2.75;
                tv275.setText(String.valueOf(a6));
                setTotalUnits();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et360.getText().toString());
                x=x-50;
                if(x<=0){
                    et360.setText("0");
                    tv360.setText("0");
                    unitList[7]=0;
                    a8=0;
                    setTotalUnits();
                    return;
                }
                et360.setText(String.valueOf(x));
                unitList[7]=x;a8=unitList[7]*3.6;
                tv360.setText(String.valueOf(a8));
                setTotalUnits();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et275.getText().toString());
                x=x-50;
                if(x<=0)
                {
                    et275.setText("0");
                    unitList[5]=0;
                    a6=0;
                    tv275.setText("0");
                    setTotalUnits();
                    return;
                }
                et275.setText(String.valueOf(x));
                unitList[5]=x;
                a6=unitList[5]*2.75;
                tv275.setText(String.valueOf(a6));
                setTotalUnits();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et250.getText().toString());
                x=x-50;
                if(x<=0)
                {
                    et250.setText("0");
                    unitList[4]=0;
                    a5=0;
                    tv250.setText("0");
                    setTotalUnits();
                    return;
                }
                et250.setText(String.valueOf(x));
                unitList[4]=x;
                a5=unitList[4]*2.5;
                tv250.setText(String.valueOf(a5));
                setTotalUnits();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et300.getText().toString());
                x=x-50;
                if(x<=0)
                {
                    et300.setText("0");
                    unitList[6]=0;
                    a7=0;
                    tv300.setText("0");
                    setTotalUnits();
                    return;
                }
                et300.setText(String.valueOf(x));
                unitList[6]=x;
                a7=unitList[6]*3.0;
                tv300.setText(String.valueOf(a7));
                setTotalUnits();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et225.getText().toString());
                x=x-50;
                if(x<=0)
                {
                    et225.setText("0");
                    unitList[3]=0;
                    a4=0;
                    tv225.setText("0");
                    setTotalUnits();
                    return;
                }
                et225.setText(String.valueOf(x));
                unitList[3]=x;
                a4=unitList[3]*2.25;
                tv225.setText(String.valueOf(a4));
                setTotalUnits();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et150.getText().toString());
                x=x-50;
                if(x<=0)
                {
                    et150.setText("0");
                    unitList[0]=0;
                    a1=0;
                    tv150.setText("0");
                    setTotalUnits();
                    return;
                }
                et150.setText(String.valueOf(x));
                unitList[0]=x;
                a1=unitList[0]*1.5;
                tv150.setText(String.valueOf(a1));
                setTotalUnits();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et200.getText().toString());
                x=x-50;
                if(x<=0)
                {
                    et200.setText("0");
                    unitList[2]=0;
                    a3=0;
                    tv200.setText("0");
                    setTotalUnits();
                    return;
                }
                et200.setText(String.valueOf(x));
                unitList[2]=x;
                a3=unitList[2]*2.0;
                tv200.setText(String.valueOf(a3));
                setTotalUnits();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et175.getText().toString());
                x=x-50;
                if(x<=0)
                {
                    et175.setText("0");
                    unitList[1]=0;
                    a2=0;
                    tv175.setText("0");
                    setTotalUnits();
                    return;
                }
                et175.setText(String.valueOf(x));
                unitList[1]=x;
                a2=unitList[1]*1.75;
                tv175.setText(String.valueOf(a2));
                setTotalUnits();
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et360.getText().toString());
                x=x+50;
                et360.setText(String.valueOf(x));
                unitList[7]=x;
                a8=unitList[7]*3.6;
                tv360.setText(String.valueOf(a8));
                setTotalUnits();
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et300.getText().toString());
                x=x+50;
                et300.setText(String.valueOf(x));
                unitList[6]=x;
                a7=unitList[6]*3.0;
                tv300.setText(String.valueOf(a7));
                setTotalUnits();
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et175.getText().toString());
                x=x+50;
                et175.setText(String.valueOf(x));
                unitList[1]=x;
                a2=unitList[1]*1.75;
                tv175.setText(String.valueOf(a2));
                setTotalUnits();
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et150.getText().toString());
                x=x+50;
                et150.setText(String.valueOf(x));
                unitList[0]=x;
                a1=unitList[0]*1.5;
                tv150.setText(String.valueOf(a1));
                setTotalUnits();
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et200.getText().toString());
                x=x+50;
                et200.setText(String.valueOf(x));
                unitList[2]=x;
                a3=unitList[2]*2.0;
                tv200.setText(String.valueOf(a3));
                setTotalUnits();
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et225.getText().toString());
                x=x+50;
                et225.setText(String.valueOf(x));
                unitList[3]=x;
                a4=unitList[3]*2.25;
                tv225.setText(String.valueOf(a4));
                setTotalUnits();
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(et250.getText().toString());
                x=x+50;
                et250.setText(String.valueOf(x));
                unitList[4]=x;
                a5=unitList[4]*2.5;
                tv250.setText(String.valueOf(a5));
                setTotalUnits();
            }
        });
        et360.addTextChangedListener(new MainActivity(et360,7));
        et300.addTextChangedListener(new MainActivity(et300,6));
        et275.addTextChangedListener(new MainActivity(et275,5));
        et250.addTextChangedListener(new MainActivity(et250,4));
        et225.addTextChangedListener(new MainActivity(et225,3));
        et200.addTextChangedListener(new MainActivity(et200,2));
        et175.addTextChangedListener(new MainActivity(et175,1));
        et150.addTextChangedListener(new MainActivity(et150,0));

    }

    public void setTotalUnits()
    {
        int s=0;
        for(int i=0;i<8;i++)
        {
            s+=unitList[i];
            }
        totalUnits.setText(String.valueOf(s));

        updateTotalRM();
    }

    public void updateTotalRM() {
        double k=a1+a2+a3+a4+a5+a6+a7+a8;
        totalRM.setText(String.valueOf(k));
        updateMT(k);
    }

    public void updateMT(double k) {
        k=k/78.74;
        //String.format("%.3g%n",k);
        totalMT.setText(String.format(Locale.US,"%.4g%n",k));
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        int x;
        if(!(e.getText().toString().equals("")))
            x=Integer.parseInt(e.getText().toString());
        else
            x=0;
        unitList[index]=x;
        for(int i=0;i<8;i++)
        {
            Log.i("UnitList "+i,String.valueOf(unitList[i]));
        }

    }

    @Override
    public void afterTextChanged(Editable s) {
    }
}
/*
if(!(totalUnits.toString().equals("")))
        totalUnits.setText(String.valueOf(s));
*/
