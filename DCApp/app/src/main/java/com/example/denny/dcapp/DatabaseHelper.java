package com.example.denny.dcapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.os.Build;

/**
 * Created by Denny on 9/24/2015.
 */

public class DatabaseHelper extends SQLiteOpenHelper
{
    private static String TAG = "DatabaseHelper";
    private static String DB_PATH = "";
    private static String DB_NAME = "dcDB.db";
    private SQLiteDatabase mDataBase;
    private final Context mContext;
    private String DB_Query;
    List<String> list;
    SQLiteDatabase db;
    Cursor c;

    public DatabaseHelper(Context context)
    {
        super(context, DB_NAME, null, 1);
        if(Build.VERSION.SDK_INT >= 17)
        {
            DB_PATH = context.getApplicationInfo().dataDir + "/databases/";
        }
        else
        {
            DB_PATH = "/data/data/" + context.getPackageName() + "/databases/";
        }
        this.mContext = context;
    }
    public void createDataBase() throws IOException
    {
        boolean mDataBaseExist = checkDataBase();
        if(!mDataBaseExist)
        {
            this.getReadableDatabase();
            this.close();
            try
            {
                copyDataBase();
                Log.e(TAG, "createDatabase database created");
            }
            catch (IOException mIOException)
            {
                throw new Error("Error Copying DataBase");
            }
        }
    }
    private boolean checkDataBase()
    {
        File dbFile = new File(DB_PATH + DB_NAME);
        return dbFile.exists();
    }
    private void copyDataBase() throws IOException
    {
        InputStream mInput = mContext.getAssets().open(DB_NAME);
        String outFileName = DB_PATH + DB_NAME;
        OutputStream mOutput = new FileOutputStream(outFileName);
        byte[] mBuffer = new byte[1024];
        int mLength;
        while ((mLength = mInput.read(mBuffer)) > 0)
        {
            mOutput.write(mBuffer, 0, mLength);
        }
        mOutput.flush();
        mOutput.close();
        mInput.close();
    }
    public boolean openDataBase() throws SQLException
    {
        String mPath = DB_PATH + DB_NAME;
        mDataBase = SQLiteDatabase.openDatabase(mPath, null, SQLiteDatabase.CREATE_IF_NECESSARY);
        return mDataBase != null;
    }
    @Override
    public synchronized void close()
    {
        if(mDataBase != null)
            mDataBase.close();
        super.close();
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {   }
    public List<String> getAllHero()
    {
//        this.DB_Query = query;
        list = new ArrayList<>();
        db = this.getWritableDatabase();
        try
        {
            c = db.rawQuery("SELECT NAME FROM HERO", null);
            if(c == null) return null;

            String name;
            c.moveToFirst();
            do
            {
                name = c.getString(0);
                list.add(name);
            }
            while(c.moveToNext());
            c.close();
        }
        catch (Exception e)
        {
            Log.e("Database", e.getMessage());
        }
        db.close();
        return list;
    }
    public List<String> getAllVillain()
    {
        list = new ArrayList<>();
        db = this.getWritableDatabase();
        try
        {
            c = db.rawQuery("SELECT NAME FROM VILLAIN", null);
            if(c == null) return null;

            String name;
            c.moveToFirst();
            do
            {
                name = c.getString(0);
                list.add(name);
            }
            while(c.moveToNext());
            c.close();
        }
        catch (Exception e)
        {
            Log.e("Database", e.getMessage());
        }
        db.close();
        return list;
    }
    public List<String> getAllEquipment()
    {
        list = new ArrayList<>();
        db = this.getWritableDatabase();
        try
        {
            c = db.rawQuery("SELECT NAME FROM EQUIPMENT", null);
            if(c == null) return null;

            String name;
            c.moveToFirst();
            do
            {
                name = c.getString(0);
                list.add(name);
            }
            while(c.moveToNext());
        }
        catch (Exception e)
        {
            Log.e("Database", e.getMessage());
        }
        db.close();
        return list;
    }
    public List<String> getAllLocation()
    {
        list = new ArrayList<>();
        db = this.getWritableDatabase();
        try
        {
            c = db.rawQuery("SELECT NAME FROM LOCATION", null);
            if(c == null) return null;

            String name;
            c.moveToFirst();
            do
            {
                name = c.getString(0);
                list.add(name);
            }
            while(c.moveToNext());
        }
        catch (Exception e)
        {
            Log.e("Database", e.getMessage());
        }
        db.close();
        return list;
    }
    public List<String> getAllSuperpower()
    {
        list = new ArrayList<>();
        db = this.getWritableDatabase();
        try
        {
            c = db.rawQuery("SELECT NAME FROM SUPERPOWER", null);
            if(c == null) return null;

            String name;
            c.moveToFirst();
            do
            {
                name = c.getString(0);
                list.add(name);
            }
            while (c.moveToNext());
        }
        catch (Exception e)
        {
            Log.e("Database", e.getMessage());
        }
        db.close();
        return list;
    }
    public List<String> getAllSuperhero()
    {
        list = new ArrayList<>();
        db = this.getWritableDatabase();
        try
        {
            c = db.rawQuery("SELECT NAME FROM SUPERHERO", null);
            if(c == null) return null;

            String name;
            c.moveToFirst();
            do
            {
                name = c.getString(0);
                list.add(name);
            }
            while (c.moveToNext());
        }
        catch (Exception e)
        {
            Log.e("Database", e.getMessage());
        }
        db.close();
        return list;
    }
    public List<String> getAllSupervillain()
    {
        list = new ArrayList<>();
        db = this.getWritableDatabase();
        try
        {
            c = db.rawQuery("SELECT NAME FROM SUPERVILLAIN", null);
            if(c == null) return null;

            String name;
            c.moveToFirst();
            do
            {
                name = c.getString(0);
                list.add(name);
            }
            while (c.moveToNext());
        }
        catch (Exception e)
        {
            Log.e("Database", e.getMessage());
        }
        db.close();
        return list;
    }
    public List<String> getAllCrisis()
    {
        list = new ArrayList<>();
        db = this.getWritableDatabase();
        try
        {
            c = db.rawQuery("SELECT NAME FROM CRISIS", null);
            if(c == null) return null;

            String name;
            c.moveToFirst();
            do
            {
                name = c.getString(0);
                list.add(name);
            }
            while (c.moveToNext());
        }
        catch (Exception e)
        {
            Log.e("Database", e.getMessage());
        }
        //db.close();
        return list;
    }
}
