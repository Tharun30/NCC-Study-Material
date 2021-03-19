package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class AimsActivity extends AppCompatActivity {
    private PDFView aims;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_aims);
        aims=(PDFView)findViewById(R.id.aimspdf);
        aims.fromAsset("aims.pdf").load();
    }
}
