package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class NdaActivity extends AppCompatActivity {
    private PDFView nda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_nda);
        nda=(PDFView)findViewById(R.id.ndapdf);
        nda.fromAsset("NDA.pdf").load();
    }
}
