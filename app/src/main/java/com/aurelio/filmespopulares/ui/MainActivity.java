package com.aurelio.filmespopulares.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aurelio.filmespopulares.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_filmes);
    }
}