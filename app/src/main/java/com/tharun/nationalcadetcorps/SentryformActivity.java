package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class SentryformActivity extends AppCompatActivity {
    private PDFView sef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sentryform);
        sef=(PDFView)findViewById(R.id.sefpdf);
        sef.fromAsset("sef.pdf").load();
    }
}
