package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class FlagActivity extends AppCompatActivity {
    private PDFView flg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_flag);
        flg=(PDFView)findViewById(R.id.flagpdf);
        flg.fromAsset("flag.pdf").load();
    }
}
