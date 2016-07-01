package com.example.kisa.myscheduleapp;

import android.app.DatePickerDialog.OnDateSetListener;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class MyActivity extends FragmentActivity implements OnDateSetListener {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        textView = (TextView)findViewById(R.id.textView);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

        textView.setText( String.valueOf(year)  + "/ " + String.valueOf(monthOfYear + 1) + "/ " + String.valueOf(dayOfMonth) );

    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePick();
        newFragment.show(getSupportFragmentManager(), "datePicker");

    }
}