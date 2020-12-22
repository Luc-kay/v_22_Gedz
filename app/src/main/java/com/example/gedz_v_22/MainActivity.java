package com.example.gedz_v_22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

Button btnCreate;
private EditText editi;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreate = (Button) findViewById(R.id.btnCreate);

        btnCreate = (Button) findViewById(R.id.btnCreate);
    }

    @Override
    public void onClick (View view) {
     switch (view.getId()){
         case R.id.btnCreate:
             editi = findViewById(R.id.editTextTextPersonName);
             editi.setVisibility(View.VISIBLE);
             editi = findViewById(R.id.editTextTextPersonName2);
             editi.setVisibility(View.VISIBLE);
      break;
     }
    }
}