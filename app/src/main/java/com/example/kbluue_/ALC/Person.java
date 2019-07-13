package com.example.kbluue_.ALC;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.kbluue_.ALC.R.*;

/**
 * Created by _kbluue_ on 7/11/2019.
 */

public class Person {

    private String name, track, country, email, phoneNumber, slackUsername;
    private int imgPath;

    public Person(String name, String track, String country, String email, String phoneNumber, String slackUsername, int imgPath) {
        this.name = name;
        this.track = track;
        this.country = country;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.slackUsername = slackUsername;
        this.imgPath = imgPath;
    }

    public String getName() {
        return name;
    }

    public String getTrack() {
        return "Track: " + track;
    }

    public String getCountry() {
        return "Country: " + country;
    }

    public String getEmail() {
        return "Email: " + email;
    }

    public String getPhoneNumber() {
        return "Phone Number: " + phoneNumber;
    }

    public String getSlackUsername() {
        return "Slack Username: @" + slackUsername;
    }

    public int getImgPath() {
        return imgPath;
    }

    public void setImgPath(int imgPath) {
        this.imgPath = imgPath;
    }

    public void meld(Activity host){
        ((TextView)host.findViewById(id.name)).setText(getName());
        ((TextView)host.findViewById(id.track)).setText(getTrack());
        ((TextView)host.findViewById(id.country)).setText(getCountry());
        ((TextView)host.findViewById(id.email)).setText(getEmail());
        ((TextView)host.findViewById(id.phone_number)).setText(getPhoneNumber());
        ((TextView)host.findViewById(id.slack_username)).setText(getSlackUsername());
        if (imgPath != -1) ((ImageView)host.findViewById(id.picture)).setImageResource(getImgPath());
    }
}
