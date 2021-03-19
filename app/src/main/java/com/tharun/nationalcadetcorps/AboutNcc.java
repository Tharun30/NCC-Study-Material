package com.tharun.nationalcadetcorps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AboutNcc extends AppCompatActivity {
    private CardView aim;
    private CardView his;
    private CardView moto;
    private CardView core;
    private CardView pledge;
    private CardView flag;
    private CardView Song;
    private CardView enrl;
    private CardView associate;
    private CardView act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about_ncc);
        aim=(CardView)findViewById(R.id.aimsid);
        his=(CardView)findViewById(R.id.Historyid);
        moto=(CardView)findViewById(R.id.Motoid);
        core=(CardView)findViewById(R.id.coreid);
        pledge=(CardView)findViewById(R.id.pledgeid);
        flag=(CardView)findViewById(R.id.flagid);
        Song=(CardView)findViewById(R.id.songid);
        enrl=(CardView)findViewById(R.id.Enrollmentid);
        act=(CardView)findViewById(R.id.actid);
        associate=(CardView)findViewById(R.id.Anoid);
        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActActivity();
            }
        });
        associate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAnoActivity();

            }
        });
        enrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEnrlActivity();
            }
        });
        Song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openSongActivity();
            }
        });
        flag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFlagActivity();
            }
        });
        pledge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPledgeActivity();
            }
        });
        core.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCoreActivity();
            }
        });
        moto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMotoActiviy();
            }
        });
        his.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHistoryActivity();
            }
        });
        aim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAimsActivity();
            }
        });
    }
    public void openAimsActivity(){
        Intent aims=new Intent(this,AimsActivity.class);
        startActivity(aims);
    }
    public void openHistoryActivity(){
        Intent His=new Intent(this,HistoryActivity.class);
        startActivity(His);
    }
    public void openMotoActiviy(){
        Intent mt=new Intent(this,MotoActivity.class);
        startActivity(mt);
    }
    public void openCoreActivity(){
        Intent cr=new Intent(this,CoreActivity.class);
        startActivity(cr);
    }
    public void openPledgeActivity(){
        Intent plg=new Intent(this,PledgeActivity.class);
        startActivity(plg);
    }
    public void openFlagActivity(){
        Intent flg=new Intent(this,FlagActivity.class);
        startActivity(flg);
    }
    public void openSongActivity(){
        Intent sng=new Intent(this,SongActivity.class);
        startActivity(sng);
    }
    public void openEnrlActivity(){
        Intent enl=new Intent(this, EnrlActivity.class);
        startActivity(enl);
    }
    public void openAnoActivity(){
        Intent ano=new Intent(this,AnoActivity.class);
        startActivity(ano);
    }
    public void openActActivity(){
        Intent ac=new Intent(this,ActActivity.class);
        startActivity(ac);
    }
}
