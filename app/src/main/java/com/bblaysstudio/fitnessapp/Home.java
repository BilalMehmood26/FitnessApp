package com.bblaysstudio.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.bblaysstudio.fitnessapp.Adapters.Home_Catagories_Adapter;
import com.bblaysstudio.fitnessapp.Adapters.Model_Class;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Model_Class> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView=findViewById(R.id.recyclerw);
        Home_Catagories_Adapter adapter=new Home_Catagories_Adapter(arrayList,this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        loadAdapter();


    }

    private void loadAdapter(){

        Bitmap chest = ((BitmapDrawable) ResourcesCompat.getDrawable(getApplicationContext().getResources(), R.drawable.chest, null)).getBitmap();
        Bitmap bicep = ((BitmapDrawable) ResourcesCompat.getDrawable(getApplicationContext().getResources(), R.drawable.biceps, null)).getBitmap();
        Bitmap tricep = ((BitmapDrawable) ResourcesCompat.getDrawable(getApplicationContext().getResources(), R.drawable.triceps, null)).getBitmap();
        Bitmap shoulder = ((BitmapDrawable) ResourcesCompat.getDrawable(getApplicationContext().getResources(), R.drawable.shoulder, null)).getBitmap();
        Bitmap wings = ((BitmapDrawable) ResourcesCompat.getDrawable(getApplicationContext().getResources(), R.drawable.wings, null)).getBitmap();
        Bitmap abs = ((BitmapDrawable) ResourcesCompat.getDrawable(getApplicationContext().getResources(), R.drawable.abs, null)).getBitmap();
        Bitmap legs = ((BitmapDrawable) ResourcesCompat.getDrawable(getApplicationContext().getResources(), R.drawable.legs, null)).getBitmap();
        Bitmap uperbody = ((BitmapDrawable) ResourcesCompat.getDrawable(getApplicationContext().getResources(), R.drawable.upperbody, null)).getBitmap();
        Bitmap lower = ((BitmapDrawable) ResourcesCompat.getDrawable(getApplicationContext().getResources(), R.drawable.lowerbody, null)).getBitmap();
        Bitmap full = ((BitmapDrawable) ResourcesCompat.getDrawable(getApplicationContext().getResources(), R.drawable.fullbody, null)).getBitmap();

        Model_Class modelClass=new Model_Class(chest,"Chest");
        arrayList.add(modelClass);

        modelClass=new Model_Class(bicep,"Biceps");
        arrayList.add(modelClass);

        modelClass=new Model_Class(tricep,"Triceps");
        arrayList.add(modelClass);
        modelClass=new Model_Class(shoulder,"Shoulders");
        arrayList.add(modelClass);

        modelClass=new Model_Class(abs,"ABS");
        arrayList.add(modelClass);
        modelClass=new Model_Class(wings,"Wings");
        arrayList.add(modelClass);
        modelClass=new Model_Class(legs,"Legs");
        arrayList.add(modelClass);
        modelClass=new Model_Class(uperbody,"Uper Body");
        arrayList.add(modelClass);
        modelClass=new Model_Class(lower,"Lower Body");
        arrayList.add(modelClass);
        modelClass=new Model_Class(full,"Full Body");
        arrayList.add(modelClass);
    }
}
