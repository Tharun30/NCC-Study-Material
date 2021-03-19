package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class AirActivity extends AppCompatActivity {
    private PDFView air;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_air);
        air=(PDFView)findViewById(R.id.airpdf);
        air.fromAsset("splair.pdf").load();
    }
}
