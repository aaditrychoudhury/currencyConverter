package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view){
        EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarAmountEditText);
        Double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());
        Double indianAmount = dollarAmountDouble * 72.77;
        Log.i("Amount", dollarAmountEditText.getText().toString());
        TextView textView = (TextView) findViewById(R.id.textView);
        Button convert = (Button) findViewById(R.id.convert);
        String ruppes =  indianAmount.toString();
        textView.setText(ruppes);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}