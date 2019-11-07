package com.example.androidsimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.androidsimplecalculator.R.id.btn_one;
import static com.example.androidsimplecalculator.R.id.btn_reuslt;


public class MainActivity extends AppCompatActivity {
    float value2;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Num = findViewById(R.id.edt_num);
        btn0 = findViewById(R.id.btn_yero);
        btn1 = findViewById(R.id.btn_one);
        btn2 = findViewById(R.id.btn_two);
        btn3 = findViewById(R.id.btn_three);
        btn4 = findViewById(R.id.btn_four);
        btn5 = findViewById(R.id.btn_five);
        btn6 = findViewById(R.id.btn_six);
        btn7 = findViewById(R.id.btn_seven);
        btn8 = findViewById(R.id.btn_eight);
        btn9 = findViewById(R.id.btn_nine);
        Button add = findViewById(R.id.btn_add);
        Button plus = findViewById(R.id.btn_plus);
        Button multi = findViewById(R.id.btn_multi);
        Button divide = findViewById(R.id.btn_divide);
        Button result = findViewById(R.id.btn_reuslt);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num.setText(Num.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num.setText(Num.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num.setText(Num.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num.setText(Num.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num.setText(Num.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num.setText(Num.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num.setText(Num.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num.setText(Num.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num.setText(Num.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num.setText(Num.getText()+"9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num.setText(Num.getText()+ " + ");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num.setText(Num.getText()+" - ");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num.setText(Num.getText()+" X ");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num.setText(Num.getText()+" / ");
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = Num.getText().toString();
                String[] arr = str.split(" ");
                int result = Integer.parseInt((arr[0]));
                for(int i=1; i<arr.length;i++){
                    if (arr[i].equals("+")){
                        result += Integer.parseInt(arr[i+1]);
                    }
                    if (arr[i].equals("-")){
                        result -=Integer.parseInt(arr[i+1]);
                    }
                    if (arr[i].equals("X")){
                        result *=Integer.parseInt(arr[i+1]);
                    }
                    if (arr[i].equals("/")){
                        result /=Integer.parseInt((arr[i+1]));
                    }
                }
                Num.setText(""+result);
            }
        });
    }
}
