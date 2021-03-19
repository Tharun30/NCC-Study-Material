package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class CoreActivity extends AppCompatActivity {
    private PDFView core;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_core);
        core =(PDFView)findViewById(R.id.corepdf);
        core.fromAsset("core.pdf").load();
    }
}
