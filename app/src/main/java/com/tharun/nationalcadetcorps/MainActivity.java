package com.tharun.nationalcadetcorps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity extends AppCompatActivity {
    private CardView about;
    private CardView struct;
    private CardView camp;
    private CardView cet;
    private CardView rank;
    private CardView join;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about = (CardView) findViewById(R.id.aboutid);
        struct = (CardView) findViewById(R.id.structureid);
        camp = (CardView) findViewById(R.id.campid);
        cet = (CardView) findViewById(R.id.cetid);
        rank = (CardView) findViewById(R.id.rankid);
        join = (CardView) findViewById(R.id.joinid);
        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJoinActivity();

            }
        });
        rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRankActivity();
            }
        });
        cet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCetActivity();
            }
        });
        camp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCampsActivity();
            }
        });
        struct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openstructureActivity();
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutNcc();
            }
        });


    }

    public void openAboutNcc() {
        Intent intent = new Intent(this, AboutNcc.class);
        startActivity(intent);
    }

    public void openstructureActivity() {
        Intent structure = new Intent(this, sturctureActivity.class);
        startActivity(structure);
    }

    public void openCampsActivity() {
        Intent camp = new Intent(this, CampsActivity.class);
        startActivity(camp);
    }

    public void openCetActivity() {
        Intent cet = new Intent(this, CetActivity.class);
        startActivity(cet);
    }

    public void openRankActivity() {
        Intent rank = new Intent(this, RankActivity.class);
        startActivity(rank);
    }

    public void openJoinActivity() {
        Intent jn = new Intent(this, JoinActivity.class);
        startActivity(jn);
    }


}




