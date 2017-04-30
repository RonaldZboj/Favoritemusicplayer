package com.example.android.favoritemusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class RadioSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_search);


        // Find the View that go to the Radio Search category
        TextView favorites = (TextView) findViewById(R.id.favorites_radio_search);

        // Set a click listener on that View
        if (favorites != null) {
            favorites.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent favoritesIntent = new Intent(RadioSearchActivity.this, FavoriteActivity.class);
                    startActivity(favoritesIntent);
                }
            });

        }
        // Find the View that go to the Radio Search category
        TextView music = (TextView) findViewById(R.id.musicOnDevice_radio_search);

        // Set a click listener on that View
        if (music != null) {
            music.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent musicIntent = new Intent(RadioSearchActivity.this, MusicSerachOnDeviceActivity.class);
                    startActivity(musicIntent);
                }
            });

        }

        // Find the View that go to the Radio Search category
        TextView backToMainActivity = (TextView) findViewById(R.id.back_radio_search);

        // Set a click listener on that View
        if (backToMainActivity != null) {
            backToMainActivity.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent backToMainActivityIntent = new Intent(RadioSearchActivity.this, MainActivity.class);
                    startActivity(backToMainActivityIntent);
                }
            });

        }

    }

}


