package com.sheela.neonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoriesActivity extends AppCompatActivity {
   Button btncategories, btnbrands;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        btncategories= findViewById(R.id.btncategories);
        btnbrands=findViewById(R.id.btnbrands);
        btnbrands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(CategoriesActivity.this, CartImageActivity.class);
                startActivity(intent);
            }
        });
    }
}