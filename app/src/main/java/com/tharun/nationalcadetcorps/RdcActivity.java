package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class RdcActivity extends AppCompatActivity {
    private PDFView rd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rdc);
        rd=(PDFView)findViewById(R.id.rdcpdf);
        rd.fromAsset("central.pdf").load();

    }
}
