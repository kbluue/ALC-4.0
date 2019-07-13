package com.example.kbluue_.ALC;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {

        int id = view.getId();

        if (id == R.id.about_alc){
            startActivity(new Intent(this, AboutALC.class));
        } else if (id == R.id.my_profile){
            startActivity(new Intent(this, MyProfile.class));
        }
    }
}
