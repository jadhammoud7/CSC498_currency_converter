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
        usd = (EditText) findViewById(R.id.usd);
        lbp = (EditText) findViewById(R.id.lbp);
    }

    public void check_amount(View v) {
        String usd1 = usd.getText().toString();
        String lbp1 = lbp.getText().toString();
        if(usd1!=null){
            int result=0;
            result=22000*Integer.parseInt(usd1);
            String s=result+"";
            lbp.setText(s);
        }

    }
}
