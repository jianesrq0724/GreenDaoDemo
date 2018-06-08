package com.carl.mvpdemo.util.sql.helper;

import android.database.sqlite.SQLiteDatabase;

import com.carl.mvpdemo.BaseApplication;
import com.carl.mvpdemo.util.sql.entity.DaoMaster;
import com.carl.mvpdemo.util.sql.entity.DaoSession;

/**
 * @author Carl
 * version 1.0
 * @since 2018/6/8
 */
public class DaoMasterUtils {

    /**
     * 数据库名称
     */
    private static final String DATABASE_NAME = "carl.db";

    private DaoSession mDaoSession;

    private static final DaoMasterUtils ourInstance = new DaoMasterUtils();

    public static DaoMasterUtils getInstance() {
        return ourInstance;
    }

    public DaoMasterUtils() {
//        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(BaseApplication.getContext(), DATABASE_NAME);
        GreenDaoQLiteOpenHelper devOpenHelper = new GreenDaoQLiteOpenHelper(BaseApplication.getContext(), DATABASE_NAME, null);
        SQLiteDatabase writableDatabase = devOpenHelper.getWritableDatabase();
        mDaoSession = new DaoMaster(writableDatabase).newSession();
    }

    public DaoSession getDaoSection() {
        return mDaoSession;
    }
}
