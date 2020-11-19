package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtValorA;
    private EditText txtValorB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtValorA = findViewById(R.id.txtValorA);
        txtValorB = findViewById(R.id.txtValorB);
    }

    public void SumarNum(View view) {
        int a = Integer.parseInt(txtValorA.getText().toString());
        int b = Integer.parseInt(txtValorB.getText().toString());
        int c = a+b;
        Toast.makeText(this,"la sema es "+c,Toast.LENGTH_LONG).show();
    }
}