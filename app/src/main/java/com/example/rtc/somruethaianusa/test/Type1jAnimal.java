package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1jAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1j_animal);
    }
    public void onClickok (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton85);
        Intent intent = new Intent(Type1jAnimal.this,Type1kAnimal.class);
        startActivity(intent);
        finish();
    }
}
