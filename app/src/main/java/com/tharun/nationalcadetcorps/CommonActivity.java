package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class CommonActivity extends AppCompatActivity {
    private PDFView cmn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_common);
        cmn=(PDFView)findViewById(R.id.cmnpdf);
        cmn.fromAsset("commonsyll.pdf").load();
    }
}
