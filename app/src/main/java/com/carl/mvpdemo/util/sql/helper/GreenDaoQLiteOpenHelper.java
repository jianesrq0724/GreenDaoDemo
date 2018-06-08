package com.carl.mvpdemo.util.sql.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


import com.carl.mvpdemo.util.sql.entity.BaseInfo;
import com.carl.mvpdemo.util.sql.entity.BaseInfoDao;
import com.carl.mvpdemo.util.sql.entity.DaoMaster;
import com.carl.mvpdemo.util.sql.entity.OrderInfoDao;

import org.greenrobot.greendao.database.Database;

public class GreenDaoQLiteOpenHelper extends DaoMaster.OpenHelper {
    public GreenDaoQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }
    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
//        MigrationHelper.migrate(db,UserDao.class,User3Dao.class);
        MigrationHelper.migrate(db, new MigrationHelper.ReCreateAllTableListener() {

                    @Override
                    public void onCreateAllTables(Database db, boolean ifNotExists) {
                        DaoMaster.createAllTables(db, ifNotExists);
                    }

                    @Override
                    public void onDropAllTables(Database db, boolean ifExists) {
                        DaoMaster.dropAllTables(db, ifExists);
                    }
                }, BaseInfoDao.class, OrderInfoDao.class);
    }

}