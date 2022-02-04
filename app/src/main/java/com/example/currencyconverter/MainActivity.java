package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radiogroup;
    RadioButton radiobutton1;
    RadioButton radiobutton2;
    EditText number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.num);
        radiobutton1=findViewById(R.id.r1);
        radiobutton2=findViewById(R.id.r2);

        Button buttonApply = findViewById(R.id.button_apply);

        buttonApply.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Double total;
                Double amount = Double.parseDouble(number.toString());

                if (radiobutton1.isChecked()) {

                    total = amount * 22000;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_SHORT).show();
                }

                else if (radiobutton2.isChecked()) {

                    total = amount / 22000;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_SHORT).show();
                }

            }
        }
        );

    }

}


