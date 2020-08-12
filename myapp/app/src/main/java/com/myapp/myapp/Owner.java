package com.myapp.myapp;


import android.app.AlertDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;
public class Owner extends AppCompatActivity {
Button b1,b2;
    SQLiteDatabase sqLiteDatabaseObj1;
    String SQLiteDataBaseQueryHolder;
    SQLiteHelper sqLiteHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_owner );
        b1=(Button)findViewById( R.id.button2 );
        b2=(Button)findViewById( R.id.button3 );
        viewAll( );
        sqLiteHelper = new SQLiteHelper( this );
    }
    private void viewAll() {

        b1.setOnClickListener(new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata12( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append( "Date :" + res.getString( 0 ) + "\n" );
                            buffer.append( "Project :" + res.getString( 1 ) + "\n" );
                            buffer.append( "Initiative Idea:" + res.getString( 2 ) + "\n" );
                        }
                        showMessage( "Manager Report", buffer.toString( ) );


                    }


                } );
        b2.setOnClickListener(

                new View.OnClickListener( ) {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata( );
                        if (res.getCount( ) == 0) {

                            showMessage( "Error", "Nothing found" );
                            return;

                        }
                        StringBuffer buffer = new StringBuffer( );
                        while (res.moveToNext( )) {
                            buffer.append( "Name :" + res.getString( 0 ) + "\n" );
                            buffer.append( "Surname :" + res.getString( 1 ) + "\n" );
                            buffer.append( "Email:" + res.getString( 2 ) + "\n" );
                            buffer.append( "Password :" + res.getString( 4 ) + "\n" );
                            buffer.append( "Phone Number :" + res.getString( 3 ) + "\n" );
                            buffer.append( "D.O.B :" + res.getString( 5 ) + "\n" );
                        }
                        showMessage( "Employee Details", buffer.toString( ) );


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
