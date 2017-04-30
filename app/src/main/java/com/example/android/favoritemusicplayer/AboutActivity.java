package com.example.android.favoritemusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Find the View that go to the Radio Search category
        TextView backToMainActivity = (TextView) findViewById(R.id.back_about);

        // Set a click listener on that View
        if (backToMainActivity != null) {
            backToMainActivity.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent backToMainActivityIntent = new Intent(AboutActivity.this, MainActivity.class);
                    startActivity(backToMainActivityIntent);
                }
            });

        }

    }
}
