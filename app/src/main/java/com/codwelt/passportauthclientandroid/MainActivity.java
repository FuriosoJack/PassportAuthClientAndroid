package com.codwelt.passportauthclientandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.github.cdimascio.dotenv.Dotenv;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Dotenv dot = Dotenv.configure().directory("/assets").filename("env.txt").load();
        String clien = dot.get("CLIENT_ID");
        Log.d("CLIEN", clien);
    }
}
