package com.example.beautifulflower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dao.helper;

public class register extends AppCompatActivity {
    TextView t1;
    TextView t2;
    TextView t3;
    EditText e1;
    EditText e2;
    EditText e3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rgister);
        t1 = findViewById(R.id.T_username);
        t2 = findViewById(R.id.R_username);
        t3 = findViewById(R.id.Re_username);
        e1 = findViewById((R.id.T_pwd));
        e2 = findViewById((R.id.R_pwd));
        e3 = findViewById((R.id.Re_pwd));
        b1 = findViewById(R.id.res);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helper res_1 = new helper(register.this);
                if (res_1.reg(register.this))
                    Toast.makeText(getApplicationContext(), "注册成功", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public String getUsername(){
        String string = e1.getText().toString();
        return string;
    }
    public String getPassword(){
        String string = e2.getText().toString();
        return string;
    }
}
