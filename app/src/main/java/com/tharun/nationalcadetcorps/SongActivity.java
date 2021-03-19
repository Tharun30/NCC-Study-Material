package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class SongActivity extends AppCompatActivity {
    private PDFView sng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_song);
        sng=(PDFView)findViewById(R.id.songpdf);
        sng.fromAsset("song.pdf").load();
    }
}
