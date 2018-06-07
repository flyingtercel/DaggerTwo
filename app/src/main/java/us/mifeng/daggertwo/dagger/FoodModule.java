package us.mifeng.daggertwo.dagger;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 黑夜之火 on 2018/6/7.
 */

@Module
public class FoodModule {
    /*@Provides
    public Food provideFood(){
        return new Food();
    }*/
    @Provides
    public Person providePerson(Food food){
        return new Person(food);
    }

    @Provides
    public Person providePerson2(Food food){
        return new Person(food);
    }

}
