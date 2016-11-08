package com.example.etd_punedelec.helloworld;

import android.app.DatePickerDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.NotificationCompat;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat.Builder;

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
                notification();
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

    public void notification(){
        NotificationCompat.Builder myBuilder = (NotificationCompat.Builder) new NotificationCompat.Builder(this).setSmallIcon(R.drawable.ic_stat_name).setContentTitle("My Notification").setContentText("Vous avez une notification");
        NotificationManager myNotificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        myNotificationManager.notify(1, myBuilder.build());

    }
}