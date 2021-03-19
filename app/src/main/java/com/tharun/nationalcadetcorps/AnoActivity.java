package com.tharun.nationalcadetcorps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AnoActivity extends AppCompatActivity {
    private CardView frm;
    private CardView qfn;
    private CardView acr;
    private CardView hba;
    private CardView pro;
    private CardView hon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ano);
        frm=(CardView)findViewById(R.id.anoformid);
        qfn=(CardView)findViewById(R.id.qualificationid);
        acr=(CardView)findViewById(R.id.acrid);
        hba=(CardView)findViewById(R.id.handbookid);
        pro=(CardView)findViewById(R.id.promotionid);
        hon=(CardView)findViewById(R.id.honorariumid);
        hon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHonorariumActivity();
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPromotionActivity();
            }
        });
        hba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHandbookanoActivity();
            }
        });
        acr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcrActivity();
            }
        });
        qfn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQualificationActivity();
            }
        });
        frm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFormanoActivity();
            }
        });
    }
    public void openPromotionActivity(){
        Intent pr=new Intent(this,PromotionActivity.class);
        startActivity(pr);
    }
    public void openHonorariumActivity(){
        Intent ho=new Intent(this,HonorariumActivity.class);
        startActivity(ho);
    }
    public void openFormanoActivity(){
        Intent fm=new Intent(this,FormanoActivity.class);
        startActivity(fm);
    }
    public void openQualificationActivity(){
        Intent qf=new Intent(this,QualificationActivity.class);
        startActivity(qf);
    }
    public void openAcrActivity(){
        Intent ac=new Intent(this,AcrActivity.class);
        startActivity(ac);
    }
    public void openHandbookanoActivity(){
        Intent hb=new Intent(this,HandbookanoActivity.class);
        startActivity(hb);
    }
}
