package com.sheela.neonproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;



public class BankTransferActivity extends AppCompatActivity {
  Button btnAccount;
  CardView card;
  LinearLayout lnlinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_transfer);
        lnlinear=findViewById(R.id.lnlinear);
        card=findViewById(R.id.cardview);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             lnlinear.setVisibility(view.VISIBLE);
            }
        });

    }
}