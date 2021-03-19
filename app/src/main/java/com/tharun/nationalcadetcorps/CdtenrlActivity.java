package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class CdtenrlActivity extends AppCompatActivity {
    private PDFView cdte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cdtenrl);
        cdte=(PDFView)findViewById(R.id.cdtepdf);
        cdte.fromAsset("enrlcdt.pdf").load();
    }
}
