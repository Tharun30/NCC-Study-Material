package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class DteActivity extends AppCompatActivity {
    private PDFView dte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dte);
        dte=(PDFView)findViewById(R.id.dtepdf);
        dte.fromAsset("dte.pdf").load();
    }
}
