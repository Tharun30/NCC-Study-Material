package com.tharun.nationalcadetcorps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CampsActivity extends AppCompatActivity {
    private CardView nic;
    private CardView idc;
    private CardView catc;
    private CardView adv;
    private CardView spr;
    private CardView led;
    private CardView att;
    private CardView soc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_camps);
        catc=(CardView)findViewById(R.id.camp1id);
        idc=(CardView)findViewById(R.id.camp2id);
        adv=(CardView)findViewById(R.id.camp3id);
        spr=(CardView)findViewById(R.id.camp4id);
        nic=(CardView)findViewById(R.id.camp5id);
        led=(CardView)findViewById(R.id.camp6id);
        att=(CardView)findViewById(R.id.camp7id);
        soc=(CardView)findViewById(R.id.camp8id);
        soc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSocailActivity();
            }
        });
        att.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAttachmentActivity();
            }
        });
        led.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLeadershipActivity();

            }
        });
        nic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNicActivity();

            }
        });
        spr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSportsActivity();

            }
        });
        adv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAdventureActivity();

            }
        });
        idc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRdcActivity();

            }
        });
        catc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCatcActivity();
            }
        });
    }
    public void openSocailActivity(){
        Intent so=new Intent(this,SocialActivity.class);
        startActivity(so);
    }
    public void openCatcActivity(){
        Intent atc=new Intent(this,CatcActivity.class);
        startActivity(atc);
    }

    public void openRdcActivity(){
        Intent rdc=new Intent(this,RdcActivity.class);
        startActivity(rdc);
    }
    public void openAdventureActivity(){
        Intent adc=new Intent(this,AdvantureActivity.class);
        startActivity(adc);
    }
    public void openSportsActivity(){
       Intent sc=new Intent(this,SportsActivity.class);
       startActivity(sc);
    }
    public void openNicActivity(){
        Intent ebsb=new Intent(this,NicActivity.class);
        startActivity(ebsb);
    }
    public void openLeadershipActivity(){
        Intent alc=new Intent(this,LeadershipActivity.class);
        startActivity(alc);

    }
    public void openAttachmentActivity(){
        Intent aac=new Intent(this,AttachmentActivity.class);
        startActivity(aac);
    }
}
