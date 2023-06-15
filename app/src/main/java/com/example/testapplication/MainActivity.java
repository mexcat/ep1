package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = this;
        EditText etNombre = findViewById(R.id.etNombre);
        Button btnSaludo = findViewById(R.id.btnSaludo);
        btnSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence text = etNombre.getText().toString();

                Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG) ;
                toast.show();

            }
        });
    }

}