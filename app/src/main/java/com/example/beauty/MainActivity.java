package com.example.beauty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.beauty.fragments.fashionpage;
import com.example.beauty.fragments.homepage;
import com.example.beauty.fragments.offers;
import com.zagori.bottomnavbar.BottomNavBar;


public class MainActivity extends AppCompatActivity {

    com.zagori.bottomnavbar.BottomNavBar bottomNavBar;
    TextView title;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        bottomNavBar=findViewById(R.id.bottom_nav_view);
        title=findViewById(R.id.title);

        homepage homepage = new homepage();
        FragmentManager fragmentManagerpro = getSupportFragmentManager();
        FragmentTransaction fragmentTransactionpro = fragmentManagerpro.beginTransaction();
        fragmentTransactionpro.replace(R.id.frame, homepage);
        fragmentTransactionpro.commit();


        bottomNavBar.setBottomNavigationListener(new BottomNavBar.OnBottomNavigationListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                if (menuItem.getItemId()==R.id.search){
                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                }
                if (menuItem.getItemId()==R.id.home){
                    homepage homepage = new homepage();
                    FragmentManager fragmentManagerpro = getSupportFragmentManager();
                    FragmentTransaction fragmentTransactionpro = fragmentManagerpro.beginTransaction();
                    fragmentTransactionpro.replace(R.id.frame, homepage);
                    fragmentTransactionpro.commit();
                }
                if (menuItem.getItemId()==R.id.cart){
                    fashionpage fashionpage = new fashionpage();
                    FragmentManager fragmentManagerpro = getSupportFragmentManager();
                    FragmentTransaction fragmentTransactionpro = fragmentManagerpro.beginTransaction();
                    fragmentTransactionpro.replace(R.id.frame, fashionpage);
                    fragmentTransactionpro.commit();

                    title.setText("Fashion");

                }

                if (menuItem.getItemId()==R.id.favorite){
                    offers offers = new offers();
                    FragmentManager fragmentManagerpro = getSupportFragmentManager();
                    FragmentTransaction fragmentTransactionpro = fragmentManagerpro.beginTransaction();
                    fragmentTransactionpro.replace(R.id.frame, offers);
                    fragmentTransactionpro.commit();

                    title.setText("Offers");

                }



                return false;
            }
        });
    }
}