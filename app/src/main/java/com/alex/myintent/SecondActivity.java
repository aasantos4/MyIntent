package com.alex.myintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    TextView tv_Greeting;
    Button btn_Return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_Greeting = (TextView) findViewById(R.id.tvGreeting);
        btn_Return = (Button) findViewById(R.id.btnReturn);

        String name = getIntent().getStringExtra("name");

        tv_Greeting.setText("Hello " + name);
    }

    public void goBackToMain (View view){
        Intent intent2 = new Intent (this, MainActivity.class);
        startActivity(intent2);
    }
}
