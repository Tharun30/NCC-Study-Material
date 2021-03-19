package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class InfregActivity extends AppCompatActivity {
    private PDFView inf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_infreg);
        inf=(PDFView)findViewById(R.id.infpdf);
        inf.fromAsset("inf reg.pdf").load();
    }
}
