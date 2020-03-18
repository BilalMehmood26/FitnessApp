package com.bblaysstudio.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.bblaysstudio.fitnessapp.Adapters.Exercise_List_Adapter;
import com.bblaysstudio.fitnessapp.Adapters.Model_Class;

import java.util.ArrayList;

public class Exercise_list extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Model_Class> arrayList = new ArrayList<>();
    private String fulldata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_list);


        fulldata = getIntent().getStringExtra("workout");

        recyclerView = findViewById(R.id.recycler3);

        Exercise_List_Adapter adapter = new Exercise_List_Adapter(arrayList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(adapter);

        if (fulldata.equals("Chest")) {
            chest();
        } else if (fulldata.equals("Biceps")) {
            biceps();
        } else if (fulldata.equals("Triceps")) {
            tricep();
        }
        else if (fulldata.equals("Uper Body")) {
            chest();
            tricep();
            shoulders();
        }
        else if (fulldata.equals("Shoulders")) {
                shoulders();
        }
        else if (fulldata.equals("ABS")) {
                    abs();
        }
        else if (fulldata.equals("Wings")) {
            wings();
        }
        else if (fulldata.equals("Legs")) {
                legs();
        }

        else if (fulldata.equals("Lower Body")) {
            legs();
        }
        else if (fulldata.equals("Full Body")) {
            chest();
            tricep();
            biceps();
            shoulders();
        }

    }

    private void wings() {
        Model_Class modelClass = new Model_Class("Wing Weight Press", drawableToBitmap(R.drawable.wing1), R.drawable.wing1, "Lie on a flat bench, holding the dumbbells in your hands. Stretch your arms over your shoulder, shoulder-width apart. From this starting position, inhale and descend slowly until your elbows are parallel to the floor at a 90°angle. Then push the weights back up while exhaling to return to the starting position.");
        arrayList.add(modelClass);

        modelClass = new Model_Class("Double Dumbel Bench Laying", drawableToBitmap(R.drawable.wing2), R.drawable.wing2, "Lie on a bench with an incline with a dumbbell in each hand. Then lift the dumbbells shoulder-width apart, arms extended and rotate your wrists so that the palms of your hands are facing each other. Stay in control of the dumbbells at all times and slowly lower the weights while inhaling. Then exhale pushing the dumbbells upwards with the help of your chest.");
        arrayList.add(modelClass);

        modelClass = new Model_Class("Single Bench Laying", drawableToBitmap(R.drawable.wing3), R.drawable.wing3,"Secure your legs at the end of the declined bench first and then lie down with a dumbbell in each hand. Once lie down, move the dumbbells above your shoulders (shoulder width apart), palms facing each other. Lower the weights slowly until your elbows are parallel to the floor. Then bring the dumbbells back up while exhaling and contracting your chest.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Rod Extension", drawableToBitmap(R.drawable.wing4), R.drawable.wing4, "Lie on a flat bench with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, shoulder-width apart but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
    }

    private void legs() {
        Model_Class modelClass = new Model_Class("Angeled Leg Press", drawableToBitmap(R.drawable.leg1), R.drawable.leg1, "Lie on a flat bench, holding the dumbbells in your hands. Stretch your arms over your shoulder, shoulder-width apart. From this starting position, inhale and descend slowly until your elbows are parallel to the floor at a 90°angle. Then push the weights back up while exhaling to return to the starting position.");
        arrayList.add(modelClass);

        modelClass = new Model_Class("Flat Bench Laying", drawableToBitmap(R.drawable.leg2), R.drawable.leg2, "Lie on a bench with an incline with a dumbbell in each hand. Then lift the dumbbells shoulder-width apart, arms extended and rotate your wrists so that the palms of your hands are facing each other. Stay in control of the dumbbells at all times and slowly lower the weights while inhaling. Then exhale pushing the dumbbells upwards with the help of your chest.");
        arrayList.add(modelClass);

        modelClass = new Model_Class("Flat Bench Laying", drawableToBitmap(R.drawable.leg3), R.drawable.leg3,"Secure your legs at the end of the declined bench first and then lie down with a dumbbell in each hand. Once lie down, move the dumbbells above your shoulders (shoulder width apart), palms facing each other. Lower the weights slowly until your elbows are parallel to the floor. Then bring the dumbbells back up while exhaling and contracting your chest.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Leg Extension", drawableToBitmap(R.drawable.leg4), R.drawable.leg4, "Lie on a flat bench with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, shoulder-width apart but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Leg Rises", drawableToBitmap(R.drawable.leg5), R.drawable.leg5, "Lie on a bench with an incline with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, to the width of your shoulders but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("One leg Rise", drawableToBitmap(R.drawable.leg6), R.drawable.leg6, "Secure your legs at the end of a bench at a decline first and then lie down with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, to the width of your shoulders but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Seated leg Crul", drawableToBitmap(R.drawable.leg7), R.drawable.leg7, "Chest dips are a fantastic exercise to build a strong chest and some even argue that it is the overall best chest exercise. This exercise not only adds depth to the chest but it adds width as well. Moreover, as your body isn’t supported by the bench like in a regularchestpress, it means that other muscles are worked as you have to work harder to stabilize your body weight.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Single Leg Crul", drawableToBitmap(R.drawable.leg8), R.drawable.leg8, "Secure your legs at the end of a bench at a decline first and then lie down with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, to the width of your shoulders but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Hanging Leg", drawableToBitmap(R.drawable.leg9), R.drawable.leg9, "Hanging Leg are a fantastic exercise to build a strong chest and some even argue that it is the overall best chest exercise. This exercise not only adds depth to the chest but it adds width as well. Moreover, as your body isn’t supported by the bench like in a regularchestpress, it means that other muscles are worked as you have to work harder to stabilize your body weight.");
        arrayList.add(modelClass);
    }

    private void abs() {
        Model_Class modelClass = new Model_Class("Stright laying", drawableToBitmap(R.drawable.ab1), R.drawable.ab1, "Lie on a flat bench, holding the dumbbells in your hands. Stretch your arms over your shoulder, shoulder-width apart. From this starting position, inhale and descend slowly until your elbows are parallel to the floor at a 90°angle. Then push the weights back up while exhaling to return to the starting position.");
        arrayList.add(modelClass);

        modelClass = new Model_Class("Inverse laying", drawableToBitmap(R.drawable.ab2), R.drawable.ab2, "Lie on a bench with an incline with a dumbbell in each hand. Then lift the dumbbells shoulder-width apart, arms extended and rotate your wrists so that the palms of your hands are facing each other. Stay in control of the dumbbells at all times and slowly lower the weights while inhaling. Then exhale pushing the dumbbells upwards with the help of your chest.");
        arrayList.add(modelClass);

        modelClass = new Model_Class("Stright Head Above", drawableToBitmap(R.drawable.ab3), R.drawable.ab3, "Secure your legs at the end of the declined bench first and then lie down with a dumbbell in each hand. Once lie down, move the dumbbells above your shoulders (shoulder width apart), palms facing each other. Lower the weights slowly until your elbows are parallel to the floor. Then bring the dumbbells back up while exhaling and contracting your chest.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Bench Laying", drawableToBitmap(R.drawable.ab4), R.drawable.ab4, "Lie on a flat bench with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, shoulder-width apart but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Head down lifting", drawableToBitmap(R.drawable.ab5), R.drawable.ab5, "Lie on a bench with an incline with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, to the width of your shoulders but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Outer single Fly", drawableToBitmap(R.drawable.ab6), R.drawable.ab6, "Secure your legs at the end of a bench at a decline first and then lie down with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, to the width of your shoulders but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Dumble lifting", drawableToBitmap(R.drawable.ab7), R.drawable.ab7, "Dumble lifting are a fantastic exercise to build a strong arms and some even argue that it is the overall best chest exercise. This exercise not only adds depth to the chest but it adds width as well. Moreover, as your body isn’t supported by the bench like in a regular chest press, it means that other muscles are worked as you have to work harder to stabilize your body weight.");
        arrayList.add(modelClass);

        modelClass = new Model_Class("One hand Strach", drawableToBitmap(R.drawable.ab8), R.drawable.ab8, "Secure your legs at the end of the declined bench first and then lie down with a dumbbell in each hand. Once lie down, move the dumbbells above your shoulders (shoulder width apart), palms facing each other. Lower the weights slowly until your elbows are parallel to the floor. Then bring the dumbbells back up while exhaling and contracting your chest.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Stright Buble", drawableToBitmap(R.drawable.ab9), R.drawable.ab9, "Lie on a flat bench with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, shoulder-width apart but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Stright Dumble Buble", drawableToBitmap(R.drawable.ab10), R.drawable.ab10, "Lie on a bench with an incline with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, to the width of your shoulders but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Outer Dumble Buble", drawableToBitmap(R.drawable.ab12), R.drawable.ab12, "Secure your legs at the end of a bench at a decline first and then lie down with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, to the width of your shoulders but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);

    }

    private Bitmap drawableToBitmap(int drawable) {
        Bitmap myLogo = ((BitmapDrawable) ResourcesCompat.getDrawable(getApplicationContext().getResources(), drawable, null)).getBitmap();

        return myLogo;
    }

    private void chest() {


        Model_Class modelClass = new Model_Class("Regular Chest Press", drawableToBitmap(R.drawable.chestpress), R.drawable.chestpress, "Lie on a flat bench, holding the dumbbells in your hands. Stretch your arms over your shoulder, shoulder-width apart. From this starting position, inhale and descend slowly until your elbows are parallel to the floor at a 90°angle. Then push the weights back up while exhaling to return to the starting position.");
        arrayList.add(modelClass);

        modelClass = new Model_Class("Incline Chest Press", drawableToBitmap(R.drawable.chest2), R.drawable.chest2, "Lie on a bench with an incline with a dumbbell in each hand. Then lift the dumbbells shoulder-width apart, arms extended and rotate your wrists so that the palms of your hands are facing each other. Stay in control of the dumbbells at all times and slowly lower the weights while inhaling. Then exhale pushing the dumbbells upwards with the help of your chest.");
        arrayList.add(modelClass);

        modelClass = new Model_Class("Decline Chest Press", drawableToBitmap(R.drawable.chest3), R.drawable.chest3, "Secure your legs at the end of the declined bench first and then lie down with a dumbbell in each hand. Once lie down, move the dumbbells above your shoulders (shoulder width apart), palms facing each other. Lower the weights slowly until your elbows are parallel to the floor. Then bring the dumbbells back up while exhaling and contracting your chest.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Chest Fly", drawableToBitmap(R.drawable.chest4), R.drawable.chest4, "Lie on a flat bench with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, shoulder-width apart but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Incline Chest Fly", drawableToBitmap(R.drawable.chest5), R.drawable.chest5, "Lie on a bench with an incline with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, to the width of your shoulders but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Decline Chest Fly", drawableToBitmap(R.drawable.chest6), R.drawable.chest6, "Secure your legs at the end of a bench at a decline first and then lie down with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, to the width of your shoulders but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Chest Dips", drawableToBitmap(R.drawable.chest7), R.drawable.chest7, "Chest dips are a fantastic exercise to build a strong chest and some even argue that it is the overall best chest exercise. This exercise not only adds depth to the chest but it adds width as well. Moreover, as your body isn’t supported by the bench like in a regularchestpress, it means that other muscles are worked as you have to work harder to stabilize your body weight.");
        arrayList.add(modelClass);
    }

    private void biceps() {
        Model_Class modelClass = new Model_Class("Dumbel Biceps", drawableToBitmap(R.drawable.bicep1), R.drawable.bicep1, "Lie on a flat bench, holding the dumbbells in your hands. Stretch your arms over your shoulder, shoulder-width apart. From this starting position, inhale and descend slowly until your elbows are parallel to the floor at a 90°angle. Then push the weights back up while exhaling to return to the starting position.");
        arrayList.add(modelClass);

        modelClass = new Model_Class("Incline weight Lifting", drawableToBitmap(R.drawable.bicep2), R.drawable.bicep2, "Lie on a bench with an incline with a dumbbell in each hand. Then lift the dumbbells shoulder-width apart, arms extended and rotate your wrists so that the palms of your hands are facing each other. Stay in control of the dumbbells at all times and slowly lower the weights while inhaling. Then exhale pushing the dumbbells upwards with the help of your chest.");
        arrayList.add(modelClass);

        modelClass = new Model_Class("Single Dumble", drawableToBitmap(R.drawable.bicep3), R.drawable.bicep3, "Secure your legs at the end of the declined bench first and then lie down with a dumbbell in each hand. Once lie down, move the dumbbells above your shoulders (shoulder width apart), palms facing each other. Lower the weights slowly until your elbows are parallel to the floor. Then bring the dumbbells back up while exhaling and contracting your chest.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Double Dumble", drawableToBitmap(R.drawable.bicep4), R.drawable.bicep4, "Lie on a flat bench with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, shoulder-width apart but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Incline Chrunch Fly", drawableToBitmap(R.drawable.bicep5), R.drawable.bicep5, "Lie on a bench with an incline with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, to the width of your shoulders but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Outer Dumble Fly", drawableToBitmap(R.drawable.bicep6), R.drawable.bicep6, "Secure your legs at the end of a bench at a decline first and then lie down with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, to the width of your shoulders but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Cable Biceps", drawableToBitmap(R.drawable.bicep7), R.drawable.bicep7, "Cable Biceps are a fantastic exercise to build a strong arms and some even argue that it is the overall best chest exercise. This exercise not only adds depth to the chest but it adds width as well. Moreover, as your body isn’t supported by the bench like in a regular chest press, it means that other muscles are worked as you have to work harder to stabilize your body weight.");
        arrayList.add(modelClass);
    }

    private void tricep() {
        Model_Class modelClass = new Model_Class("Bar triceps", drawableToBitmap(R.drawable.tricep1), R.drawable.tricep1, "Lie on a flat bench, holding the dumbbells in your hands. Stretch your arms over your shoulder, shoulder-width apart. From this starting position, inhale and descend slowly until your elbows are parallel to the floor at a 90°angle. Then push the weights back up while exhaling to return to the starting position.");
        arrayList.add(modelClass);

        modelClass = new Model_Class("Double weight Lifting", drawableToBitmap(R.drawable.tricep2), R.drawable.tricep2, "Lie on a bench with an incline with a dumbbell in each hand. Then lift the dumbbells shoulder-width apart, arms extended and rotate your wrists so that the palms of your hands are facing each other. Stay in control of the dumbbells at all times and slowly lower the weights while inhaling. Then exhale pushing the dumbbells upwards with the help of your chest.");
        arrayList.add(modelClass);

        modelClass = new Model_Class("Single Dumble tricep", drawableToBitmap(R.drawable.tricep3), R.drawable.tricep3, "Secure your legs at the end of the declined bench first and then lie down with a dumbbell in each hand. Once lie down, move the dumbbells above your shoulders (shoulder width apart), palms facing each other. Lower the weights slowly until your elbows are parallel to the floor. Then bring the dumbbells back up while exhaling and contracting your chest.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Cable Lifting", drawableToBitmap(R.drawable.tricep4), R.drawable.tricep4, "Lie on a flat bench with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, shoulder-width apart but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Seated Tricep Fly", drawableToBitmap(R.drawable.tricep5), R.drawable.tricep5, "Lie on a bench with an incline with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, to the width of your shoulders but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Iner Plate Fly", drawableToBitmap(R.drawable.tricep6), R.drawable.tricep6, "Secure your legs at the end of a bench at a decline first and then lie down with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, to the width of your shoulders but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Outer Bench Lifting", drawableToBitmap(R.drawable.tricep7), R.drawable.tricep7, "Outer Banch Lifting are a fantastic exercise to build a strong arms and some even argue that it is the overall best chest exercise. This exercise not only adds depth to the chest but it adds width as well. Moreover, as your body isn’t supported by the bench like in a regular chest press, it means that other muscles are worked as you have to work harder to stabilize your body weight.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Outer Weight Fly", drawableToBitmap(R.drawable.tricep8), R.drawable.tricep8, "Secure your legs at the end of a bench at a decline first and then lie down with a dumbbell in each hand, palms facing each other. Extend the arms above your chest, to the width of your shoulders but keep your elbows flexible at all times (do not lock your elbows). Then lower your arms on both sides in a wide arc until you feel a stretch in your chest and then bring the dumbbells back up. Keep in mind to do the movement to the level of the shoulder joint, and not at the arms and elbows.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Knee Bend", drawableToBitmap(R.drawable.tricep9), R.drawable.tricep9, "Knee Bend are a fantastic exercise to build a strong arms and some even argue that it is the overall best chest exercise. This exercise not only adds depth to the chest but it adds width as well. Moreover, as your body isn’t supported by the bench like in a regular chest press, it means that other muscles are worked as you have to work harder to stabilize your body weight.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Cable triceps", drawableToBitmap(R.drawable.tricep10), R.drawable.tricep10, "Cable triceps are a fantastic exercise to build a strong arms and some even argue that it is the overall best chest exercise. This exercise not only adds depth to the chest but it adds width as well. Moreover, as your body isn’t supported by the bench like in a regular chest press, it means that other muscles are worked as you have to work harder to stabilize your body weight.");
        arrayList.add(modelClass);
    }

    private void shoulders(){
        Model_Class modelClass = new Model_Class("Dumbel weight Lifting", drawableToBitmap(R.drawable.sho), R.drawable.sho, "Lie on a flat bench, holding the dumbbells in your hands. Stretch your arms over your shoulder, shoulder-width apart. From this starting position, inhale and descend slowly until your elbows are parallel to the floor at a 90°angle. Then push the weights back up while exhaling to return to the starting position.");
        arrayList.add(modelClass);

        modelClass = new Model_Class("Seated Machine Lifting", drawableToBitmap(R.drawable.sho1), R.drawable.sho1, "Lie on a flat bench, holding the dumbbells in your hands. Stretch your arms over your shoulder, shoulder-width apart. From this starting position, inhale and descend slowly until your elbows are parallel to the floor at a 90°angle. Then push the weights back up while exhaling to return to the starting position.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Stand shoulder Weighting", drawableToBitmap(R.drawable.sho2), R.drawable.sho2, "Lie on a flat bench, holding the dumbbells in your hands. Stretch your arms over your shoulder, shoulder-width apart. From this starting position, inhale and descend slowly until your elbows are parallel to the floor at a 90°angle. Then push the weights back up while exhaling to return to the starting position.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Dumbel Lifting", drawableToBitmap(R.drawable.sho4), R.drawable.sho4, "Lie on a flat bench, holding the dumbbells in your hands. Stretch your arms over your shoulder, shoulder-width apart. From this starting position, inhale and descend slowly until your elbows are parallel to the floor at a 90°angle. Then push the weights back up while exhaling to return to the starting position.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Bar Shoulders", drawableToBitmap(R.drawable.sho5), R.drawable.sho5, "Lie on a flat bench, holding the dumbbells in your hands. Stretch your arms over your shoulder, shoulder-width apart. From this starting position, inhale and descend slowly until your elbows are parallel to the floor at a 90°angle. Then push the weights back up while exhaling to return to the starting position.");
        arrayList.add(modelClass);
        modelClass = new Model_Class("Weight crunch Bar", drawableToBitmap(R.drawable.shou3), R.drawable.shou3, "Weight crunch Bar are a fantastic exercise to build a strong arms and some even argue that it is the overall best chest exercise. This exercise not only adds depth to the chest but it adds width as well. Moreover, as your body isn’t supported by the bench like in a regular chest press, it means that other muscles are worked as you have to work harder to stabilize your body weight.");
        arrayList.add(modelClass);

    }

}
