package com.example.button3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);

    }

    public void clicked(View view) {
        num++;
        btn.setText("this is click number: "+num);
        if (num==6){
            btn.setText("Enough to click. Go to new start!");
            num=0;
        }

    }
}