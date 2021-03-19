package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class SentrydataActivity extends AppCompatActivity {
    private PDFView sed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sentrydata);
        sed=(PDFView)findViewById(R.id.sedpdf);
        sed.fromAsset("nses.pdf").load();
    }
}
