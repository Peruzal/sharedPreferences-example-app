package com.mambure.sharedpreferenceexerciseapp;

import android.content.Context;
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

        // Initialize our profile preferences
        preferences = getSharedPreferences(Keys.PREFERENCES_ID, Context.MODE_PRIVATE);

        // Read data from profile preferences (Normally this is done in another thread to avoid blocking the UI thread!)
        String name = preferences.getString(Keys.NAME, "name");
        int age = preferences.getInt(Keys.AGE, 0);
        String telephone = preferences.getString(Keys.TELEPHONE, "None");
        String email = preferences.getString(Keys.EMAIL, "none");

        txtName.setText(name);
        txtAge.setText(String.valueOf(age));
        txtTelephone.setText(telephone);
        txtEmail.setText(email);
    }

    public void deleteProfile(View view) {

        // Delete all the values from the shared preferences
        preferences.edit().clear().apply();

        Intent intent = new Intent(this, LauncherActivity.class);
        startActivity(intent);
    }
}
