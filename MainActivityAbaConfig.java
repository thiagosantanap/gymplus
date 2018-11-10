package com.cursoandroid.gymplus.gymplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivityAbaConfig extends AppCompatActivity {
    private TextView botaoHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abaconfig);

        botaoHome = (TextView) findViewById(R.id.botaoHomeId);

        botaoHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivityAbaConfig.this, MainActivity_localizacao.class));
            }
        });
    }
}
