package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class NavyActivity extends AppCompatActivity {
    private PDFView navy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_navy);
        navy=(PDFView)findViewById(R.id.navypdf);
        navy.fromAsset("splnavy.pdf").load();
    }
}
