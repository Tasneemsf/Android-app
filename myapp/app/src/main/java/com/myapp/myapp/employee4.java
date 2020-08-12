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


public class employee4 extends AppCompatActivity {
    //  private static final String TABLE_EMP1 = "TABLE_NAME1";
    private static final String TABLE_NAME4 = "TABLE_EMP4";
    EditText e1, e2, e3,e4,e5;
    Button b1, b3,b4,b5,b6;
    String e1Holder, e2Holder, e3Holder,e4Holder,e5Holder;
    Boolean EditTextEmptyHolder;
    SQLiteDatabase sqLiteDatabaseObj1;
    String SQLiteDataBaseQueryHolder;
    SQLiteHelper sqLiteHelper;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_employee4 );

        e1 = (EditText) findViewById( R.id.et7 );
        e2 = (EditText) findViewById( R.id.id );
        e3 = (EditText) findViewById( R.id.project );
        e4=(EditText) findViewById( R.id.et1 );
        b1 = (Button) findViewById( R.id.btn );
        b3 = (Button) findViewById( R.id.view );
        b4 = (Button) findViewById( R.id.up);
        b5=(Button)findViewById( R.id.ini );

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


        b5.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( employee4.this,ini1.class );
                startActivity( intent );
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

        sqLiteDatabaseObj1.execSQL( "CREATE TABLE IF NOT EXISTS " + TABLE_NAME4 + "(" + SQLiteHelper.Table_Column_emp4_e1 + " VARCHAR, "
                + SQLiteHelper.Table_Column_emp4_e2 + " VARCHAR, "
                + SQLiteHelper.Table_Column_emp4_e3 + " VARCHAR,"+SQLiteHelper.Table_Column_emp4_e4+" VARCHAR);" );


    }

    // Insert data into SQLite database method.
    public void InsertDataIntoSQLiteDatabase() {

        // If editText is not empty then this block will executed.
        if (EditTextEmptyHolder == true) {


            // SQLite query to insert data into Ttable.
            SQLiteDataBaseQueryHolder = "INSERT INTO " + TABLE_NAME4 + " (ID,Date,Project,Lines) VALUES('" + e1Holder + "', '" + e2Holder + "', '" + e3Holder + "','"+e4Holder+"');";

            // Executing query.
            sqLiteDatabaseObj1.execSQL( SQLiteDataBaseQueryHolder );

            // Closing SQLite database object.
            sqLiteDatabaseObj1.close( );


            // Printing toast message after done inserting.
            Toast.makeText( employee4.this, "User Submitted Successfully", Toast.LENGTH_LONG ).show( );

        }
        // This block will execute if any of the registration EditText is empty.
        else {

            // Printing toast message if any of EditText is empty.
            Toast.makeText( employee4.this, "Please Fill All The Required Fields.", Toast.LENGTH_LONG ).show( );

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
        e3Holder = e3.getText( ).toString( );
        e4Holder = e4.getText( ).toString( );

        if (TextUtils.isEmpty( e1Holder ) || TextUtils.isEmpty( e2Holder ) || TextUtils.isEmpty( e3Holder )||TextUtils.isEmpty( e4Holder )) {

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
                        Cursor res = sqLiteHelper.getAlldata4();
                        if (res.getCount() == 0) {

                            showMessage("Error", "Nothing found");
                            return;

                        }
                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {

                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("Date :" + res.getString(1) + "\n");
                            buffer.append("Modules Completed:" + res.getString(2) + "\n");
                            buffer.append("Task Completed :" + res.getString(3) + "\n");

                        }
                        showMessage("Data", buffer.toString());




                    }

                });
    }
    public void UpdateData()
    {
        b4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isUpdate = sqLiteHelper.updateData4(e1.getText( ).toString( ), e2.getText( ).toString( ),
                                e3.getText( ).toString( ), e4.getText( ).toString( ));
                        if (isUpdate == true)
                            Toast.makeText(employee4.this, "Data Update", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(employee4.this, "Data  not updated", Toast.LENGTH_LONG).show();

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

