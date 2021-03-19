package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.github.barteksc.pdfviewer.PDFView;

public class AboutcetActivity extends AppCompatActivity {
    private PDFView abtc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_aboutcet);
        abtc=(PDFView) findViewById(R.id.aboutcetpdf);
        abtc.fromAsset("about cet.pdf").load();

    }
}
