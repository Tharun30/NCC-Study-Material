package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class StrengthnccActivity extends AppCompatActivity {
    private PDFView str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_strengthncc);
        str=(PDFView)findViewById(R.id.strengthpdf);
        str.fromAsset("strengthncc.pdf").load();
    }
}
