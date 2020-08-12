package com.myapp.myapp;

import android.support.v7.app.AppCompatActivity;

import android.app.VoiceInteractor;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterActivity extends AppCompatActivity {

    //public static boolean NameHolder;
    EditText Email, Password, Name ,DOB,SurName,PhoneNumber;
    Button Register;
    String NameHolder, EmailHolder, PasswordHolder,PhoneNumberHolder,SurNameHolder,DOBHolder, ProfileTextHolder;
    Boolean EditTextEmptyHolder;
    // static CheckBox c1;
    //static CheckBox c2;
    //static CheckBox c3;
    //int checked=0;
    SQLiteDatabase sqLiteDatabaseObj;
    String SQLiteDataBaseQueryHolder ;
    SQLiteHelper sqLiteHelper;
    Cursor cursor;
    String F_Result = "Not_Found";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_register );


        Register = (Button) findViewById( R.id.buttonRegister );

        Email = (EditText) findViewById( R.id.editEmail );
        Password = (EditText) findViewById( R.id.editPassword );
        Name = (EditText) findViewById( R.id.editName );
        PhoneNumber = (EditText) findViewById( R.id.editText3_address );
        SurName = (EditText) findViewById( R.id.editSurName );
        DOB = (EditText) findViewById( R.id.dob );


        sqLiteHelper = new SQLiteHelper( this );

        // Adding click listener to register button.
        Register.setOnClickListener( new View.OnClickListener( ) {
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
                CheckingEmailAlreadyExistsOrNot( );
                //Sending confirmation email.
                Confirm( );

                // Empty EditText After done inserting process.
                EmptyEditTextAfterDataInsert( );



            }
        } );


    }
    public void Confirm(){


    }

    // SQLite database build method.
    public void SQLiteDataBaseBuild(){

        sqLiteDatabaseObj = openOrCreateDatabase(SQLiteHelper.DATABASE_NAME, Context.MODE_PRIVATE, null);

    }

    // SQLite table build method.
    public void SQLiteTableBuild() {
        sqLiteDatabaseObj.execSQL("DROP TABLE IF EXISTS " + SQLiteHelper.TABLE_NAME);
        sqLiteDatabaseObj.execSQL( "CREATE TABLE IF NOT EXISTS " + SQLiteHelper.TABLE_NAME + "("  + SQLiteHelper.Table_Column_reg_Name + " VARCHAR, "
                + SQLiteHelper.Table_Column_reg_Email + " VARCHAR, "
                + SQLiteHelper.Table_Column_reg_Password + " VARCHAR,"
                + SQLiteHelper.Table_Column_reg_PhoneNumber + " VARCHAR," +
                " " + SQLiteHelper.Table_Column_reg_SurName + " VARCHAR," +
                " " + SQLiteHelper.Table_Column_reg_DOB + " VARCHAR);");

    }
    // Insert data into SQLite database method.
    public void InsertDataIntoSQLiteDatabase(){

        // If editText is not empty then this block will executed.
        if(EditTextEmptyHolder == true)
        {



            // SQLite query to insert data into table.
            SQLiteDataBaseQueryHolder = "INSERT INTO "+SQLiteHelper.TABLE_NAME+" (name,email,password,phonenumber,surname,dob) VALUES('"+NameHolder+"', '"+EmailHolder+"', '"+PasswordHolder+"', '"+PhoneNumberHolder+"','"+SurNameHolder+"','"+DOBHolder+"');";

            // Executing query.
            sqLiteDatabaseObj.execSQL(SQLiteDataBaseQueryHolder);

            // Closing SQLite database object.
            sqLiteDatabaseObj.close();


            // Printing toast message after done inserting.
            Toast.makeText(RegisterActivity.this,"User Registered Successfully", Toast.LENGTH_LONG).show();
            Intent intent=new Intent( RegisterActivity.this,MainActivity.class );
            startActivity( intent );

        }
        // This block will execute if any of the registration EditText is empty.
        else {

            // Printing toast message if any of EditText is empty.
            Toast.makeText(RegisterActivity.this,"Please Fill All The Required Fields.", Toast.LENGTH_LONG).show();

        }

    }

    private void stratActivity(Intent intent) {
    }

    // Empty edittext after done inserting process method.
    public void EmptyEditTextAfterDataInsert(){

        Name.getText().clear();

        Email.getText().clear();

        Password.getText().clear();
        PhoneNumber.getText().clear();
        DOB.getText().clear();
        SurName.getText().clear();

    }


    // Method to check EditText is empty or Not.
    public void CheckEditTextStatus(){

        // Getting value from All EditText and storing into String Variables.
        NameHolder = Name.getText().toString() ;
        EmailHolder = Email.getText().toString();
        PasswordHolder = Password.getText().toString();
        PhoneNumberHolder=PhoneNumber.getText().toString();
        SurNameHolder=SurName.getText().toString();
        DOBHolder=DOB.getText().toString();

        //ProfileTextHolder = null;

        //  if (c1.isChecked()) {
        //    ProfileTextHolder = "employee";
        //  Intent intent=new Intent( RegisterActivity.this,employee.class );
        //stratActivity(intent);
        //} else if (c2.isChecked()) {
        //  ProfileTextHolder = "Team Leader";
        //Intent intent=new Intent( RegisterActivity.this,TeamLeader.class );
        //stratActivity(intent);
        //} else if (c3.isChecked()) {
        //  ProfileTextHolder = "Manager";
        //Intent intent=new Intent( RegisterActivity.this,Manager.class );
        //stratActivity(intent);



        if(TextUtils.isEmpty(NameHolder) || TextUtils.isEmpty(EmailHolder) || TextUtils.isEmpty(PasswordHolder)){

            EditTextEmptyHolder = false ;

        }
        else {

            EditTextEmptyHolder = true ;
        }
    }

    // Checking Email is already exists or not.
    public void CheckingEmailAlreadyExistsOrNot(){

        // Opening SQLite database write permission.
        sqLiteDatabaseObj = sqLiteHelper.getWritableDatabase();

        // Adding search email query to cursor.
        cursor = sqLiteDatabaseObj.query(SQLiteHelper.TABLE_NAME, null, " " + SQLiteHelper.Table_Column_reg_Email + "=?", new String[]{EmailHolder}, null, null, null);

        while (cursor.moveToNext()) {

            if (cursor.isFirst()) {

                cursor.moveToFirst();

                // If Email is already exists then Result variable value set as Email Found.
                F_Result = "Email Found";

                // Closing cursor.
                cursor.close();
            }
        }

        // Calling method to check final result and insert data into SQLite database.
        CheckFinalResult();

    }


    // Checking result
    public void CheckFinalResult(){

        // Checking whether email is already exists or not.
        if(F_Result.equalsIgnoreCase("Email Found"))
        {

            // If email is exists then toast msg will display.
            Toast.makeText(RegisterActivity.this,"Email Already Exists",Toast.LENGTH_LONG).show();

        }
        else {

            // If email already dose n't exists then user registration details will entered to SQLite database.
            InsertDataIntoSQLiteDatabase();

        }

        F_Result = "Not_Found" ;

    }


}