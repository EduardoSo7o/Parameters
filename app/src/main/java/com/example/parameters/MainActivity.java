package com.example.parameters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.et_name);
    }

    public void sendName(View view){
        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("name", etName.getText().toString());
        startActivity(intent);
    }
}