package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class AcrActivity extends AppCompatActivity {
    private PDFView acr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_acr);
        acr=(PDFView)findViewById(R.id.acrpdf);
        acr.fromAsset("acr.pdf").load();

    }
}
