package com.example.thirthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Float first, second;
    private Boolean isClick = false;
    private String operations;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv_result);
    }

    public void onClickNumber(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("1");
                } else textView.append("1");
                if (isClick) {
                    textView.setText("1");
                }isClick = false;
                break;
            case R.id.btn_two:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                } else textView.append("2");
                if (isClick) {
                    textView.setText("2");
                }isClick = false;
                break;
            case R.id.btn_three:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("3");
                } else textView.append("3");
                if (isClick) {
                    textView.setText("3");
                }isClick = false;
                break;
            case R.id.btn_four:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("4");
                } else textView.append("4");
                if (isClick) {
                    textView.setText("4");
                }isClick = false;
                break;
            case R.id.btn_five:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("5");
                } else textView.append("5");
                if (isClick) {
                    textView.setText("5");
                }isClick = false;
                break;
            case R.id.btn_six:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("6");
                } else textView.append("6");
                if (isClick) {
                    textView.setText("6");
                }isClick = false;
                break;
            case R.id.btn_seven:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("7");
                } else textView.append("7");
                if (isClick) {
                    textView.setText("7");
                }isClick = false;
                break;
            case R.id.btn_eight:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("8");
                } else textView.append("8");
                if (isClick) {
                    textView.setText("8");
                }isClick = false;
                break;
            case R.id.btn_nine:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("9");
                } else textView.append("9");
                if (isClick) {
                    textView.setText("9");
                }
                isClick = false;
                break;
            case R.id.btn_zero:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("0");
                } else textView.append("0");
                if (isClick) {
                    textView.setText("0");
                }
                isClick = false;
                break;
            case R.id.btn_clear:
                textView.setText("0");
                break;
            case R.id.btn_dot:
                if (textView.getText().toString().equals("0")) {
                    textView.setText(".");
                } else {
                    textView.append(".");
                    if (isClick){
                        textView.setText(".");
                    }
                }
        }
        isClick = false;
    }


    public void onClickOperation(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Float.parseFloat(textView.getText().toString());
                operations = "+";
                isClick = true;
                break;
            case R.id.btn_multiplication:
                first = Float.parseFloat(textView.getText().toString());
                operations = "*";
                isClick = true;
                break;
            case R.id.btn_division:
                first = Float.parseFloat(textView.getText().toString());
                operations = "/";
                isClick = true;
                break;
            case R.id.btn_minus:
                first = Float.parseFloat(textView.getText().toString());
                operations = "-";
                isClick = true;
                break;


            case R.id.btn_percent:
                first = Float.parseFloat(textView.getText().toString());
                operations = "%";
                isClick = true;
                break;
            case R.id.btn_equal:
                second = Float.parseFloat(textView.getText().toString());
                Float result = 0.0f;
                switch (operations) {
                    case "+":
                        result = first + second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "/":
                        result = first / second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "%":
                        first = Float.parseFloat(textView.getText().toString());
                        //   isClick = true;
                        result = first / 100;
                        // textView.setText((result.toString()));
                        break;
                }
                textView.setText(result.toString());
                isClick = true;
                break;
        }
    }
}