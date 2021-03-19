package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class SsbcenterActivity extends AppCompatActivity {
    private PDFView ssbc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ssbcenter);
        ssbc=(PDFView)findViewById(R.id.ssbcenterpdf);
        ssbc.fromAsset("ssbcenter.pdf").load();
    }
}
