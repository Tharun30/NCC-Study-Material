package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class AwardsActivity extends AppCompatActivity {
    private PDFView awards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_awards);
        awards=(PDFView)findViewById(R.id.awardspdf);
        awards.fromAsset("ga.pdf").load();
    }
}
