package com.tharun.nationalcadetcorps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CetActivity extends AppCompatActivity {
    private CardView cmn;
    private CardView aspl;
    private CardView nspl;
    private CardView aispl;
    private CardView dspl;
    private CardView abtc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cet);
        cmn=(CardView)findViewById(R.id.commonid);
        aspl=(CardView)findViewById(R.id.armyid);
        nspl=(CardView)findViewById(R.id.navyid);
        aispl=(CardView)findViewById(R.id.airid);
        dspl=(CardView)findViewById(R.id.dgid);
        abtc=(CardView)findViewById(R.id.aboutcetid);
        abtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutcetActivity();
            }
        });

        dspl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDgActivity();

            }
        });
        aispl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAirActivity();

            }
        });
        nspl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNavyActivity();

            }
        });
        aspl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openArmyActivity();

            }
        });
        cmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCommonActivity();
            }
        });
    }
    public void openAboutcetActivity(){
        Intent ab=new Intent(this,AboutcetActivity.class);
        startActivity(ab);
    }
    public void openCommonActivity(){
        Intent cs=new Intent(this,CommonActivity.class);
        startActivity(cs);
    }
    public void openArmyActivity(){
        Intent as=new Intent(this,ArmyActivity.class);
        startActivity(as);

    }
    public void openNavyActivity(){
        Intent ns=new Intent(this,NavyActivity.class);
        startActivity(ns);

    }
    public void openAirActivity(){
        Intent ais=new Intent(this,AirActivity.class);
        startActivity(ais);
    }
    public void openDgActivity(){
        Intent ds=new Intent(this,DgActivity.class);
        startActivity(ds);

        }

    }

