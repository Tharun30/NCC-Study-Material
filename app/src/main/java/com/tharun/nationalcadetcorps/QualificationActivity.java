package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class QualificationActivity extends AppCompatActivity {
    private PDFView qual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_qualification);
        qual=(PDFView)findViewById(R.id.qualifpdf);
        qual.fromAsset("qualification.pdf").load();
    }
}
