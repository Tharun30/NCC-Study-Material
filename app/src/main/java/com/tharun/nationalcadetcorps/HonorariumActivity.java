package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class HonorariumActivity extends AppCompatActivity {
    private PDFView hnr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_honorarium);
        hnr=(PDFView)findViewById(R.id.honnorariumpdf);
        hnr.fromAsset("honorarium.pdf").load();
    }
}
