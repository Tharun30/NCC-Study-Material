package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class AdvantureActivity extends AppCompatActivity {
    private PDFView adv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_advanture);
        adv=(PDFView)findViewById(R.id.adventurepdf);
        adv.fromAsset("adventure.pdf").load();
    }
}
