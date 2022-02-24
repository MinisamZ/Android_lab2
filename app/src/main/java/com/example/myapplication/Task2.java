package com.example.myapplication;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Task2 extends AppCompatActivity {
    private Button btn1;
    private EditText field1;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        btn1 = (Button) findViewById(R.id.buttonYearTask2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                field1 = (EditText) findViewById(R.id.editTextYearField);
                result = (TextView) findViewById(R.id.textViewTask2Result);
                int year = Integer.parseInt(field1.getText().toString());
                String checkingYear;
                if (year >= 0 && year <= 10000) {
                    checkingYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? "Год является високосным" : "Год не является високосным";
                    result.setTextColor(Color.rgb(0,160,0));
                } else {
                    checkingYear = "Год вне диапазона";
                    result.setTextColor(Color.RED);
                }
                result.setText(checkingYear);
                result.setTextSize(25);
            }
        });


    }
}