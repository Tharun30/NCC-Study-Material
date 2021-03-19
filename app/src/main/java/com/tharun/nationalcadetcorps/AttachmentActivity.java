package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class AttachmentActivity extends AppCompatActivity {
    private PDFView att;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_attachment);
        att=(PDFView)findViewById(R.id.attachmentpdf);
        att.fromAsset("attachment.pdf").load();
    }
}
