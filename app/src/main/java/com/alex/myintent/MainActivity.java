package com.alex.myintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_Name;
    Button btn_Send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Name = (EditText) findViewById(R.id.etName);
        btn_Send = (Button) findViewById(R.id.btnSend);

    }

    public void callSecondActivity(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name",et_Name.getText().toString());
        startActivity(intent);
    }
}
