package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class EligibilityActivity extends AppCompatActivity {
    private PDFView elg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_eligibility);
        elg=(PDFView)findViewById(R.id.eligibilitypdf);
        elg.fromAsset("eligibility.pdf").load();
    }
}
