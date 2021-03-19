package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class SocialActivity extends AppCompatActivity {
    private PDFView soc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_social);
        soc=(PDFView)findViewById(R.id.socialpdf);
        soc.fromAsset("social.pdf").load();
    }
}
