package com.myapp.myapp;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class next extends AppCompatActivity {
Button b;
    Boolean EditTextEmptyHolder;
    SQLiteDatabase sqLiteDatabaseObj;
    String SQLiteDataBaseQueryHolder;
    SQLiteHelper sqLiteHelper;
    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_next );
        b = (Button) findViewById( R.id.i );
        viewAll( );
        sqLiteHelper = new SQLiteHelper( this );
    }
    private void viewAll() {

        b.setOnClickListener(

                new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata20( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("Idea :" + res.getString(1) + "\n");
                           }
                        showMessage( "Initiative Idea", buffer.toString( ) );


                    }


                } );

    }




    public void showMessage (String title, String Message)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder( this );
        builder.setCancelable( true );
        builder.setTitle( title );
        builder.setMessage( Message );
        builder.show( );

    }



}
