package us.mifeng.daggertwo.dagger;

import javax.inject.Inject;

/**
 * Created by 黑夜之火 on 2018/6/6.
 */

public class Food {
    @Inject
    public Food() {

    }
    public String eated(){
        return "吃好吃的东西!!!";
    }
}
