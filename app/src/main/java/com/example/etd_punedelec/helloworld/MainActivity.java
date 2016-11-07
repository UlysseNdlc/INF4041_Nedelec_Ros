package com.example.etd_punedelec.helloworld;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv_hw = (TextView) findViewById(R.id.tv_hello_world);
        Button btn_hw = (Button) findViewById(R.id.btn_hello_world);
        final String now = "Ulysse apprend android";
        btn_hw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_hw.setText(now);
                Toast.makeText(getApplicationContext(), getString(R.string.msg), Toast.LENGTH_LONG).show();
            }
        });

        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                TextView tv_hw = (TextView) findViewById(R.id.tv_hello_world);
                String s=""+year+""+monthOfYear+""+dayOfMonth;
                tv_hw.setText(s);
            }

        };

        DatePickerDialog dpg = new DatePickerDialog(this, listener, 01,01,00);
       // dpg.show();
    }
}