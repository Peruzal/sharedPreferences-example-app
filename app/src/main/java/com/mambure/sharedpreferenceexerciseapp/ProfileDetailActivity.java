package com.mambure.sharedpreferenceexerciseapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileDetailActivity extends AppCompatActivity {

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_detail);

        TextView txtName = findViewById(R.id.txtName);
        TextView txtAge = findViewById(R.id.txtAge);
        TextView txtTelephone = findViewById(R.id.txtTelephone);
        TextView txtEmail = findViewById(R.id.txtEmail);

        // TODO - Initialize the preferences


        // TODO - Read the data from the preference file


        // TODO - Show the read data

    }

    public void deleteProfile(View view) {

        // TODO - Delete all the values from the preference


        Intent intent = new Intent(this, LauncherActivity.class);
        startActivity(intent);
    }
}
