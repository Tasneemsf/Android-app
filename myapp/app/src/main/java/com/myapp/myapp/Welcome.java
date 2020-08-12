package com.myapp.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    Button b6, b8;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_welcome );
        b6 = (Button) findViewById( R.id.log );
        b8 = (Button) findViewById( R.id.in );


        b6.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Welcome.this, MainActivity.class );
                startActivity( intent );
            }
        } );
        b8.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Welcome.this, appinfo.class );
                startActivity( intent );
            }
        } );


    }

}