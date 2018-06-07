package us.mifeng.daggertwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import us.mifeng.daggertwo.dagger.DaggerFoodComponent;
import us.mifeng.daggertwo.dagger.Person;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.infoss)
    TextView info;
    @Inject
    Person person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DaggerFoodComponent.builder().build().injects(this);
        Log.e("tag", "--------------------" + person.eat());
        info.setText(person.eat()+"   ");
    }
}
