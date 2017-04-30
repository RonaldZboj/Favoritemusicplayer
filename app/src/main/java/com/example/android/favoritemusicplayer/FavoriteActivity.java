package com.example.android.favoritemusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        // Find the View that go to the Radio Search category
        TextView radioFavorite = (TextView) findViewById(R.id.radio_favorite);

        // Set a click listener on that View
        if (radioFavorite != null) {
            radioFavorite.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent radioFavoriteIntent = new Intent(FavoriteActivity.this, RadioSearchActivity.class);
                    startActivity(radioFavoriteIntent);
                }
            });

        }

        TextView musicSearchOnDeviceFavorite = (TextView) findViewById(R.id.musicOnDevice_favorite);

        // Set a click listener on that View
        if (musicSearchOnDeviceFavorite != null) {
            musicSearchOnDeviceFavorite.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent musicSearchOnDeviceFavoriteIntent = new Intent(FavoriteActivity.this, MusicSerachOnDeviceActivity.class);
                    startActivity(musicSearchOnDeviceFavoriteIntent);
                }
            });

        }

        TextView backToMainActivity = (TextView) findViewById(R.id.back_favorite);

        // Set a click listener on that View
        if (backToMainActivity != null) {
            backToMainActivity.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent backToMainActivityIntent = new Intent(FavoriteActivity.this, MainActivity.class);
                    startActivity(backToMainActivityIntent);
                }
            });

        }

    }
}

