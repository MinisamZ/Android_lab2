package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class Task3 extends AppCompatActivity {
    private Button btn1;
    private EditText field1;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        btn1 = (Button) findViewById(R.id.buttonNumberTask3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                field1 = (EditText) findViewById(R.id.editTextNumberField);
                result = (TextView) findViewById(R.id.textViewTask3Result);
                String reverse = field1.getText().toString();
                ArrayList<Integer> abc = new ArrayList<Integer>();
                for (String retval : reverse.split(",")) {
                    abc.add(Integer.parseInt(retval));
                    System.out.println(retval);
                }
                abc.sort(Collections.reverseOrder());
                String res = abc.toString();
//                result.setText(abc.toString());
                result.setText(res.substring(1, res.length() - 1));
                result.setTextColor(Color.rgb(0, 160, 0));
                result.setTextSize(25);
            }
        });


    }
}