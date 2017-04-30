package com.example.android.favoritemusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MusicSerachOnDeviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_serach_on_device);

        // Find the View that go to the Radio Search category
        TextView favorites = (TextView) findViewById(R.id.favorites_music_on_device);

        // Set a click listener on that View
        if (favorites != null) {
            favorites.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent favoritesIntent = new Intent(MusicSerachOnDeviceActivity.this, FavoriteActivity.class);
                    startActivity(favoritesIntent);
                }
            });

        }

        // Find the View that go to the Radio Search category
        TextView radio = (TextView) findViewById(R.id.radio_search_music_on_device);

        // Set a click listener on that View
        if (radio != null) {
            radio.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent radioIntent = new Intent(MusicSerachOnDeviceActivity.this, RadioSearchActivity.class);
                    startActivity(radioIntent);
                }
            });

        }


        // Find the View that go to the Radio Search category
        TextView backToMainActivity = (TextView) findViewById(R.id.back_radio_music_on_device);

        // Set a click listener on that View
        if (backToMainActivity != null) {
            backToMainActivity.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent backToMyActivityIntent = new Intent(MusicSerachOnDeviceActivity.this, MainActivity.class);
                    startActivity(backToMyActivityIntent);
                }
            });

        }

    }
}
