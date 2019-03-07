package com.e.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

EditText e_mail,passw;
Button button;
String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e_mail = findViewById(R.id.editText);
        passw = findViewById(R.id.editText2);
        button = findViewById(R.id.button);

        email = e_mail.getText().toString().trim();
        password = passw.getText().toString().trim();

        SharedPreferences sharedPreferences = getSharedPreferences("myfile", MODE_PRIVATE);
        SharedPreferences.Editor editor1 = sharedPreferences.edit();
        SharedPreferences.Editor editor2 = sharedPreferences.edit();

        editor1.putString("name", "akash");
        editor2.putString("passw", "123456");
        editor1.apply();







        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferences = getSharedPreferences("myfile", MODE_PRIVATE);
                String email = sharedPreferences.getString("email", "akash");
                String password = sharedPreferences.getString("password", "123456");


                email = e_mail.getText().toString().trim();
                password = passw.getText().toString().trim();

                if(email.equals(email) && password.equals(password))
                {
                    startActivity(new Intent(MainActivity.this,Main2Activity.class));
                }
                else{
                    Toast.makeText(MainActivity.this,"mismatch",Toast.LENGTH_SHORT).show();
                }
            }
        });











    }







}
