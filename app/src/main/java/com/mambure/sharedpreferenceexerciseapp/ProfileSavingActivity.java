package com.mambure.sharedpreferenceexerciseapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileSavingActivity extends AppCompatActivity {

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
        Button button = findViewById(R.id.btnSave);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveProfile();
            }
        });

        // T

    }

    public void saveProfile() {

        // Getting input data
        String name = inputName.getText().toString();
        String age = inputAge.getText().toString();
        String tel = inputTel.getText().toString();
        String email = inputEmail.getText().toString();

        if (name.isEmpty() || age.isEmpty() || tel.isEmpty() || email.isEmpty()) {
            Toast.makeText(this, "Please complete the profile!", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO - Initialize the preferences


        // TODO - Add begin an editing transaction


        // TODO - Commit the transaction to save the data



        Intent intent = new Intent(this, ProfileDetailActivity.class);
        startActivity(intent);
        finish();
    }

}
