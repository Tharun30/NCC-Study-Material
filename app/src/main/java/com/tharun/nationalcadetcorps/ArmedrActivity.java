package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class ArmedrActivity extends AppCompatActivity {
    private PDFView armedr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_armedr);
        armedr=(PDFView)findViewById(R.id.armedrankspdf);
        armedr.fromAsset("armedforces.pdf").load();
    }
}
