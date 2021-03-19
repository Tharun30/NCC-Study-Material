package com.tharun.nationalcadetcorps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class ArmyActivity extends AppCompatActivity {
    private PDFView army;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_army);
        army=(PDFView)findViewById(R.id.armypdf);
        army.fromAsset("splarmy.pdf").load();
    }
}
