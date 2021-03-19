package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class OrganisationActivity extends AppCompatActivity {
    private PDFView org;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_organisation);
        org=(PDFView)findViewById(R.id.orgpdf);
        org.fromAsset("org.pdf").load();
    }
}
