package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Task1 extends AppCompatActivity {
    private Button btn4;
    private TextView textView5;
    private EditText field1, field2, field3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        textView5 = (TextView) findViewById(R.id.textView3);
        btn4 = (Button) findViewById(R.id.task1Button);
        field1 = (EditText) findViewById(R.id.editTextFirstNum);
        field2 = (EditText) findViewById(R.id.editTextSecondNum);
        field3 = (EditText) findViewById(R.id.editTextTextThirdNum);
        textView5 = (TextView) findViewById(R.id.textView5);
        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                double firstNum = Double.parseDouble(field1.getText().toString());
                double secondNum = Double.parseDouble(field2.getText().toString());
                double thirdNum = Double.parseDouble(field3.getText().toString());
                double finalsum = 0;
                if (firstNum > secondNum)
                    finalsum = firstNum;
                else if (secondNum > firstNum)
                    finalsum = secondNum;
                else if (thirdNum > firstNum)
                    finalsum = thirdNum;
                else if (thirdNum > secondNum)
                    finalsum = thirdNum;
                else
                    finalsum = firstNum;
                textView5.setText(Double.toString(finalsum));

//                int length = Integer.parseInt(num1.getText().toString());
//                int width = Integer.parseInt(num2.getText().toString());
//                int height = Integer.parseInt(num3.getText().toString());
//                Cuboid cub = new Cuboid(length, width, height);
//                view1.setText(Double.toString(cub.getVolume()));

            }
        });
    }

}