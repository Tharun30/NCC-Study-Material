package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class ServicebdgActivity extends AppCompatActivity {
    private PDFView bdg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_servicebdg);
        bdg=(PDFView)findViewById(R.id.servicebdgpdf);
        bdg.fromAsset("service badges.pdf").load();

    }
}
