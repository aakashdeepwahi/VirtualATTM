package com.example.virtualatm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
    }

    public void withdrawAgain (View view) {
        startActivity(new Intent(getApplicationContext(), WithdrawActivity.class));
    }

    public void finish (View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
