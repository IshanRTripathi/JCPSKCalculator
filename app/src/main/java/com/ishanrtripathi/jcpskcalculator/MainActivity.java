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
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText et360,et300,et275,et250,et225,et200,et175,et150,et125,et100;
    TextView tv360,tv300,tv275,tv250,tv225,tv200,tv175,tv150,tv125,tv100,totalUnits,totalRM,totalMT;
    double rmList[]=new double[10];
    int tuList[]=new int[10];
    Button reset;

    private static final String fileName="lastSavedData.txt";

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
        et125=findViewById(R.id.et125);
        et100=findViewById(R.id.et100);
        tv360=findViewById(R.id.tv360);
        tv300=findViewById(R.id.tv300);
        tv275=findViewById(R.id.tv275);
        tv250=findViewById(R.id.tv250);
        tv225=findViewById(R.id.tv225);
        tv200=findViewById(R.id.tv200);
        tv175=findViewById(R.id.tv175);
        tv150=findViewById(R.id.tv150);
        tv125=findViewById(R.id.tv125);
        tv100=findViewById(R.id.tv100);
        totalUnits=findViewById(R.id.totalUnits);
        totalRM=findViewById(R.id.totalRM);
        totalMT=findViewById(R.id.totalMT);
        reset=findViewById(R.id.unitsButton);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetAll();
            }
        });

        et360.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
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
        et125.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    tuList[8] = Integer.parseInt(s.toString());
                    rmList[8] = tuList[8] * 1.25;
                }catch (NumberFormatException e)
                {
                    tuList[8]=0;
                    rmList[8]=0;
                }
                tv125.setText(String.valueOf(rmList[8]));
                updateTU();
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        et100.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    tuList[9] = Integer.parseInt(s.toString());
                    rmList[9] = tuList[9] * 1.0;
                }catch (NumberFormatException e)
                {
                    tuList[9]=0;
                    rmList[9]=0;
                }
                tv100.setText(String.valueOf(rmList[9]));
                updateTU();
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
//        resetAll();
        try {
            loadData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void resetAll() {
        for(int i=0;i<10;i++)
        {
            tuList[i]=0;
            rmList[i]=0;
            updateTU();
        }
        tv150.setText(String.valueOf(rmList[0]));
        tv175.setText(String.valueOf(rmList[1]));
        tv200.setText(String.valueOf(rmList[2]));
        tv225.setText(String.valueOf(rmList[3]));
        tv250.setText(String.valueOf(rmList[4]));
        tv275.setText(String.valueOf(rmList[5]));
        tv300.setText(String.valueOf(rmList[6]));
        tv360.setText(String.valueOf(rmList[7]));
        tv125.setText(String.valueOf(rmList[8]));
        tv100.setText(String.valueOf(rmList[9]));
        et150.setText("");
        et175.setText("");
        et200.setText("");
        et225.setText("");
        et250.setText("");
        et275.setText("");
        et300.setText("");
        et360.setText("");
        et125.setText("");
        et100.setText("");
    }

    private void updateTU() {
        int s=0;
        for(int i=0;i<10;i++)
        {
            s+=tuList[i];
        }
        totalUnits.setText(String.valueOf(s));
        updateTRM();
        try {
            saveData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateTRM()
    {
        double s=0;
        for(int i=0;i<10;i++)
        {
            s+=rmList[i];
        }
        totalRM.setText(String.format(Locale.US,"%.5g%n",s));
        totalMT.setText(String.format(Locale.US,"%.4g%n",s/78.74));
    }

    private void saveData() throws IOException {
        FileOutputStream fileOutputStream;
        fileOutputStream=openFileOutput(fileName, MODE_PRIVATE);
        byte[] contents=(String.valueOf(tuList[0])+"\n"+String.valueOf(tuList[1])+
                "\n"+String.valueOf(tuList[2])+"\n"+String.valueOf(tuList[3])+
                "\n"+String.valueOf(tuList[4])+"\n"+String.valueOf(tuList[5])+
                "\n"+String.valueOf(tuList[6])+"\n"+String.valueOf(tuList[7])+
                "\n"+String.valueOf(tuList[8])+"\n"+String.valueOf(tuList[9])).getBytes();
        fileOutputStream.write(contents);
//        fileOutputStream.write(et360.getText().toString().getBytes());

//        Toast.makeText(this, "Saved : "+et360.getText().toString()+"\n"+getFilesDir()+"/"+fileName, Toast.LENGTH_LONG).show();
    }

    private void loadData() throws IOException{
        FileInputStream fileInputStream;
        fileInputStream=openFileInput(fileName);
        StringBuilder data= new StringBuilder();
        BufferedReader reader= new BufferedReader(new InputStreamReader(fileInputStream));

        String text;

        String []testArray;
        while((text=reader.readLine())!=null)
        {
            data.append(text).append("\n");
        }
        testArray=data.toString().split("\n");

//        Toast.makeText(this, ""+Arrays.toString(testArray), Toast.LENGTH_SHORT).show();
        et360.setText(testArray[0].equals("0") ?"":testArray[0]);
        et300.setText(testArray[1].equals("0") ?"":testArray[1]);
        et275.setText(testArray[2].equals("0") ?"":testArray[2]);
        et250.setText(testArray[3].equals("0") ?"":testArray[3]);
        et225.setText(testArray[4].equals("0") ?"":testArray[4]);
        et200.setText(testArray[5].equals("0") ?"":testArray[5]);
        et175.setText(testArray[6].equals("0") ?"":testArray[6]);
        et150.setText(testArray[7].equals("0") ?"":testArray[7]);
        et125.setText(testArray[8].equals("0") ?"":testArray[8]);
        et100.setText(testArray[9].equals("0") ?"":testArray[9]);
        Toast.makeText(this, "Loaded "+ Arrays.toString(testArray), Toast.LENGTH_SHORT).show();
    }
}
