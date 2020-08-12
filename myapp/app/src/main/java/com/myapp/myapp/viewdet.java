package com.myapp.myapp;

import android.app.AlertDialog;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

public class viewdet extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12,b13;
    Boolean EditTextEmptyHolder;
    SQLiteDatabase sqLiteDatabaseObj1;
    String SQLiteDataBaseQueryHolder;
    SQLiteHelper sqLiteHelper;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_viewdet );
        b1 = (Button) findViewById( R.id.emp1 );
        b2 = (Button) findViewById( R.id.emp2 );
        b3 = (Button) findViewById( R.id.emp3 );
        b4 = (Button) findViewById( R.id.emp4 );
        b5 = (Button) findViewById( R.id.emp5 );
        b6 = (Button) findViewById( R.id.emp6 );
        b7 = (Button) findViewById( R.id.emp7 );
        b8 = (Button) findViewById( R.id.emp8 );
        b9 = (Button) findViewById( R.id.emp9 );
        b10 = (Button) findViewById( R.id.tl1 );
        b11 = (Button) findViewById( R.id.tl2 );
        b12 = (Button) findViewById( R.id.tl3 );
        b13 = (Button) findViewById( R.id.idea );
        viewAll( );
        sqLiteHelper = new SQLiteHelper( this );
        b13.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( viewdet.this,next.class );
                startActivity( intent );
            }
        } );

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
                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("Date :" + res.getString(1) + "\n");
                            buffer.append("Modules Completed:" + res.getString(2) + "\n");
                            buffer.append("Task Completed :" + res.getString(3) + "\n");
                        }
                        showMessage( "Data", buffer.toString( ) );


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
                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("Date :" + res.getString(1) + "\n");
                            buffer.append("Modules Completed:" + res.getString(2) + "\n");
                            buffer.append("Task Completed :" + res.getString(3) + "\n");
                        }
                        showMessage( "Data", buffer.toString( ) );


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
                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("Date :" + res.getString(1) + "\n");
                            buffer.append("Modules Completed:" + res.getString(2) + "\n");
                            buffer.append("Task Completed :" + res.getString(3) + "\n");
                        }
                        showMessage( "Data", buffer.toString( ) );


                    }


                } );


        b4.setOnClickListener(

                new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata4( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("Date :" + res.getString(1) + "\n");
                            buffer.append("Modules Completed:" + res.getString(2) + "\n");
                            buffer.append("Task Completed :" + res.getString(3) + "\n");
                        }
                        showMessage( "Data", buffer.toString( ) );


                    }


                } );

        b5.setOnClickListener(

                new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata5( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("Date :" + res.getString(1) + "\n");
                            buffer.append("Modules Completed:" + res.getString(2) + "\n");
                            buffer.append("Task Completed :" + res.getString(3) + "\n");
                        }
                        showMessage( "Data", buffer.toString( ) );


                    }


                } );
        b6.setOnClickListener(

                new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata6( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("Date :" + res.getString(1) + "\n");
                            buffer.append("Modules Completed:" + res.getString(2) + "\n");
                            buffer.append("Task Completed :" + res.getString(3) + "\n");
                        }
                        showMessage( "Data", buffer.toString( ) );


                    }


                } );

        b7.setOnClickListener(

                new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata7( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("Date :" + res.getString(1) + "\n");
                            buffer.append("Modules Completed:" + res.getString(2) + "\n");
                            buffer.append("Task Completed :" + res.getString(3) + "\n");
                        }
                        showMessage( "Data", buffer.toString( ) );


                    }


                } );
        b8.setOnClickListener(

                new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata8( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("Date :" + res.getString(1) + "\n");
                            buffer.append("Modules Completed:" + res.getString(2) + "\n");
                            buffer.append("Task Completed :" + res.getString(3) + "\n");
                        }
                        showMessage( "Data", buffer.toString( ) );


                    }


                } );
        b9.setOnClickListener(

                new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata9( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("Date :" + res.getString(1) + "\n");
                            buffer.append("Modules Completed:" + res.getString(2) + "\n");
                            buffer.append("Task Completed :" + res.getString(3) + "\n");
                        }
                        showMessage( "Data", buffer.toString( ) );


                    }


                } );
        b10.setOnClickListener(

                new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata10( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("Date :" + res.getString(1) + "\n");
                            buffer.append("Modules Completed:" + res.getString(2) + "\n");
                            buffer.append("Task Completed :" + res.getString(3) + "\n");
                        }
                        showMessage( "Data", buffer.toString( ) );


                    }


                } );
        b11.setOnClickListener(

                new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata11( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("Date :" + res.getString(1) + "\n");
                            buffer.append("Modules Completed:" + res.getString(2) + "\n");
                            buffer.append("Task Completed :" + res.getString(3) + "\n");
                        }
                        showMessage( "Data", buffer.toString( ) );


                    }


                } );

        b12.setOnClickListener(

                new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata13( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("Date :" + res.getString(1) + "\n");
                            buffer.append("Modules Completed:" + res.getString(2) + "\n");
                            buffer.append("Task Completed :" + res.getString(3) + "\n");
                        }
                        showMessage( "Data", buffer.toString( ) );


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


