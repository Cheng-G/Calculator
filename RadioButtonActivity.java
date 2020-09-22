package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RadioButtonActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_button);
        RadioButton changDu = findViewById(R.id.changDu);
        RadioButton tiJi = findViewById(R.id.tiJi);
        RadioButton jinZhi = findViewById(R.id.jinZhi);
        changDu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent in = new Intent(RadioButtonActivity.this, ChangDu.class);
                startActivity(in);

            }
        });

        tiJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(RadioButtonActivity.this, TiJi.class);
                startActivity(in);

            }
        });

        jinZhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(RadioButtonActivity.this, JinZhi.class);
                startActivity(in);

            }
        });

    }

}
