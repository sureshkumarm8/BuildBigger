package com.example.uiandroidlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeUIActivity extends AppCompatActivity {

    public static String JOKE_KEY= "joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_ui);

        TextView jokeview = (TextView) findViewById(R.id.joke_text);

        String joke = null;
        Intent intent = getIntent();
        joke = intent.getStringExtra(JokeUIActivity.JOKE_KEY);

        if (joke != null){
            jokeview.setText(joke);
        }else {
            jokeview.setText(R.string.no_joke_string);
        }
    }
}
