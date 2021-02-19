package com.sheela.neonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
   TextView txtemail, txtusername, txtpassword, txtterms, txtpolicy, txtsignin;
     Button btnRegister;
     EditText etemail, etusername, etpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        txtemail=findViewById(R.id.txtemail);
        txtusername=findViewById(R.id.txtusername);
        txtpassword=findViewById(R.id.txtpassword);
        txtterms=findViewById(R.id.txtterms);
        txtpolicy=findViewById(R.id.txtpolicy);
        txtsignin=findViewById(R.id.txtsignin);
        btnRegister=findViewById(R.id.btnRegister);
        etemail=findViewById(R.id.etemail);
        etusername=findViewById(R.id.etusername);
        etpassword=findViewById(R.id.etpassword);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}