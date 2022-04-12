package com.example.hobbytestactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private Button signout;
    private TextView usernameView;

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d("==>", "onCreate");
        usernameView = findViewById(R.id.profile_username);


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String username = extras.getString("username");

        usernameView.setText(username);

        signout = findViewById(R.id.signout_button);

        Log.d("==>", "Username from intent:"+username);

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Signout button pressed");
                finish();
            }
        });

    }

}