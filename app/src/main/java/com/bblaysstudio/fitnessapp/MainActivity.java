package com.bblaysstudio.fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.bblaysstudio.fitnessapp.Adapters.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    private DietFragment mDietFragment;
    private ExerciseFragment mExerciseFragment;
    private WorkoutFragment mWorkoutFragment;
    private UtilityFragment mUtilityFragment;


    private DrawerLayout drawer;
    private BottomNavigationView mBottomNav;
    private FrameLayout mMainFram;
    private ViewPager mViewPager;
    MenuItem prevMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Drawer layout
       /* drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.Navigation_drawer_open,
                R.string.Navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();*/

        //Initialize ViewPager and its Resource Id
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        setUpViewPager(mViewPager);

        //Initialize Fragments
        /** mDietFragment = new DietFragment();
         mExerciseFragment = new ExerciseFragment();
         mUtilityFragment = new UtilityFragment();
         mWorkoutFragment = new WorkoutFragment();*/


        mBottomNav = (BottomNavigationView) findViewById(R.id.bottom_navigation_view);
        mMainFram = (FrameLayout) findViewById(R.id.main_frame);

        mBottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.nav_exercise:
                        mViewPager.setCurrentItem(0);
                        return true;
                    case R.id.nav_workout:
                        mViewPager.setCurrentItem(1);
                        return true;
                    case R.id.nav_diet:
                        mViewPager.setCurrentItem(2);
                        return true;
                    case R.id.nav_utility:
                        mViewPager.setCurrentItem(3);
                        return true;

                    default:
                        return false;
                }

            }

        });


        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                }
                else
                {
                    mBottomNav.getMenu().getItem(0).setChecked(false);
                }
                mBottomNav.getMenu().getItem(position).setChecked(true);
                prevMenuItem = mBottomNav.getMenu().getItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }


    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


    //method for View Pager
    private void setUpViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new ExerciseFragment());
        viewPagerAdapter.addFragment(new WorkoutFragment());
        viewPagerAdapter.addFragment(new DietFragment());
        viewPagerAdapter.addFragment(new UtilityFragment());
        viewPager.setAdapter(viewPagerAdapter);
    }
}
