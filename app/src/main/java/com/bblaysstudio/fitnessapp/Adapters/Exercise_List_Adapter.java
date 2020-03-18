package com.bblaysstudio.fitnessapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bblaysstudio.fitnessapp.Exercise_details;
import com.bblaysstudio.fitnessapp.R;

import java.util.ArrayList;

public class Exercise_List_Adapter extends RecyclerView.Adapter<Exercise_List_Adapter.ViewHolder> {



    private ArrayList<Model_Class> arrayList;
    private Context context;
    private ArrayList<String> testing=new ArrayList<>();

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView cat_name;
        private ImageView cat_img;
        private LinearLayout parent;



        public ViewHolder(View view) {
            super(view);

            cat_name=view.findViewById(R.id.cat_name);
            cat_img=view.findViewById(R.id.cat_img);
            parent=view.findViewById(R.id.parent3);

        }
    }

    public Exercise_List_Adapter(ArrayList<Model_Class> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context=context;
    }

    @Override
    public Exercise_List_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.exercise_layout, parent, false);

        return new Exercise_List_Adapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final Exercise_List_Adapter.ViewHolder holder, final int position) {
        final Model_Class cat = arrayList.get(position);

        for(int a=0;a<arrayList.size();a++){
            Model_Class c=arrayList.get(a);
            testing.add(c.cat_name);
        }
        holder.cat_img.setImageBitmap(cat.cat_img);
        holder.cat_name.setText(cat.getCat_name());

        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, Exercise_details.class);
                intent.putExtra("exerciseName",cat.cat_name);
                intent.putExtra("details",cat.getDetail());
                intent.putExtra("array",testing);
                intent.putExtra("postion",String.valueOf(position));
                intent.putExtra("imageName",cat.drawableId);
                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
