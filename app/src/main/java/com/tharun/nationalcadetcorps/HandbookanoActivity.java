package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class HandbookanoActivity extends AppCompatActivity {
    private PDFView hba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_handbookano);
        hba=(PDFView)findViewById(R.id.hbanopdf);
        hba.fromAsset("handbookano.pdf").load();

    }
}
