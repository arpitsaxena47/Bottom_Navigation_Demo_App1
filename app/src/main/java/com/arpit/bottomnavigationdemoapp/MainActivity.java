package com.arpit.bottomnavigationdemoapp;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.arpit.bottomnavigationdemoapp.ui.UI.birds.BirdsFragment;
import com.arpit.bottomnavigationdemoapp.ui.UI.bulls.BullsFragment;
import com.arpit.bottomnavigationdemoapp.ui.UI.home.HomeFragment;
import com.arpit.bottomnavigationdemoapp.ui.UI.reptiles.ReptilesFragment;
import com.arpit.bottomnavigationdemoapp.ui.UI.wildcats.WildCatFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener =
        new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.navigation_wildCats:
                        switchToWildCatsFragment();
                        break;

                    case R.id.navigation_reptile:
                        switchToReptilesFragment();
                        break;

                    case R.id.navigation_home:
                        switchToHomeFragment();
                        break;

                    case R.id.navigation_bull:
                        switchTBullsFragment();
                        break;

                    case R.id.navigation_bird:
                        switchToBirdsFragment();
                        break;
                }
           return true; }
        };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.navigation_wildCats,
                R.id.navigation_reptile , R.id.navigation_home, R.id.navigation_bull, R.id.navigation_bird)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        switchToHomeFragment();

    }

    public void switchToWildCatsFragment() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.nav_host_fragment, new WildCatFragment()).commit();
    }

    public void switchToReptilesFragment() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.nav_host_fragment, new ReptilesFragment()).commit();
    }

    public void switchToHomeFragment() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.nav_host_fragment, new HomeFragment()).commit();
    }

    public void switchTBullsFragment() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.nav_host_fragment, new BullsFragment()).commit();
    }

    public void switchToBirdsFragment() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.nav_host_fragment, new BirdsFragment()).commit();
    }



}