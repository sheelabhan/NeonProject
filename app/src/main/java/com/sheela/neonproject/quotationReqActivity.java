package com.sheela.neonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quotationReqActivity extends AppCompatActivity {
     Button btnquotation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotation_req);
        btnquotation=findViewById(R.id.btnquotation);
        btnquotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(quotationReqActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });
    }
}