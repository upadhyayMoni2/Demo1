package com.example.a1894220.demo1;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

       String tag;
    EditText Text_name,Text_email,Text_password;
    Button Button_submit, button_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text_name = findViewById(R.id.Text_name);
        Text_email = findViewById(R.id.Text_email);
        Text_password = findViewById(R.id.Text_password);
        Button_submit = findViewById(R.id.button_submit);
        button_exit = findViewById(R.id.button_exit);


        Button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Text_name.getText().toString();
                String email = Text_email.getText().toString();


                Log.i(tag, name);
                Log.i(tag, email);
                Log.i(tag, Text_password.getText().toString());

                Toast.makeText(getApplicationContext(),"The Driver has cancelled", Toast.LENGTH_LONG).show();
            }
        });


        button_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("msg","bye bye");

    }
}
