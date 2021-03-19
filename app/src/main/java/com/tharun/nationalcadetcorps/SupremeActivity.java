package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class SupremeActivity extends AppCompatActivity {
    private PDFView sup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_supreme);
        sup=(PDFView)findViewById(R.id.supremepdf);
        sup.fromAsset("supreme.pdf").load();
    }
}
