package com.example.lab6_2;

import android.app.SearchManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSignIn;
    Button btnReg;
    TextView tvOut;
    EditText login;
    EditText pswrd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignIn = (Button) findViewById(R.id.button);
        btnReg = (Button) findViewById(R.id.button2);
        tvOut = (TextView) findViewById(R.id.tvOut);
        login = (EditText) findViewById(R.id.login);
        pswrd = (EditText) findViewById(R.id.pswrd);

        View.OnClickListener oclBtnSignIn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //if(login.getText() = "admin" || pswrd.getText() = "admin")
               // {
                //    tvOut.setText("Автогризавция успешно пройдена");
               // }
            }
        };
    }
}