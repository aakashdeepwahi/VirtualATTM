package com.example.virtualatm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WithdrawActivity extends AppCompatActivity {
    EditText amount, acc_no, PhoneNo;
    Button confirm;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw);

        amount = findViewById(R.id.amount);
        acc_no = findViewById(R.id.emailPhone);
        PhoneNo = findViewById(R.id.passWord);

        confirm = findViewById(R.id.SignUp);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                amount.setError(null);
                acc_no.setError(null);
                PhoneNo.setError(null);

                if (amount.getText().toString().isEmpty()) {
                    amount.setError("Field can't be empty");
                }

                if (acc_no.getText().toString().isEmpty()) {
                    acc_no.setError("Field can't be empty");
                    return;
                }
                if (PhoneNo.getText().toString().isEmpty()) {
                    PhoneNo.setError("Field can't be empty");
                    return;
                }
                startActivity(new Intent(getApplicationContext(), ConfirmActivity.class));
            }
        });


    }

    public void back (View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
