package com.myapp.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;


import java.util.ArrayList;

public class employee extends AppCompatActivity {
    Button b;
    private CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13;
    private ArrayList<String>Result;
    int checked=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_employee);
        b=(Button)findViewById( R.id.button ) ;
        c1=(CheckBox)findViewById( R.id.emp1 );
        c2=(CheckBox)findViewById( R.id.emp2 );
        c3=(CheckBox)findViewById( R.id.emp3 );
        c4=(CheckBox)findViewById( R.id.emp4 );


        c1.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener( ) {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checked = 1;


                } else {
                    checked = 0;

                }
            }
        } );

        c2.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener( ) {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checked = 1;


                } else {
                    checked = 0;

                }
            }
        } );

        c3.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener( ) {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checked = 1;


                } else {
                    checked = 0;

                }
            }
        } );

        c4.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener( ) {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checked = 1;


                } else {
                    checked = 0;

                }
            }
        } );

        b.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                if(c1.isChecked()){
                    Toast.makeText( employee.this,"Employee is selected",Toast.LENGTH_LONG ).show();
                    Intent intent=new Intent( employee.this,TeamLeader.class );
                    startActivity( intent );
                }
                else if(c2.isChecked()) {
                    Toast.makeText( employee.this, "Team Leader is selected", Toast.LENGTH_LONG ).show( );
                    Intent intent = new Intent( employee.this, TeamLeader.class );
                    startActivity( intent );
                }
                else if(c3.isChecked()) {
                    Toast.makeText( employee.this, "Manager is selected", Toast.LENGTH_LONG ).show( );
                    Intent intent = new Intent( employee.this, TeamLeader.class );
                    startActivity( intent );
                }
                else if(c4.isChecked()) {
                    Toast.makeText( employee.this, "Owner is selected", Toast.LENGTH_LONG ).show( );
                    Intent intent = new Intent( employee.this, TeamLeader.class );
                    startActivity( intent );
                }

            }
        } );



    }
}
