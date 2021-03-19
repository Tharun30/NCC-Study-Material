package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MedicalActivity extends AppCompatActivity {
    private PDFView med;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_medical);
        med=(PDFView)findViewById(R.id.medicalpdf);
        med.fromAsset("medical.pdf").load();
    }
}
