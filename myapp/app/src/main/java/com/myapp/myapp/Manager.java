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

//import static com.myapp.pgmlangdb.SQLiteHelper.TABLE_NAME1;


import static com.myapp.myapp.SQLiteHelper.TABLE_NAME12;


public class Manager extends AppCompatActivity {
    private static final String TABLE_M = "TABLE_MNG";
    EditText m1,m2,m3,m4;
    Button b1, b3,b4,b5;
    String m1Holder, m2Holder, m3Holder,m4Holder;
    Boolean EditTextEmptyHolder;
    SQLiteDatabase sqLiteDatabaseObj1;
    String SQLiteDataBaseQueryHolder;
    SQLiteHelper sqLiteHelper;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_manager );

        m1 = (EditText) findViewById( R.id.id );
        m2 = (EditText) findViewById( R.id.et1 );
        m3 = (EditText) findViewById( R.id.et2 );

        b1 = (Button) findViewById( R.id.btn );
        b3 = (Button) findViewById( R.id.view );
        b4 = (Button) findViewById( R.id.all );
        b5=(Button)findViewById( R.id.up );

        viewAll( );
        UpdateData();
        sqLiteHelper = new SQLiteHelper( this );

        // Adding click listener to register button.

        b1.setOnClickListener( new View.OnClickListener( ) {
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




        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Opening new user registration activity using intent on button click.
                Intent intent = new Intent(Manager.this,viewdet.class);
                startActivity(intent);

            }
        });

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

        sqLiteDatabaseObj1.execSQL( "CREATE TABLE IF NOT EXISTS " + TABLE_NAME12+ "(" + SQLiteHelper.Table_Column_mng_m1 + " VARCHAR, "
                + SQLiteHelper.Table_Column_mng_m2 + " VARCHAR, "
                + SQLiteHelper.Table_Column_mng_m3 + " VARCHAR);" );


    }

    // Insert data into SQLite database method.
    public void InsertDataIntoSQLiteDatabase() {

        // If editText is not empty then this block will executed.
        if (EditTextEmptyHolder == true) {


            // SQLite query to insert data into Ttable.
            SQLiteDataBaseQueryHolder = "INSERT INTO " + TABLE_NAME12+" (Date,Project,idea) VALUES('" + m1Holder + "', '" + m2Holder + "', '" + m3Holder + "');";

            // Executing query.
            sqLiteDatabaseObj1.execSQL( SQLiteDataBaseQueryHolder );

            // Closing SQLite database object.
            sqLiteDatabaseObj1.close( );


            // Printing toast message after done inserting.
            Toast.makeText( Manager.this, "User Submitted Successfully", Toast.LENGTH_LONG ).show( );

        }
        // This block will execute if any of the registration EditText is empty.
        else {

            // Printing toast message if any of EditText is empty.
            Toast.makeText( Manager.this, "Please Fill All The Required Fields.", Toast.LENGTH_LONG ).show( );

        }

    }

    private void stratActivity(Intent intent) {
    }

    // Empty edittext after done inserting process method.


    // Method to check EditText is empty or Not.
    public void CheckEditTextStatus() {

        // Getting value from All EditText and storing into String Variables.
        m1Holder = m1.getText( ).toString( );
        m2Holder = m2.getText( ).toString( );
        m3Holder = m3.getText( ).toString( );

        if (TextUtils.isEmpty( m1Holder ) || TextUtils.isEmpty( m2Holder )||TextUtils.isEmpty( m3Holder ) ) {

            EditTextEmptyHolder = false;

        } else {

            EditTextEmptyHolder = true;
        }
    }


    private void viewAll() {
        b3.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = sqLiteHelper.getAlldata12();
                        if (res.getCount() == 0) {

                            showMessage("Error", "Nothing found");
                            return;

                        }
                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append("Date :" + res.getString(0) + "\n");
                            buffer.append("Project :" + res.getString(1) + "\n");
                            buffer.append("Initiative Idea:" + res.getString(2) + "\n");

                        }
                        showMessage(" Updates", buffer.toString());




                    }

                });
    }
    public void UpdateData()
    {
        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isUpdate = sqLiteHelper.updateData30(m1.getText( ).toString( ), m2.getText( ).toString( ),
                                m3.getText( ).toString( ));
                        if (isUpdate == true)
                            Toast.makeText(Manager.this, "Data Update", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Manager.this, "Data  not updated", Toast.LENGTH_LONG).show();

                    }

                });
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





// Checking Email is already exists or not.
