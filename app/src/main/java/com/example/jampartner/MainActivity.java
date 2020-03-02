package com.example.jampartner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button learning_btn = findViewById(R.id.learning_btn_id);
        Button practice_btn = findViewById(R.id.practice_button_id);

        learning_btn.setOnClickListener(this);
        practice_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.learning_btn_id:
                startActivity(new Intent(MainActivity.this, LearningActivity.class));
                break;
            case R.id.practice_button_id:
                startActivity(new Intent(MainActivity.this, PracticeActivity.class));
                break;
        }
    }
}
