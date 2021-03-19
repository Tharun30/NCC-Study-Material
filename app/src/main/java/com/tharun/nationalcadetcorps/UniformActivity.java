package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class UniformActivity extends AppCompatActivity {
    private PDFView uni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_uniform);
        uni=(PDFView)findViewById(R.id.uniformpdf);
        uni.fromAsset("uniform.pdf").load();
    }
}
