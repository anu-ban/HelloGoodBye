package com.missouristate.arrafi.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HelloBye extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_bye);




    }

    public void btn_back(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }


}
