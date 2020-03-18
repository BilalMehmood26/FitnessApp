package com.bblaysstudio.fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private DietFragment mDietFragment;
    private ExerciseFragment mExerciseFragment;
    private WorkoutFragment mWorkoutFragment;
    private UtilityFragment mUtilityFragment;


    private BottomNavigationView mBottomNav;
    private FrameLayout mMainFram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Initialize Fragments
        mDietFragment = new DietFragment();
        mExerciseFragment = new ExerciseFragment();
        mUtilityFragment = new UtilityFragment();
        mWorkoutFragment = new WorkoutFragment();

        openFragment(mExerciseFragment);

        mBottomNav = (BottomNavigationView) findViewById(R.id.bottom_navigation_view);
        mMainFram = (FrameLayout) findViewById(R.id.main_frame);

        mBottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.nav_exercise:
                        openFragment(mExerciseFragment);
                        return true;
                    case R.id.nav_diet:
                        openFragment(mDietFragment);
                        return true;
                    case R.id.nav_utility:
                        openFragment(mUtilityFragment);
                        return true;
                    case R.id.nav_workout:
                        openFragment(mWorkoutFragment);
                        return true;
                    default:
                        return false;
                }

            }

        });


    }
    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    };
}
