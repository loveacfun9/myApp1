package com.example.beautifulflower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dao.helper;

public class login extends AppCompatActivity {
    private TextView user_1;
    private TextView pass_1;
    private EditText user_2;
    private EditText pass_2;
    private Button log;
    private Button log_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        log = findViewById(R.id.log);
        log_2 = findViewById(R.id.log_2);
        log_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,register.class);
                startActivity(intent);
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
          public void onClick(View view) {
                helper login_1 = new helper(login.this);
                if(login_1.log(user_2.getText().toString(),pass_2.getText().toString())){
                    Toast.makeText(getApplicationContext(),"登录成功",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"未注册",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
