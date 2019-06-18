package me.jay;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottom_nav);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        showfragments(new Option1_fragment());
    }

    private void showfragments(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Fragment openfragment=null;

        switch (menuItem.getItemId()){
            case R.id.option1:
                openfragment=new Option1_fragment();
                break;
            case R.id.option2:
                openfragment=new Option2_fragment();
                break;
            case R.id.option3:
                openfragment=new Option3_fragment();
                break;
            case R.id.option4:
                openfragment=new Option4_fragment();

        }

        if (openfragment!=null){
            showfragments(openfragment);
        }
        return false;

    }
}
