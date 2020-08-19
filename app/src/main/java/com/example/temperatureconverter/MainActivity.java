package com.example.temperatureconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mainTextView = (TextView) findViewById(R.id.maintextview);
        final EditText numEditText = (EditText) findViewById(R.id.editTextNumber);
        final TextView textView2 = (TextView) findViewById(R.id.textView2) ;
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(numEditText.getText().toString());
                double result =  9.0 / 5.0 * (num) + 32;
                textView2.setText(result + "");

            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(numEditText.getText().toString());
                double result = 9.0/5.0 * (num - 273) + 32;
                textView2.setText(result + "");

        }
    });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(numEditText.getText().toString());
                int result = num + 273;
                textView2.setText(result + "");
            };
});
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(numEditText.getText().toString());
                int result = num - 273;
                textView2.setText(result + "");
    }});
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(numEditText.getText().toString());
                double result = num - 273;
                textView2.setText(result + "");
    }});
    };
}