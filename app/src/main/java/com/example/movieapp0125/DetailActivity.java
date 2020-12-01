package com.example.movieapp0125;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String title = getIntent().getStringExtra("EXTRA_TITLE");
        String year = getIntent().getStringExtra("EXTRA_YEAR");
        String image = getIntent().getStringExtra("EXTRA_IMAGE");

        TextView txtTitle = findViewById(R.id.txtTitle);
        TextView txtYear = findViewById(R.id.txtYear);
        ImageView imgPoster = findViewById(R.id.imgPoster);

        txtTitle.setText(title);
        txtYear.setText(year);

        Glide.with(this)
                .load("https://themoviedb.org/t/p/w200"+image.toString())
                .into(imgPoster);
    }
}
