package com.tharun.nationalcadetcorps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class NccentryActivity extends AppCompatActivity {
    private CardView sef;
    private CardView sed;
    private CardView prc;
    private CardView elg;
    private CardView ssb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_nccentry);
        sed = (CardView) findViewById(R.id.sentryidataid);
        sef = (CardView) findViewById(R.id.sentryformid);
        prc=(CardView)findViewById(R.id.processid);
        ssb=(CardView)findViewById(R.id.ssbcenterid);
        ssb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSsbActivity();
            }
        });
        elg=(CardView)findViewById(R.id.eligibilityid);
        elg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEligibilityActivity();

            }
        });
        prc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProcessActivity();
            }
        });
        sef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSentryformActivity();

            }
        });
        sed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSentrydataActivity();
            }
        });


    }
    public void openSsbActivity(){
        Intent ssb=new Intent(this,SsbcenterActivity.class);
        startActivity(ssb);
    }
    public void openProcessActivity(){
        Intent pr=new Intent(this,ProcessActivity.class);
        startActivity(pr);
    }
    public void openEligibilityActivity(){
        Intent el=new Intent(this,EligibilityActivity.class);
        startActivity(el);
    }
    public void openSentrydataActivity(){
        Intent sd=new Intent(this,SentrydataActivity.class);
        startActivity(sd);
    }
    public void openSentryformActivity(){
        Intent sf=new Intent(this,SentryformActivity.class);
        startActivity(sf);
    }
}