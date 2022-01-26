package com.centaurus.relativelayoutexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.centaurus.relativelayoutexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.learnMore.setOnClickListener(v -> {
            Intent webIntent = new Intent(Intent.ACTION_VIEW);
            webIntent.setData(Uri.parse("https://en.wikipedia.org/wiki/Flora"));
            startActivity(webIntent);
        });

        /**
         * Intent(Intent.ACTION_VIEW)
         * .apply { data = Uri.parse("https://en.wikipedia.org/wiki/Flora)" }
         * .also { startActivity(it)}
         */
    }
}