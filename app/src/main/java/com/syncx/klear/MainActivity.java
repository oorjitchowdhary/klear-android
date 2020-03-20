package com.syncx.klear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = mAuth.getCurrentUser();

        // TO DO
        /*if (user != null){
            Toast.makeText(this, "Welcome back!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, DashboardActivity.class));
        }*/
    }

    public void goToSignUp(View view){
        startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }

    public void goToLogin(View view){
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }
}
