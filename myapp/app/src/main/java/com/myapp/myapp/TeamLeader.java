package com.myapp.myapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class TeamLeader extends AppCompatActivity {
    Button submit;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_team_leader );
        submit = (Button) findViewById( R.id.submit );
        password = (EditText) findViewById( R.id.pass );
        submit.setOnClickListener( new View.OnClickListener( ) {
            public void onClick(View view) {
                validate( password.getText( ).toString( ) );
            }

        } );
    }

    private void validate(String password) {

        if (password.equals( "em1" )) {
            Intent intent = new Intent( TeamLeader.this, employee1.class );
            startActivity( intent );
        } else if (password.equals( "em2" )) {
            Intent intent = new Intent( TeamLeader.this, employee2.class );
            startActivity( intent );
        } else if (password.equals( "em3" )) {
            Intent intent = new Intent( TeamLeader.this, employee3.class );
            startActivity( intent );
        } else if (password.equals( "em4" )) {
            Intent intent = new Intent( TeamLeader.this, employee4.class );
            startActivity( intent );
        } else if (password.equals( "em5" )) {
            Intent intent = new Intent( TeamLeader.this, employee5.class );
            startActivity( intent );
        }  else if (password.equals( "em6" )) {
            Intent intent = new Intent( TeamLeader.this, employee6.class );
            startActivity( intent );
        }   else if (password.equals( "em7" )) {
            Intent intent = new Intent( TeamLeader.this, employee7.class );
            startActivity( intent );
        }   else if (password.equals( "em8" )) {
            Intent intent = new Intent( TeamLeader.this, employee8.class );
            startActivity( intent );
        }   else if (password.equals( "em9" )) {
            Intent intent = new Intent( TeamLeader.this, employee9.class );
            startActivity( intent );
        }   else if (password.equals( "tl3" )) {
            Intent intent = new Intent( TeamLeader.this, tl3.class );
            startActivity( intent );


        } else if (password.equals( "tl1" )) {
            Intent intent = new Intent( TeamLeader.this, tl1.class );
            startActivity( intent );

        } else if (password.equals( "tl2" )) {
            Intent intent = new Intent( TeamLeader.this, tl2.class );
            startActivity( intent );

        } else if (password.equals( "manager" )) {
            Intent intent = new Intent( TeamLeader.this, Manager.class );
            startActivity( intent );

        }
    else if (password.equals( "owner" )) {
        Intent intent = new Intent( TeamLeader.this,Owner.class );
        startActivity( intent );

    }



        else{
            Toast.makeText( TeamLeader.this,"Password is Wrong",Toast.LENGTH_LONG ).show();
        }
    }
}