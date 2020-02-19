package com.mambure.sharedpreferenceexerciseapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing the shared preferences
        SharedPreferences preferences = getSharedPreferences(Keys.PREFERENCES_ID, Context.MODE_PRIVATE);

        // getting boolean value
        boolean isFirstRun = preferences.getBoolean(Keys.IS_FIRST_RUN, true);


        if (isFirstRun) {
            Intent intent = new Intent(this, ProfileSavingActivity.class);
            startActivity(intent);
        }else {
            Intent intent = new Intent(this, ProfileDetailActivity.class);
            startActivity(intent);
        }

        ActivityCompat.finishAffinity(this);
    }
}
