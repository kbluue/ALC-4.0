package com.example.kbluue_.ALC;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MyProfile extends AppCompatActivity {

    Person me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        me = new Person("Ibeh Kennedy",
                "Android",
                "Nigeria",
                "kbluue@gmail.com",
                "2348164431389",
                "kbluue",
                R.drawable.img);
        me.meld(this);
    }
}
