package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class SsbActivity extends AppCompatActivity {
    private PDFView ssb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ssb);
        ssb=(PDFView)findViewById(R.id.ssbpdf);
        ssb.fromAsset("SSB.pdf").load();
    }
}
