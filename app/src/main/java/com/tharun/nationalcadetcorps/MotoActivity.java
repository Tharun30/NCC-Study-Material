package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MotoActivity extends AppCompatActivity {
        private PDFView moto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_moto);
        moto=(PDFView)findViewById(R.id.motopdf);
        moto.fromAsset("moto.pdf").load();

    }
}
