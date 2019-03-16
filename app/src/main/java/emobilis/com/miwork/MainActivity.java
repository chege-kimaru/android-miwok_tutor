package emobilis.com.miwork;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view pager that will allow users to swipe through fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        //Create an adapter that knows which fragment will be created on each page
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());

        //Set the adapter onto the view pager
        viewPager.setAdapter(categoryAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);

    }

}
