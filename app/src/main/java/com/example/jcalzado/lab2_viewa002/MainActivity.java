package com.example.jcalzado.lab2_viewa002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inTextField1, inTextField2;
    private TextView outTextField;
    private RadioButton radioS, radioR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inTextField1 = (EditText) findViewById(R.id.inTextField1);
        inTextField2 = (EditText) findViewById(R.id.inTextField2);
        outTextField = (TextView) findViewById(R.id.outTextField);
        radioS = (RadioButton) findViewById(R.id.radioSumar);
        radioR = (RadioButton) findViewById(R.id.radioRestar);
    }

    public void operar (View v) {
        int numero1 = Integer.parseInt(inTextField1.getText().toString());
        int numero2 = Integer.parseInt(inTextField2.getText().toString());
        if (radioS.isChecked()) {
            outTextField.setText(String.valueOf(numero1+numero2));
        } else if (radioR.isChecked()) {
            outTextField.setText(String.valueOf(numero1-numero2));
        }
    }
}
