package com.mambure.sharedpreferenceexerciseapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class ProfileSavingActivity extends AppCompatActivity {

    private SharedPreferences preferences;
    private EditText inputName;
    private EditText inputAge;
    private EditText inputTel;
    private EditText inputEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_saving);

        inputName = findViewById(R.id.inputName);
        inputAge = findViewById(R.id.inputAge);
        inputTel = findViewById(R.id.inputTelephone);
        inputEmail = findViewById(R.id.inputEmail);

        // Initialize preferences
        preferences = getSharedPreferences(Keys.PREFERENCES_ID, Context.MODE_PRIVATE);
    }

    public void saveProfile(View view) {

        // Getting input data
        String name = inputName.getText().toString();
        String age = inputAge.getText().toString();
        String tel = inputTel.getText().toString();
        String email = inputEmail.getText().toString();

        if (name.isEmpty() || age.isEmpty() || tel.isEmpty() || email.isEmpty()) {
            Toast.makeText(this, "Please complete the profile!", Toast.LENGTH_SHORT).show();
            return;
        }

        // Get the preferences editor
        SharedPreferences.Editor editor = preferences.edit();

        // Adding data to the editor
        editor.putString(Keys.NAME, name);
        editor.putInt(Keys.AGE, Integer.parseInt(age));
        editor.putString(Keys.TELEPHONE, tel);
        editor.putString(Keys.EMAIL, email);
        editor.putBoolean(Keys.IS_FIRST_RUN, false);

        // Call commit() / apply() to save to save the data
        editor.apply();

        Intent intent = new Intent(this, ProfileDetailActivity.class);
        startActivity(intent);
        ActivityCompat.finishAffinity(this);
    }

}
