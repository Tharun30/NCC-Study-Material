package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class CdsActivity extends AppCompatActivity {
    private PDFView cds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cds);
        cds=(PDFView)findViewById(R.id.cdspdf);
        cds.fromAsset("CDS.pdf").load();



    }
}
