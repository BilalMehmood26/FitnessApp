package com.bblaysstudio.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Exercise_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_details);

        final String exerciseName=getIntent().getStringExtra("exerciseName");
        final String detail=getIntent().getStringExtra("details");
        int drawableid=getIntent().getIntExtra("imageName",0);


        TextView nameEx= findViewById(R.id.nameEx);
        nameEx.setText(exerciseName);
        TextView details=findViewById(R.id.content);
        details.setText(detail);

        final Bundle arrayget=getIntent().getExtras();
       final ArrayList<String> arrayList=arrayget.getStringArrayList("array");
       final String postion=arrayget.getString("postion");





        final ImageView imageView=findViewById(R.id.animation);

        imageView.setBackgroundResource(drawableid);
        String name=getResources().getResourceEntryName(drawableid);
        TextView target=findViewById(R.id.targetMuscle);
        name=name.replaceAll("[0-9]","");
        if(name.equals("sho")){
            name="Shoulders";
        }
        if (name.equals("ab")){
            name="Abs";
        }
        target.setText(name);

        findViewById(R.id.starworkout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Exercise_details.this,Exercise_Start.class);
                intent.putExtra("exerciseName",exerciseName);
                intent.putExtra("array",arrayList);
                intent.putExtra("postion",postion);
                startActivity(intent);
            }
        });
    }




}
