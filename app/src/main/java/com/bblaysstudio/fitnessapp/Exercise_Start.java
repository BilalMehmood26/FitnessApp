package com.bblaysstudio.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;

public class Exercise_Start extends AppCompatActivity {


    private CountDownTimer countDownTimer;
    private TextView time,complete;
    private int i;
    private MediaPlayer soundstart,soundComplete,soundthree,soundtwo,soundone;
    private GifImageView gif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise__start);

        final String exerciseName=getIntent().getStringExtra("exerciseName");
        final TextView nameEx= findViewById(R.id.nameExc);
        nameEx.setText(exerciseName);

        String a = exerciseName.replaceAll("\\s","").toLowerCase();
        int gifImg = getResources().getIdentifier(a, "drawable", getPackageName());

        complete=findViewById(R.id.workoutComplete);

        gif=findViewById(R.id.gif);
        gif.setImageResource(gifImg);

        final Bundle arrayget=getIntent().getExtras();
        final ArrayList<String> arrayList=arrayget.getStringArrayList("array");
         final String postion=arrayget.getString("postion");
        i=Integer.valueOf(postion);
        time=findViewById(R.id.time);
        Typeface typeface=Typeface.createFromAsset(getAssets(), "fonts/digital.ttf");
        time.setTypeface(typeface);
        countdown();
        soundstart= MediaPlayer.create(this,R.raw.start);
        soundComplete= MediaPlayer.create(this,R.raw.workoutcomplete);
        soundthree= MediaPlayer.create(this,R.raw.three);
        soundtwo= MediaPlayer.create(this,R.raw.two);
        soundone= MediaPlayer.create(this,R.raw.one);

        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//

                soundstart.start();
                countDownTimer.start();
                complete.setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countDownTimer.cancel();

                time.setText("00:00");
                complete.setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=i+1;
                nameEx.setText(arrayList.get(i));
                String next = arrayList.get(i).replaceAll("\\s","").toLowerCase();
                int gifImg1 = getResources().getIdentifier(next, "drawable", getPackageName());
                gif.setImageResource(gifImg1);
                countDownTimer.cancel();
                complete.setVisibility(View.INVISIBLE);
                time.setText("00:00");
            }
        });
    }

    private void countdown(){

        countDownTimer=new CountDownTimer(15000, 1000) {
            @Override
            public void onTick(long l) {

            if(l/1000==3)
                soundthree.start();
            else if (l/1000==2)
                soundtwo.start();
            else if(l/1000==1)
                soundone.start();

            time.setText("00:"+l/1000);
            }

            @Override
            public void onFinish() {
                soundComplete.start();
                complete.setVisibility(View.VISIBLE);
                time.setText("");
            }
        };

    }

    @Override
    protected void onStop() {
        super.onStop();
        time.setText("00:00");
        soundone.stop();
        soundtwo.stop();
        soundComplete.stop();
        soundthree.stop();
        soundstart.stop();
        complete.setVisibility(View.INVISIBLE);
    }
}
