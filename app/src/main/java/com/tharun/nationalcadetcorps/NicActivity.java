package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class NicActivity extends AppCompatActivity {
    private PDFView nic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_nic);
        nic=(PDFView)findViewById(R.id.nicpdf);
        nic.fromAsset("nic.pdf").load();
    }
}
