package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class InstituteenrlActivity extends AppCompatActivity {
    private PDFView inste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_instituteenrl);
        inste=(PDFView)findViewById(R.id.instepdf);
        inste.fromAsset("enrlinst.pdf").load();
    }
}
