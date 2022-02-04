package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usd;
    EditText lbp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usd=(EditText)findViewById(R.id.usd);
        lbp=(EditText)findViewById(R.id.lbp);
    }

    public void amount(View v){
        if(usd.getText().toString()!=null && lbp.getText().toString()==null){
            int result=0;
            result=22000*Integer.parseInt(usd.getText().toString());
            lbp.setText(result);
        }else{
            int result1=0;
            result1=Integer.parseInt(lbp.getText().toString())/22000;
            lbp.setText(result1);

        }

    }
}