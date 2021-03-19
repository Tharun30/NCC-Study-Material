package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class RanksnccActivity extends AppCompatActivity {
    private PDFView nccr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ranksncc);
        nccr=(PDFView)findViewById(R.id.nccrankspdf);
        nccr.fromAsset("nccranks.pdf").load();
    }
}
