package com.example.kbluue_.ALC;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.kbluue_.ALC.R.*;

/**
 * Created by _kbluue_ on 7/11/2019.
 *
 */

class Person {

    private final String name, track, country, email, phoneNumber, slackUsername;
    private final int imgPath;

    Person(String name, String track, String country, String email, String phoneNumber, String slackUsername, int imgPath) {
        this.name = name;
        this.track = track;
        this.country = country;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.slackUsername = slackUsername;
        this.imgPath = imgPath;
    }

    void meld(Activity host){
        ((TextView)host.findViewById(id.name)).setText(name);
        ((TextView)host.findViewById(id.track)).setText(track);
        ((TextView)host.findViewById(id.country)).setText(country);
        ((TextView)host.findViewById(id.email)).setText(email);
        ((TextView)host.findViewById(id.phone_number)).setText(phoneNumber);
        ((TextView)host.findViewById(id.slack_username)).setText(slackUsername);
        if (imgPath <= 0) ((ImageView)host.findViewById(id.picture)).setImageResource(imgPath);
    }
}
