package us.mifeng.daggertwo.dagger;

import javax.inject.Inject;

/**
 * Created by 黑夜之火 on 2018/6/6.
 */

public class Person {
    public Food food;

    @Inject
    public Person(Food food) {
        this.food = food;
    }
    public String eat(){
        return food.eated();
    }
}
