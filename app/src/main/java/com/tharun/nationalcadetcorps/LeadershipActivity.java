package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class LeadershipActivity extends AppCompatActivity {
    private PDFView ldr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_leadership);
        ldr=(PDFView)findViewById(R.id.leadershippdf);
        ldr.fromAsset("leadership.pdf").load();
    }
}
