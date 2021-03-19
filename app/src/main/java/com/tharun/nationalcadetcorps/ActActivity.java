package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.github.barteksc.pdfviewer.PDFView;

public class ActActivity extends AppCompatActivity {
    private PDFView act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_act);
        act=(PDFView)findViewById(R.id.actpdf);
        act.fromAsset("act.pdf").load();
    }
}
