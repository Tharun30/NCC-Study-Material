package com.tharun.nationalcadetcorps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class EnrlActivity extends AppCompatActivity {
    private CardView cdte;
    private CardView isnte;
    private CardView cdtinfo;
    private CardView instinfo;
    private CardView strength;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_enrl);
        cdte=(CardView)findViewById(R.id.cdtenrlid);
        isnte=(CardView)findViewById(R.id.instenrlid);
        cdtinfo=(CardView)findViewById(R.id.enrlcdt);
        instinfo=(CardView)findViewById(R.id.enrlinst);
        strength=(CardView)findViewById(R.id.activestrength);
        strength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStrengthncActivity();
            }
        });
        instinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInstelgActivity();
            }
        });
        cdtinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCdtelgActivity();
            }
        });
        isnte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInstituteenrlActivity();
            }
        });
        cdte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCdtenrlActivity();
            }
        });
        }
        public void openCdtelgActivity(){
        Intent celg=new Intent(this,CdtelgActivity.class);
            startActivity(celg);
        }
        public void openInstelgActivity(){
        Intent ielg=new Intent(this,InstelgActivity.class);
        startActivity(ielg);
        }
        public void openStrengthncActivity(){
        Intent strg=new Intent(this,StrengthnccActivity.class);
        startActivity(strg);
        }
    public void openCdtenrlActivity(){
            Intent cde=new Intent(this,CdtenrlActivity.class);
            startActivity(cde);
        }
        public void openInstituteenrlActivity(){
            Intent ine=new Intent(this,InstituteenrlActivity.class);
            startActivity(ine);
        }

    }




