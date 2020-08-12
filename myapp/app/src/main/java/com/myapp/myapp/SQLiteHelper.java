package com.myapp.myapp;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.support.annotation.RequiresApi;

public class SQLiteHelper extends SQLiteOpenHelper {


    Cursor c;

    public static final String Table_Column_emp1_e1 = "ID";
    public static final String Table_Column_emp1_e2 = "Date";
    public static final String Table_Column_emp1_e3 = "Project";
    public static final String Table_Column_emp1_e4 = "Lines";


    public static final String Table_Column_emp2_e1 = "ID";
    public static final String Table_Column_emp2_e2 = "Date";
    public static final String Table_Column_emp2_e3 = "Project";
    public static final String Table_Column_emp2_e4 = "Lines";

    public static final String Table_Column_mng_m1 = "Date";
    public static final String Table_Column_mng_m2 = "Project";
    public static final String Table_Column_mng_m3 = "idea";

    public static final String Table_Column_emp3_e1 = "ID";
    public static final String Table_Column_emp3_e2 = "Date";
    public static final String Table_Column_emp3_e3 = "Project";
    public static final String Table_Column_emp3_e4 = "Lines";;

    public static final String Table_Column_emp4_e1 = "ID";
    public static final String Table_Column_emp4_e2 = "Date";
    public static final String Table_Column_emp4_e3 = "Project";
    public static final String Table_Column_emp4_e4 = "Lines";

    public static final String Table_Column_emp5_e1 = "ID";
    public static final String Table_Column_emp5_e2 = "Date";
    public static final String Table_Column_emp5_e3 = "Project";
    public static final String Table_Column_emp5_e4 = "Lines";

    public static final String Table_Column_emp6_e1 ="ID";
    public static final String Table_Column_emp6_e2 = "Date";
    public static final String Table_Column_emp6_e3 = "Project";
    public static final String Table_Column_emp6_e4 = "Lines";

    public static final String Table_Column_emp7_e1 ="ID";
    public static final String Table_Column_emp7_e2 = "Date";
    public static final String Table_Column_emp7_e3 = "Project";
    public static final String Table_Column_emp7_e4 = "Lines";

    public static final String Table_Column_emp8_e1 = "ID";
    public static final String Table_Column_emp8_e2 ="Date";
    public static final String Table_Column_emp8_e3 = "Project";
    public static final String Table_Column_emp8_e4 = "Lines";

    public static final String Table_Column_emp9_e1 = "ID";
    public static final String Table_Column_emp9_e2 = "Date";
    public static final String Table_Column_emp9_e3 = "Project";
    public static final String Table_Column_emp9_e4 = "Lines";

    public static final String Table_Column_tl1_e1 = "ID";
    public static final String Table_Column_tl1_e2 = "Date";
    public static final String Table_Column_tl1_e3 = "Project";
    public static final String Table_Column_tl1_e4 = "Lines";

    public static final String Table_Column_tl2_e1 ="ID";
    public static final String Table_Column_tl2_e2 = "Date";
    public static final String Table_Column_tl2_e3 = "Project";
    public static final String Table_Column_tl2_e4 = "Lines";

    public static final String Table_Column_tl3_e1 = "ID";
    public static final String Table_Column_tl3_e2 = "Date";
    public static final String Table_Column_tl3_e3 = "Project";
    public static final String Table_Column_tl3_e4 = "Lines";

    public static final String Table_Column_eni1_e1 = "ini";
    public static final String Table_Column_eni1_e2 = "ID";

    public static String DATABASE_NAME = "UserDataBase";

    public static final String TABLE_NAME = "UserTable";
    public static final String TABLE_NAME1 = "TABLE_EMP1";
    public static final String TABLE_NAME2 = "TABLE_EMP2";
    public static final String TABLE_NAME3 = "TABLE_EMP3";
    public static final String TABLE_NAME4 = "TABLE_EMP4";
    public static final String TABLE_NAME5 = "TABLE_EMP5";
    public static final String TABLE_NAME6 = "TABLE_EMP6";
    public static final String TABLE_NAME7 = "TABLE_EMP7";
    public static final String TABLE_NAME8 = "TABLE_EMP8";
    public static final String TABLE_NAME9 = "TABLE_EMP9";
    public static final String TABLE_NAME10 = "TABLE_EMP10";
    public static final String TABLE_NAME11 = "TABLE_EMP11";
    public static final String TABLE_NAME12 = "TABLEMNG";
    public static final String TABLE_NAME13 = "TABLE_EMP13";
    public static final String TABLE_NAME20 = "TABLE_EMP20";

    public static final String Table_Column_reg_Name = "name";
    public static final String Table_Column_reg_Email = "email";
    public static final String Table_Column_reg_Password = "password";
    public static final String Table_Column_reg_PhoneNumber = "phonenumber";
    public static final String Table_Column_reg_SurName = "surname";
    public static final String Table_Column_reg_DOB = "dob";
    // public static final String Table_Column_7_ProfileText = "profileText";

    public SQLiteHelper(Context context) {

        super( context, DATABASE_NAME, null, 1 );

    }

    @Override
    public void onCreate(SQLiteDatabase database) {

        String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" + Table_Column_reg_Name + " VARCHAR, " +
                "" + Table_Column_reg_Email + " " + "VARCHAR, " + "" + Table_Column_reg_Password + " VARCHAR ," + Table_Column_reg_PhoneNumber + " VARCHAR," +
                Table_Column_reg_SurName + " VARCHAR," + Table_Column_reg_DOB + " VARCHAR)";
        database.execSQL( CREATE_TABLE );


        String CREATE_TABLE1 = "CREATE TABLE  " + TABLE_NAME1 + "( "
                + Table_Column_emp1_e1 + " VARCHAR, "
                + Table_Column_emp1_e2 + " VARCHAR, "
                + Table_Column_emp1_e3 + " VARCHAR," + Table_Column_emp1_e4 + " VARCHAR);";
        database.execSQL( CREATE_TABLE1 );

        String CREATE_TABLE2 = "CREATE TABLE  " + TABLE_NAME2 + "( "
                + Table_Column_emp2_e1 + " VARCHAR, "
                + Table_Column_emp2_e2 + " VARCHAR, "
                + Table_Column_emp2_e3 + " VARCHAR," + Table_Column_emp2_e4 + " VARCHAR);";
        database.execSQL( CREATE_TABLE2 );

        String CREATE_TABLE3 = "CREATE TABLE  " + TABLE_NAME3 + "( "
                + Table_Column_emp3_e1 + " VARCHAR, "
                + Table_Column_emp3_e2 + " VARCHAR, "
                + Table_Column_emp3_e3 + " VARCHAR," + Table_Column_emp3_e4 + " VARCHAR);";
        database.execSQL( CREATE_TABLE3 );

        String CREATE_TABLE4 = "CREATE TABLE  " + TABLE_NAME4 + "( "
                + Table_Column_emp4_e1 + " VARCHAR, "
                + Table_Column_emp4_e2 + " VARCHAR, "
                + Table_Column_emp4_e3 + " VARCHAR," + Table_Column_emp4_e4 + " VARCHAR);";
        database.execSQL( CREATE_TABLE4 );

        String CREATE_TABLE5 = "CREATE TABLE  " + TABLE_NAME5 + "( "
                + Table_Column_emp5_e1 + " VARCHAR, "
                + Table_Column_emp5_e2 + " VARCHAR, "
                + Table_Column_emp5_e3 + " VARCHAR," + Table_Column_emp5_e4 + " VARCHAR);";
        database.execSQL( CREATE_TABLE5 );

        String CREATE_TABLE6 = "CREATE TABLE  " + TABLE_NAME6 + "( "
                + Table_Column_emp6_e1 + " VARCHAR, "
                + Table_Column_emp6_e2 + " VARCHAR, "
                + Table_Column_emp6_e3 + " VARCHAR," + Table_Column_emp6_e4 + " VARCHAR);";
        database.execSQL( CREATE_TABLE6 );

        String CREATE_TABLE7 = "CREATE TABLE  " + TABLE_NAME7 + "( "
                + Table_Column_emp7_e1 + " VARCHAR, "
                + Table_Column_emp7_e2 + " VARCHAR, "
                + Table_Column_emp7_e3 + " VARCHAR," + Table_Column_emp7_e4 + " VARCHAR);";
        database.execSQL( CREATE_TABLE7 );

        String CREATE_TABLE8 = "CREATE TABLE  " + TABLE_NAME8 + "( "
                + Table_Column_emp8_e1 + " VARCHAR, "
                + Table_Column_emp8_e2 + " VARCHAR, "
                + Table_Column_emp8_e3 + " VARCHAR," + Table_Column_emp8_e4 + " VARCHAR);";
        database.execSQL( CREATE_TABLE8 );

        String CREATE_TABLE9 = "CREATE TABLE  " + TABLE_NAME9 + "( "
                + Table_Column_emp9_e1 + " VARCHAR, "
                + Table_Column_emp9_e2 + " VARCHAR, "
                + Table_Column_emp9_e3 + " VARCHAR," + Table_Column_emp9_e4 + " VARCHAR);";
        database.execSQL( CREATE_TABLE9 );

        String CREATE_TABLE10 = "CREATE TABLE  " + TABLE_NAME10 + "( "
                + Table_Column_tl1_e1 + " VARCHAR, "
                + Table_Column_tl1_e2 + " VARCHAR, "
                + Table_Column_tl1_e3 + " VARCHAR," + Table_Column_tl1_e4 + " VARCHAR);";
        database.execSQL( CREATE_TABLE10 );

        String CREATE_TABLE11 = "CREATE TABLE  " + TABLE_NAME11 + "( "
                + Table_Column_tl2_e1 + " VARCHAR, "
                + Table_Column_tl2_e2 + " VARCHAR, "
                + Table_Column_tl2_e3 + " VARCHAR," + Table_Column_tl2_e4 + " VARCHAR);";
        database.execSQL( CREATE_TABLE11 );

        String CREATE_TABLE13 = "CREATE TABLE  " + TABLE_NAME13 + "( "
                + Table_Column_tl3_e1 + " VARCHAR, "
                + Table_Column_tl3_e2 + " VARCHAR, "
                + Table_Column_tl3_e3 + " VARCHAR," + Table_Column_tl3_e4 + " VARCHAR);";
        database.execSQL( CREATE_TABLE13 );

        String CREATE_TABLE12 = "CREATE TABLE  " + TABLE_NAME12 + "( "
                + Table_Column_mng_m1 + " VARCHAR, "
                + Table_Column_mng_m2 + " VARCHAR, "
                + Table_Column_mng_m3 + " VARCHAR);";
        database.execSQL( CREATE_TABLE12 );

        String CREATE_TABLE20 = "CREATE TABLE  " + TABLE_NAME20 + "( "
                + Table_Column_eni1_e1 + " VARCHAR, "
                + Table_Column_eni1_e2 + " VARCHAR);";
        database.execSQL( CREATE_TABLE20 );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME );
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME1 );
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME2 );
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME3 );
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME4 );
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME5 );
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME6 );
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME7 );
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME8 );
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME9 );
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME10 );
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME11 );
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME12 );
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME13 );
        db.execSQL( "DROP TABLE IF EXISTS " + TABLE_NAME20 );
        onCreate( db );

    }
    public Cursor getAlldata() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME, null );
        return res;
    }


    public Cursor getAlldata1() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME1, null );
        return res;
    }

    public Cursor getAlldata12() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME12, null );
        return res;
    }

    public Cursor getAlldata2() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME2, null );
        return res;
    }

    public Cursor getAlldata3() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME3, null );
        return res;
    }

    public Cursor getAlldata4() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME4, null );
        return res;
    }

    public Cursor getAlldata5() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME5, null );
        return res;
    }

    public Cursor getAlldata6() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME6, null );
        return res;
    }

    public Cursor getAlldata7() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME7, null );
        return res;
    }

    public Cursor getAlldata8() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME8, null );
        return res;
    }

    public Cursor getAlldata9() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME9, null );
        return res;
    }

    public Cursor getAlldata10() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME10, null );
        return res;
    }

    public Cursor getAlldata11() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME11, null );
        return res;
    }

    public Cursor getAlldata13() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME13, null );
        return res;
    }



    public Cursor getAlldata20() {
        SQLiteDatabase db = this.getWritableDatabase( );
        Cursor res = db.rawQuery( "Select * from " + TABLE_NAME20 , null );
        return res;
    }

    public boolean updateData(String empId, String date, String project, String lines) {
        SQLiteDatabase db = this.getWritableDatabase( );
        ContentValues cv = new ContentValues( );
        cv.put( Table_Column_emp1_e1, empId );
        cv.put( Table_Column_emp1_e2, date );
        cv.put( Table_Column_emp1_e3, project );
        cv.put( Table_Column_emp1_e4, lines );
        db.update( TABLE_NAME1, cv, "ID = ?", new String[]{empId} );
        return true;
    }

    public boolean updateData2(String empId, String date, String project, String lines) {
        SQLiteDatabase db = this.getWritableDatabase( );
        ContentValues cv = new ContentValues( );
        cv.put( Table_Column_emp2_e1, empId );
        cv.put( Table_Column_emp2_e2, date );
        cv.put( Table_Column_emp2_e3, project );
        cv.put( Table_Column_emp2_e4, lines );
        db.update( TABLE_NAME2, cv, "ID = ?", new String[]{empId} );
        return true;
    }
    public boolean updateData3(String empId, String date, String project, String lines) {
        SQLiteDatabase db = this.getWritableDatabase( );
        ContentValues cv = new ContentValues( );
        cv.put( Table_Column_emp3_e1, empId );
        cv.put( Table_Column_emp3_e2, date );
        cv.put( Table_Column_emp3_e3, project );
        cv.put( Table_Column_emp3_e4, lines );
        db.update( TABLE_NAME3, cv, "ID = ?", new String[]{empId} );
        return true;
    }
    public boolean updateData4(String empId, String date, String project, String lines) {
        SQLiteDatabase db = this.getWritableDatabase( );
        ContentValues cv = new ContentValues( );
        cv.put( Table_Column_emp4_e1, empId );
        cv.put( Table_Column_emp4_e2, date );
        cv.put( Table_Column_emp4_e3, project );
        cv.put( Table_Column_emp4_e4, lines );
        db.update( TABLE_NAME4, cv, "ID = ?", new String[]{empId} );
        return true;
    }
    public boolean updateData5(String empId, String date, String project, String lines) {
        SQLiteDatabase db = this.getWritableDatabase( );
        ContentValues cv = new ContentValues( );
        cv.put( Table_Column_emp5_e1, empId );
        cv.put( Table_Column_emp5_e2, date );
        cv.put( Table_Column_emp5_e3, project );
        cv.put( Table_Column_emp5_e4, lines );
        db.update( TABLE_NAME5, cv, "ID = ?", new String[]{empId} );
        return true;
    }
    public boolean updateData6(String empId, String date, String project, String lines) {
        SQLiteDatabase db = this.getWritableDatabase( );
        ContentValues cv = new ContentValues( );
        cv.put( Table_Column_emp6_e1, empId );
        cv.put( Table_Column_emp6_e2, date );
        cv.put( Table_Column_emp6_e3, project );
        cv.put( Table_Column_emp6_e4, lines );
        db.update( TABLE_NAME6, cv, "ID = ?", new String[]{empId} );
        return true;
    }
    public boolean updateData7(String empId, String date, String project, String lines) {
        SQLiteDatabase db = this.getWritableDatabase( );
        ContentValues cv = new ContentValues( );
        cv.put( Table_Column_emp7_e1, empId );
        cv.put( Table_Column_emp7_e2, date );
        cv.put( Table_Column_emp7_e3, project );
        cv.put( Table_Column_emp7_e4, lines );
        db.update( TABLE_NAME7, cv, "ID = ?", new String[]{empId} );
        return true;
    }
    public boolean updateData8(String empId, String date, String project, String lines) {
        SQLiteDatabase db = this.getWritableDatabase( );
        ContentValues cv = new ContentValues( );
        cv.put( Table_Column_emp8_e1, empId );
        cv.put( Table_Column_emp8_e2, date );
        cv.put( Table_Column_emp8_e3, project );
        cv.put( Table_Column_emp8_e4, lines );
        db.update( TABLE_NAME8, cv, "ID = ?", new String[]{empId} );
        return true;
    }
    public boolean updateData9(String empId, String date, String project, String lines) {
        SQLiteDatabase db = this.getWritableDatabase( );
        ContentValues cv = new ContentValues( );
        cv.put( Table_Column_emp9_e1, empId );
        cv.put( Table_Column_emp9_e2, date );
        cv.put( Table_Column_emp9_e3, project );
        cv.put( Table_Column_emp9_e4, lines );
        db.update( TABLE_NAME9, cv, "ID = ?", new String[]{empId} );
        return true;
    }
    public boolean updateData10(String TeamId, String date, String project, String lines) {
        SQLiteDatabase db = this.getWritableDatabase( );
        ContentValues cv = new ContentValues( );
        cv.put( Table_Column_tl1_e1,TeamId );
        cv.put( Table_Column_tl1_e2, date );
        cv.put( Table_Column_tl1_e3, project );
        cv.put( Table_Column_tl1_e4, lines );
        db.update( TABLE_NAME10, cv, "ID = ?", new String[]{TeamId} );
        return true;
    }
    public boolean updateData11(String TeamId, String date, String project, String lines) {
        SQLiteDatabase db = this.getWritableDatabase( );
        ContentValues cv = new ContentValues( );
        cv.put( Table_Column_tl2_e1,TeamId );
        cv.put( Table_Column_tl2_e2, date );
        cv.put( Table_Column_tl2_e3, project );
        cv.put( Table_Column_tl2_e4, lines );
        db.update( TABLE_NAME11, cv, "ID = ?", new String[]{TeamId} );
        return true;
    }

    public boolean updateData13(String TeamId, String date, String project, String lines) {
        SQLiteDatabase db = this.getWritableDatabase( );
        ContentValues cv = new ContentValues( );
        cv.put( Table_Column_tl3_e1,TeamId );
        cv.put( Table_Column_tl3_e2, date );
        cv.put( Table_Column_tl3_e3, project );
        cv.put( Table_Column_tl3_e4, lines );
        db.update( TABLE_NAME13, cv, "ID = ?", new String[]{TeamId} );
        return true;
    }

    public boolean updateData30(String date, String pro, String idea) {
        SQLiteDatabase db = this.getWritableDatabase( );
        ContentValues cv = new ContentValues( );
        cv.put( Table_Column_mng_m1,date );
        cv.put( Table_Column_mng_m2,pro);
        cv.put( Table_Column_mng_m3,idea );

        db.update( TABLE_NAME12, cv, "Date = ?", new String[]{date} );
        return true;
    }
}

