package com.ishanrtripathi.jcpskcalculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Credits extends AppCompatActivity {

    ImageButton github, linkedin, shareApp, updateApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        github=findViewById(R.id.githubButton);
        linkedin=findViewById(R.id.linkedinButton);
        shareApp=findViewById(R.id.shareButton);
        updateApp=findViewById(R.id.updateButton);


        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://github.com/IshanRTripathi"));
                startActivity(viewIntent);
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.linkedin.com/in/ishanr/"));
                startActivity(viewIntent);
            }
        });

        shareApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String URL="*Download the best app for cement sheet calculation !!*\n\n" +
                        "\nDownload *JCPSK Calculator* for free\n\n\n*https://play.google.com/store/apps/details?id=com.ishanrtripathi.jcpskcalculator*";
                shareIntent.putExtra(Intent.EXTRA_TEXT, URL);
                startActivity(Intent.createChooser(shareIntent, "Share app via"));
            }
        });

        updateApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=com.ishanrtripathi.jcpskcalculator")));
            }
        });
    }
}
