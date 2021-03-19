package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class FormanoActivity extends AppCompatActivity {
    private PDFView frmano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_formano);
        frmano=(PDFView)findViewById(R.id.formanopdf);
        frmano.fromAsset("Formano.pdf").load();
    }
}
