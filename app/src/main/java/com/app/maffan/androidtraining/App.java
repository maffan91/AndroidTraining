package com.app.maffan.androidtraining;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.app.maffan.androidtraining.models.DaoMaster;
import com.app.maffan.androidtraining.models.DaoSession;

/**
 * Created by maffan on 5/16/17.
 */

public class App extends Application {

    DaoMaster.DevOpenHelper helper;
    private static DaoSession daoSession;


    @Override
    public void onCreate() {
        super.onCreate();

    }



    private void initializeDb(){

        helper = new DaoMaster.DevOpenHelper(this, "users-db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    public DaoSession getDaoSession(){

        if(daoSession == null){
            initializeDb();
        }
        return daoSession;
    }
}
