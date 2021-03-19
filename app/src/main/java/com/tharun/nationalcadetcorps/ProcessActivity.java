package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class ProcessActivity extends AppCompatActivity {
    private PDFView prs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_process);
        prs=(PDFView)findViewById(R.id.processpdf);
        prs.fromAsset("process.pdf").load();
    }
}
