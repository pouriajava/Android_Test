package com.example.tutorial001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText ed = findViewById(R.id.editTextTextPersonName);
        final TextView tv = findViewById(R.id.txthello);

        Button bn = findViewById(R.id.submit);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv.setText(ed.getText().toString());
                    }
                });
            }
        });
    }
}