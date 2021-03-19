package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class FlagcodeActivity extends AppCompatActivity {
    private PDFView flagc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_flagcode);
        flagc=(PDFView)findViewById(R.id.flagcodepdf);
        flagc.fromAsset("flag code.pdf").load();
    }
}
