package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class InstelgActivity extends AppCompatActivity {
    private PDFView inste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_instelg);
        inste=(PDFView)findViewById(R.id.instelgpdf);
        inste.fromAsset("instelg.pdf").load();
    }
}
