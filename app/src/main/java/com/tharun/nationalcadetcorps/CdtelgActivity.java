package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class CdtelgActivity extends AppCompatActivity {
    private PDFView cdte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cdtelg);
        cdte=(PDFView)findViewById(R.id.cdtelgpdf);
        cdte.fromAsset("cdtelg.pdf").load();

    }
}
