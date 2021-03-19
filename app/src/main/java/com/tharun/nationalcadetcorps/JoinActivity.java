package com.tharun.nationalcadetcorps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class JoinActivity extends AppCompatActivity {
    private CardView nda;
    private CardView cds;
    private CardView afcat;
    private CardView ncce;
    private CardView ssb;
    private CardView med;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        nda=(CardView)findViewById(R.id.ndaid);
        cds=(CardView)findViewById(R.id.cdsid);
        afcat=(CardView)findViewById(R.id.afcatid);
        ncce=(CardView)findViewById(R.id.nccid);
        med=(CardView)findViewById(R.id.medicalid);
        ssb=(CardView) findViewById(R.id.ssbid);
        ssb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSsbActivity();
            }
        });
        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openMedicalActivity();
            }
        });
        ncce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNccentryActivity();

            }
        });
        afcat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAfcatActivity();
            }
        });
        cds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCdsActivity();

            }
        });
        nda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNdaActivity();
            }
        });
    }
    public void openMedicalActivity(){
        Intent me=new Intent(this,MedicalActivity.class);
        startActivity(me);
    }
    public void openSsbActivity(){
        Intent ss=new Intent(this,SsbActivity.class);
        startActivity(ss);
    }

    public void openNdaActivity(){
        Intent nd=new Intent(this,NdaActivity.class);
        startActivity(nd);
    }
    public void openCdsActivity(){
        Intent cd=new Intent(this,CdsActivity.class);
        startActivity(cd);

    }
    public void openAfcatActivity(){
        Intent af=new Intent(this,AfcatActivity.class);
        startActivity(af);
    }
    public void openNccentryActivity(){
        Intent ne=new Intent(this,NccentryActivity.class);
        startActivity(ne);
    }
}
