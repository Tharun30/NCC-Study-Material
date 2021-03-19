package com.tharun.nationalcadetcorps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class sturctureActivity extends AppCompatActivity {
    private CardView org;
    private CardView uni;
    private CardView dg;
    private CardView sup;
    private CardView dte;
    private CardView flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sturcture);
        org=(CardView)findViewById(R.id.orgid);
        uni=(CardView)findViewById(R.id.uniid);
        dg=(CardView)findViewById(R.id.dgid);
        sup=(CardView)findViewById(R.id.chiefid);
        dte=(CardView)findViewById(R.id.dteid);
        flag=(CardView)findViewById(R.id.codeid);
        flag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFlagcodeActivity();
            }
        });
        dte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDteActivity();
            }
        });
        sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSupremeActivity();
            }
        });
        dg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDirectoratesActivity();

            }
        });
        uni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUniformActivity();

            }
        });
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOrganisationActivity();

            }
        });

    }
    public void openSupremeActivity(){
        Intent sup=new Intent(this,SupremeActivity.class);
        startActivity(sup);
    }
    public void openDteActivity(){
        Intent dt=new Intent(this,DteActivity.class);
        startActivity(dt);
    }
    public void openFlagcodeActivity(){
        Intent fl=new Intent(this,FlagcodeActivity.class);
        startActivity(fl);
    }

    public void openOrganisationActivity(){
        Intent or=new Intent(this,OrganisationActivity.class);
        startActivity(or);
    }
    public void openUniformActivity(){
        Intent un=new Intent(this,UniformActivity.class);
        startActivity(un);

    }
    public void openDirectoratesActivity(){
        Intent dt=new Intent(this,DirectoratesActivity.class);
        startActivity(dt);
    }

}
