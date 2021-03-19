package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class ArmedStrenghtActivity extends AppCompatActivity {
    private PDFView ars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_armed_strenght);
        ars=(PDFView)findViewById(R.id.armedstrengthpdf);
        ars.fromAsset("armedstrength.pdf").load();
    }
}
