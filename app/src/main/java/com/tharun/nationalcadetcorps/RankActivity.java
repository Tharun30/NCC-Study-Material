package com.tharun.nationalcadetcorps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class  RankActivity extends AppCompatActivity {
    private CardView nccr;
    private CardView armdr;
    private CardView ga;
    private CardView str;
    private CardView inf;
    private CardView bdg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rank);
        nccr=(CardView)findViewById(R.id.nccranksid);
        armdr=(CardView)findViewById(R.id.armedranks);
        ga=(CardView)findViewById(R.id.awardsid);
        str=(CardView)findViewById(R.id.strengthid);
        inf=(CardView)findViewById(R.id.infid);
        bdg=(CardView)findViewById(R.id.servid);
        bdg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openServicebdgActivity();
            }
        });
        inf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInfregActivity();
            }
        });
        str.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openArmedStrengthActivity();
            }
        });

        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAwardsActivity();
            }
        });
        armdr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openArmedrActivity();

            }
        });
        nccr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRanksnccActivity();

            }
        });
    }
    public void openServicebdgActivity(){
        Intent serv=new Intent(this,ServicebdgActivity.class);
        startActivity(serv);
    }
    public void openInfregActivity(){
        Intent infr=new Intent(this,InfregActivity.class);
        startActivity(infr);
    }
    public void openArmedStrengthActivity(){
        Intent asa=new Intent(this,ArmedStrenghtActivity.class);
        startActivity(asa);
    }
    public void openRanksnccActivity(){
        Intent nr=new Intent(this,RanksnccActivity.class);
        startActivity(nr);
    }
    public void openArmedrActivity(){
        Intent ar=new Intent(this,ArmedrActivity.class);
        startActivity(ar);
    }
    public void openAwardsActivity(){
        Intent aa=new Intent(this,AwardsActivity.class);
        startActivity(aa);
    }
}
