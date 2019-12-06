package com.example.firebaseassistanttest;

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

        Button firebaseBtn=(Button)findViewById(R.id.firebaseAuthBtn);
        firebaseBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.firebaseAuthBtn:
                Intent i = new Intent(this,AuthActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
