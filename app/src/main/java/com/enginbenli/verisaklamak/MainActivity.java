package com.enginbenli.verisaklamak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextNumberyas);
        textView = findViewById(R.id.textViewVeri);
    }
    public void kaydet(View view){
        if(!editText.getText().toString().matches("")){
            int age = Integer.parseInt(editText.getText().toString());
            textView.setText("Senin yasın: " + age);

        }

    }
}