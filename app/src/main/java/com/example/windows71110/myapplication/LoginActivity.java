package com.example.windows71110.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText tvUserName = null;
    private EditText tvPassword = null;
    private Button btnLogin = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tvUserName = (EditText) super.findViewById(R.id.userName);
        tvPassword = (EditText) super.findViewById(R.id.passWord);
        btnLogin = (Button) super.findViewById(R.id.login);
        //设置监听按钮点击事件
        btnLogin.setOnClickListener(new LoginActivity.LoginOnClickListener());
    }
    private class LoginOnClickListener implements View.OnClickListener {
        public void onClick(View v) {
            String username = tvUserName.getText().toString();
            String password = tvPassword.getText().toString();
            String info = "用户名：" + username + "=====密码：" + password;
            Toast.makeText(getApplicationContext(), info, Toast.LENGTH_SHORT).show();
        }
    }
}
