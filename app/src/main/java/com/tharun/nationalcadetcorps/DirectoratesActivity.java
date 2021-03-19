package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class DirectoratesActivity extends AppCompatActivity {
    private PDFView dg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_directorates);
        dg=(PDFView)findViewById(R.id.dgpdf);
        dg.fromAsset("DG.pdf").load();
    }
}
