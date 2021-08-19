package com.example.golf_club;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.firebase.ui.auth.AuthUI;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;


public class MainHomePage extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);

    }

    public void Logout(View view) {
        if (view.getId() == R.id.sign_out) {
            AuthUI.getInstance()
                    .signOut(this)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        public void onComplete(@NonNull Task<Void> task) {
                            // user is now signed out
                            startActivity(new Intent(MainHomePage.this, Login.class));
                            finish();
                        }
                    });

        }
    }

    public void ustawi_view(View view){
        Intent intent = new Intent(this, Ustawi.class);
        startActivity(intent);


    }

    public void hadharani_view(View view){
        Intent intent = new Intent(this, Hadharani.class);
        startActivity(intent);
    }

    public void jambo_view(View view){
        Intent intent = new Intent(this, Jambo.class);
        startActivity(intent);
    }

    public void salama_view(View view){
        Intent intent = new Intent(this, Salama.class);
        startActivity(intent);
    }

}
