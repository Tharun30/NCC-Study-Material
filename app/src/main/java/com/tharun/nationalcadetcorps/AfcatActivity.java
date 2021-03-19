package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class AfcatActivity extends AppCompatActivity {
    private PDFView afcat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_afcat);
        afcat=(PDFView)findViewById(R.id.afcatpdf);
        afcat.fromAsset("AFCAT.pdf").load();
    }
}
