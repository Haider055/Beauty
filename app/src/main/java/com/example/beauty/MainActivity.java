package com.example.beauty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.beauty.fragments.fashionpage;
import com.example.beauty.fragments.homepage;
import com.example.beauty.fragments.offers;
import com.example.beauty.fragments.search;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.zagori.bottomnavbar.BottomNavBar;


public class MainActivity extends AppCompatActivity {

    com.zagori.bottomnavbar.BottomNavBar bottomNavBar;
//    BottomNavigationView bottomNavBar;
    TextView title;

    String hometag="home";
    String fashiontag="fashion";
    String offertag="offer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavBar=findViewById(R.id.bottom_nav_view);
        title=findViewById(R.id.title);

        homepage homepages = (homepage) getSupportFragmentManager().findFragmentByTag(hometag);
//        if (homepages.isVisible() && homepages!=null){
//
//        }
//        else {
            homepage homepage=new homepage();
            FragmentManager fragmentManagerpro = getSupportFragmentManager();
            FragmentTransaction fragmentTransactionpro = fragmentManagerpro.beginTransaction();
            fragmentTransactionpro.replace(R.id.frame, homepage,hometag);
            fragmentTransactionpro.commit();

//            homepage homepage1 = new homepage();
//            getSupportFragmentManager().beginTransaction().replace(R.id.container,
//                    homepage1,hometag).commit();
//
//        }

        bottomNavBar.setBottomNavigationListener(new BottomNavBar.OnBottomNavigationListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                if (menuItem.getItemId()==R.id.search){
                    search search = new search();
                    FragmentManager fragmentManagerpro = getSupportFragmentManager();
                    FragmentTransaction fragmentTransactionpro = fragmentManagerpro.beginTransaction();
                    fragmentTransactionpro.replace(R.id.frame, search);
                    fragmentTransactionpro.commit();

                    title.setText("Search");

                }
                if (menuItem.getItemId()==R.id.home){
                    homepage homepage = new homepage();
                    FragmentManager fragmentManagerpro = getSupportFragmentManager();
                    FragmentTransaction fragmentTransactionpro = fragmentManagerpro.beginTransaction();
                    fragmentTransactionpro.replace(R.id.frame, homepage);
                    fragmentTransactionpro.commit();

                    title.setText("Home page");

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
                return true;
            }
        });
    }
}