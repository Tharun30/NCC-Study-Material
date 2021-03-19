package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PledgeActivity extends AppCompatActivity {
    private PDFView plg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pledge);
        plg=(PDFView)findViewById(R.id.pledgepdf);
        plg.fromAsset("pledge.pdf").load();
    }
}
