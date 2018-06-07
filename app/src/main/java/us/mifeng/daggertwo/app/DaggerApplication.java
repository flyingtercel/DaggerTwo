package us.mifeng.daggertwo.app;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by 黑夜之火 on 2018/6/6.
 */

public class DaggerApplication extends Application{


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
