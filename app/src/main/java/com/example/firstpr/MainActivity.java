package com.example.firstpr;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text_result;
    Button one,two, three, four, five, six, seven, eight, nine, zero , divide, multiply, minus, plus,equals;

    String currentValue = "";
    String operation = "";


    int first = 0;
    int second = 0;

    boolean firstSet = false;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setVariables();
        setButtonsListeners();


    }

    public void setVariables(){
        text_result = findViewById(R.id.text_result);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        divide = findViewById(R.id.divide);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        plus = findViewById(R.id.plus_button);
        equals = findViewById(R.id.equals_button);


    }
public void setVal(int value){
        if(!firstSet){
            first = value;
            firstSet = true;

        }else{
            second = value;
        }



}
    public void setButtonsListeners(){
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue += "1";
                Log.e("Value",currentValue);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue += "2";
                Log.e("Value",currentValue);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue += "3";
                Log.e("Value",currentValue);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue += "4";
                Log.e("Value",currentValue);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue += "5";
                Log.e("Value",currentValue);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue += "6";
                Log.e("Value",currentValue);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue += "7";
                Log.e("Value",currentValue);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue += "8";
                Log.e("Value",currentValue);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue += "9";
                Log.e("Value",currentValue);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue += "0";
                Log.e("Value",currentValue);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation.equals(""))
                    setVal(Integer.parseInt(currentValue));
                operation = "+";
                currentValue ="";
                displayText(first + operation);

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation.equals(""))
                    setVal(Integer.parseInt(currentValue));
                operation = "*";
                currentValue ="";
                displayText(first + operation);

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation.equals(""))
                    setVal(Integer.parseInt(currentValue));
                operation = "-";
                currentValue ="";
                displayText(first + operation);

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation.equals(""))
                    setVal(Integer.parseInt(currentValue));
                operation = "/";
                currentValue ="";
                displayText(first + operation);

            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!currentValue.equals("")) second = Integer.parseInt(currentValue);
                if(operation.equals("+")) first += second;
                if(operation.equals("-")) first -= second;
                if(operation.equals("/")) first /= second;
                if(operation.equals("*")) first *= second;
                second = 0;
                    currentValue = String.valueOf(first);
                    operation = "";
                    firstSet = false;
                displayText(String.valueOf(first));
            }
        });
    }

public void displayText(String display){
        text_result.setText(display);
}



}