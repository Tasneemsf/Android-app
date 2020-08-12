package com.myapp.myapp;

import android.app.AlertDialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class tlemp1 extends AppCompatActivity {
    Button b1,b2,b3;
    SQLiteDatabase sqLiteDatabaseObj1;
    String SQLiteDataBaseQueryHolder;
    SQLiteHelper sqLiteHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tlemp1 );
        b1 = (Button) findViewById( R.id.emp1 );
        b2 = (Button) findViewById( R.id.emp2 );
        b3 = (Button) findViewById( R.id.emp3 );
        viewAll( );
        sqLiteHelper = new SQLiteHelper( this );
    }
    private void viewAll() {

        b1.setOnClickListener(

                new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata1( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append("ID:" + res.getString(0) + "\n");
                            buffer.append("Date:" + res.getString(1) + "\n");
                            buffer.append("Modules Completed:" + res.getString(2) + "\n");
                            buffer.append("Task Completed :" + res.getString(3) + "\n");}
                        showMessage( "Employee1", buffer.toString( ) );


                    }


                } );
        b2.setOnClickListener(

                new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata2( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append( "ID :" + res.getString( 0 ) + "\n" );
                            buffer.append( "Date :" + res.getString( 1 ) + "\n" );
                            buffer.append( "Modules Completed:" + res.getString( 2 ) + "\n" );
                            buffer.append( "Days Taken To Complete :" + res.getString( 3 ) + "\n" );
                        }
                        showMessage( "Employee2", buffer.toString( ) );


                    }


                } );
        b3.setOnClickListener(

                new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata3( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append( "ID :" + res.getString( 0 ) + "\n" );
                            buffer.append( "Date :" + res.getString( 1 ) + "\n" );
                            buffer.append( "Modules Completed:" + res.getString( 2 ) + "\n" );
                            buffer.append( "Days Taken To Complete :" + res.getString( 3 ) + "\n" );
                        }
                        showMessage( "Employee3", buffer.toString( ) );


                    }


                } );
    }

    public void showMessage(String title,String Message)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();

    }

}







