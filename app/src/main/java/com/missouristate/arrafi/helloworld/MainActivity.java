package com.missouristate.arrafi.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //This bellow code describes that the button clickMe can be only use in this activity
    // by putting private infront of the Button fuction we are make sure it cannot be accesed or viewed by other class
    private Button clickMe;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Assinging the clickMe variable with the activity_main.xml button pallet
        clickMe = findViewById(R.id.btnClick);
    //In This class I'm using setOnClickListener function to override the onClick methode
        //I have done the opposite on the HelloBye.java activity

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            //this methode will be active when the user press clickMe button
            public void onClick(View view) {
                openHelloBye();
                //This is calling for the openHelloBye methode after user click the button on click
            }
        });
    }
    //I made it private coz Im not using this methode outside this class;
    private void openHelloBye(){
        Intent intent = new Intent(this, HelloBye.class);
        startActivity(intent);
    }




}
