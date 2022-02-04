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
    RadioGroup radioGroup;
    RadioButton radioButton;
    EditText number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        number = (EditText) findViewById(R.id.num);
}
    public void Convert(View view) {

        Double total;
        Double amount = Double.parseDouble(number.toString());

        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(selectedId);

        if (radioButton.getText().equals("USD"))
            total = amount * 22000;

        else{

            total = amount / 22000;
        }
        Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_SHORT).show();
    }
}


