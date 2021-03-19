package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PromotionActivity extends AppCompatActivity {
    private PDFView prm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_promotion);
        prm=(PDFView)findViewById(R.id.promotionpdf);
        prm.fromAsset("promotion ano.pdf").load();
    }
}
