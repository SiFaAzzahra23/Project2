package com.example.project2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText editText;
RadioButton radio4;
RadioButton radio5;
RadioButton radio6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextPhone);
        radio4=findViewById(R.id.radioButton4);
        radio5=findViewById(R.id.radioButton5);
        radio6=findViewById(R.id.radioButton6);
    }

    public void showText(View view) {
        String nophone=editText.getText().toString();
        String pilih = "";
        if(radio4.isChecked()) {
            pilih = "Telepon Rumah";
        } else if (radio5.isChecked()) {
            pilih = "Handphone";
        } else if (radio6.isChecked()) {
            pilih = "Telepon Kantor";
        }

        android.widget.Toast.makeText(this, "Nomor: " + nophone + "\nTipe: " + pilih, android.widget.Toast.LENGTH_SHORT).show();
    }
}