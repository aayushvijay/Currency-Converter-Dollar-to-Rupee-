package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void click(View view){
        EditText text = findViewById(R.id.dollar);
        double d = Double.parseDouble((text.getText().toString()));
        double rupee = 71.39;
        double r = rupee * d;
        Toast.makeText(getApplicationContext(),"Indian Rupees  :  ₹"+ r,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
