package com.example.fragment_bottomnavigation.ui.home;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class HelperClass extends SQLiteOpenHelper {
    Context context;

    public HelperClass(@Nullable Context context) {
        super(context, "OdsDatabase1.db", null, 11);
        this.context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create Table Emp(Sno Integer primary key,Name text,Desg text,Addr text)");
        //  db.execSQL("Create Table TeacherD(Sno Integer primary key,Tname text,Subject text)");
        //Toast.makeText(context, "Sql Started", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
//        if (i < i1) {
//            sqLiteDatabase.execSQL("ALTER TABLE ODSTable ADD Mobile TEXT");
//            sqLiteDatabase.execSQL("ALTER TABLE ODSTable ADD Address TEXT");
//        }

    }



    public long createMethod(SQLiteDatabase sqldb, int sno, String name, String desg, String addrs) {

   ContentValues cv=new ContentValues();
   cv.put("Sno",sno);
   cv.put("Name",name);
   cv.put("Desg",desg);
   cv.put("Addr",addrs);
   long set=sqldb.insert("Emp",null,cv);
   return set;
    }
}
