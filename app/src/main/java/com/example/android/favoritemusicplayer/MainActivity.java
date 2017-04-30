package com.example.android.favoritemusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Use SupportToolbar for logo purposes
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        // Remove default title text, logo in .xml
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        // Find the View that shows the favorite category
        TextView favorite = (TextView) findViewById(R.id.favorite);

        // Set a click listener on that View
        if (favorite != null) {
            favorite.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the favorites View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent favoriteIntent = new Intent(MainActivity.this, FavoriteActivity.class);
                    startActivity(favoriteIntent);
                }
            });

        }

        // Find the View that shows the favorite category
        TextView radio = (TextView) findViewById(R.id.radio);

        // Set a click listener on that View
        if (radio != null) {
            radio.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the favorites View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent radioIntent = new Intent(MainActivity.this, RadioSearchActivity.class);
                    startActivity(radioIntent);
                }
            });

        }

        // Find the View that shows the favorite category
        TextView musicOnDevice = (TextView) findViewById(R.id.musicOnDevice);

        // Set a click listener on that View
        if (musicOnDevice != null) {
            musicOnDevice.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the favorites View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent musicOnDeviceIntent = new Intent(MainActivity.this, MusicSerachOnDeviceActivity.class);
                    startActivity(musicOnDeviceIntent);
                }
            });

        }

        // Find the View that shows the favorite category
        TextView about = (TextView) findViewById(R.id.about);

        // Set a click listener on that View
        if (about != null) {
            about.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the favorites View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                    startActivity(aboutIntent);
                }
            });

        }

        // Find the View that shows the favorite category
        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);

        // Set a click listener on that View
        if (nowPlaying != null) {
            nowPlaying.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the favorites View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                    startActivity(nowPlayingIntent);
                }
            });

        }


    }
}
