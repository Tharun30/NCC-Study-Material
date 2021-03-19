package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class SportsActivity extends AppCompatActivity {
    private PDFView spr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sports);
        spr=(PDFView)findViewById(R.id.sportspdf);
        spr.fromAsset("sports.pdf").load();

    }
}
