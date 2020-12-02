package com.example.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

/**
 * @author miguel
 * @see LoginActivity
 * @see MainActivity2
 */
public class MainActivity extends AppCompatActivity {
    protected Button mainButton;
    protected ImageView perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        perfil = (ImageView) findViewById(R.id.imagePerfil);

        Glide.with(this)
                .load(R.drawable.cara).centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade(500))
                .circleCrop().into(perfil);


    }

    public void openMain2(View view) {
        Intent intent = new Intent(MainActivity
                .this, MainActivity2.class);
        startActivity(intent);
    }
}