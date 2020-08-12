package com.myapp.myapp;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.myapp.myapp.SQLiteHelper.TABLE_NAME20;
public class ini1 extends AppCompatActivity {
    EditText e1, e2,e3;
    Button b;
    SQLiteDatabase sqLiteDatabaseObj1;
    String SQLiteDataBaseQueryHolder;
    String e1Holder, e2Holder;
    Boolean EditTextEmptyHolder;
    SQLiteHelper sqLiteHelper;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_ini1 );
        e1 = (EditText) findViewById( R.id.idea );
        e2 = (EditText) findViewById( R.id.id);

        b = (Button) findViewById( R.id.sub );

        sqLiteHelper = new SQLiteHelper( this );
        b.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

                CheckEditTextStatus( );
                //  RegisterationFunction( );


                // Creating SQLite database if dose n't exists
                SQLiteDataBaseBuild( );

                // Creating SQLite table if dose n't exists.
                SQLiteTableBuild( );

                // Checking EditText is empty or Not.
                CheckEditTextStatus( );

                // Method to check Email is already exists or not.
                InsertDataIntoSQLiteDatabase( );
                //Sending confirmation email.
                Confirm( );

                // Empty EditText After done inserting process.


            }
        } );


    }


    public void Confirm() {


    }

    // SQLite database build method.
    public void SQLiteDataBaseBuild() {

        sqLiteDatabaseObj1 = openOrCreateDatabase( SQLiteHelper.DATABASE_NAME, Context.MODE_PRIVATE, null );

    }

    // SQLite table build method.
    public void SQLiteTableBuild() {
        // sqLiteDatabaseObj.execSQL("DROP TABLE IF EXISTS " + TABLE_EMP);

        sqLiteDatabaseObj1.execSQL( "CREATE TABLE IF NOT EXISTS " + TABLE_NAME20 + "(" + SQLiteHelper.Table_Column_eni1_e1 + "," + SQLiteHelper.Table_Column_eni1_e2 + ");" );
    }

    public void InsertDataIntoSQLiteDatabase() {

        // If editText is not empty then this block will executed.
        if (EditTextEmptyHolder == true) {
            SQLiteDataBaseQueryHolder = "INSERT INTO " + TABLE_NAME20 + " (ID,ini) VALUES('" + e1Holder + "', '" + e2Holder + "');";
            sqLiteDatabaseObj1.execSQL( SQLiteDataBaseQueryHolder );

            // Closing SQLite database object.
            sqLiteDatabaseObj1.close( );


            // Printing toast message after done inserting.
            Toast.makeText( ini1.this, "User Submitted Successfully", Toast.LENGTH_LONG ).show( );

        }
        // This block will execute if any of the registration EditText is empty.
        else {

            // Printing toast message if any of EditText is empty.
            Toast.makeText( ini1.this, "Please Fill All The Required Fields.", Toast.LENGTH_LONG ).show( );

        }

    }

    private void stratActivity(Intent intent) {
    }

    // Empty edittext after done inserting process method.


    // Method to check EditText is empty or Not.
    public void CheckEditTextStatus() {

        // Getting value from All EditText and storing into String Variables.
        e1Holder = e1.getText( ).toString( );
        e2Holder = e2.getText( ).toString( );
        if (TextUtils.isEmpty( e1Holder ) || TextUtils.isEmpty( e2Holder )) {
            EditTextEmptyHolder = false;

        } else {

            EditTextEmptyHolder = true;
        }
    }

}