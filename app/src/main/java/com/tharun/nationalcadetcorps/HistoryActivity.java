package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class HistoryActivity extends AppCompatActivity {
        private PDFView his;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_history);
        his=(PDFView)findViewById(R.id.hispdf);
        his.fromAsset("history.pdf").load();
    }
}
