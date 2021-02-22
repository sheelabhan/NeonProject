package com.sheela.neonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class CartActivity extends AppCompatActivity {
   EditText etquantity;
   CircleImageView imgimage;
   TextView txtcart, txtTitle, txtdescription, txtprice, txtTotal, txttotalprice, txtdelivery;
    Button btnincrement, btndecrement, btnCheckout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        etquantity=findViewById(R.id.etquantity);
        imgimage=findViewById(R.id.imgimage);
        txtcart=findViewById(R.id.txtCart);
        txtTitle=findViewById(R.id.txttitle);
        txtdescription=findViewById(R.id.txtdescription);
        txtprice=findViewById(R.id.txtprice);
        txtTotal=findViewById(R.id.txtTotal);
        txttotalprice=findViewById(R.id.txtTotalprice);
        txtdelivery=findViewById(R.id.txtdelivery);
        btnincrement=findViewById(R.id.btnincrement);
        btndecrement=findViewById(R.id.btndecrement);
        btnCheckout=findViewById(R.id.btnCheckout);
        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}