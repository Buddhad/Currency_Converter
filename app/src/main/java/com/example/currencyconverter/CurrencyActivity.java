package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CurrencyActivity extends AppCompatActivity {

    Button mLogout;
    Button mData;

    public  void btnClick( View view ){
        EditText dollarAmount = (EditText) findViewById(R.id.mail);

        String dollars = dollarAmount .getText().toString();
        Double doubleDollars = Double.parseDouble(dollars);
        Double doubleInr = 74.39 * doubleDollars;
        String textToast =" " + doubleInr.toString() + "₹";

        Toast.makeText(this, textToast, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        mLogout = findViewById(R.id.Logout);
        mData =findViewById(R.id.Data);

        mLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CurrencyActivity.this, "Logout Successfully ", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
//        mData.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText dollarAmount = (EditText) findViewById(R.id.mail);
//
//                String dollars = dollarAmount .getText().toString();
//                Double doubleDollars = Double.parseDouble(dollars);
//                Double doubleInr = 74.39 * doubleDollars;
//                String textToast =" " + doubleInr.toString() + "₹";
//                Toast.makeText(CurrencyActivity.this, "", Toast.LENGTH_LONG).show();
//            }
//        });
    }
}