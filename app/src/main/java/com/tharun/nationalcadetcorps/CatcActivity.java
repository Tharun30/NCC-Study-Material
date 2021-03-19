package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class CatcActivity extends AppCompatActivity {
    private PDFView atc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_catc);
        atc=(PDFView)findViewById(R.id.catcpdf);
        atc.fromAsset("intro.pdf").load();
    }
}
