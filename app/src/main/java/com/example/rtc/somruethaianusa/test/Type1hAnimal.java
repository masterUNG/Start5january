package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1hAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1h_animal);
    }
    public void onClickoi (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton83);
        Intent intent = new Intent(Type1hAnimal.this,Type1iAnimal.class);
        startActivity(intent);
        finish();
    }
}
