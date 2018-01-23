package com.shady_selim.newjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        if (intent.hasExtra("joke")) {
            TextView newJoke = (TextView) findViewById(R.id.newJoke);
            newJoke.setText(intent.getStringExtra("joke"));
        }
    }
}
