package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    EditText name, mail;
    public static final String Extra="com.example.multiscreen.NAME";
    public static final String Extra_Name="com.example.multiscreen.Mail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void openActivity(View view){
        Toast.makeText(this, "Opening the Second Activity", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity2.class);
        name=findViewById(R.id.editTextTextPersonName);
        mail=findViewById(R.id.editTextTextEmailAddress);
        String nameText=name.getText().toString();
        String mailText=mail.getText().toString();
        intent.putExtra(Extra,nameText);
        intent.putExtra(Extra_Name,mailText);
        startActivity(intent);



    }
}