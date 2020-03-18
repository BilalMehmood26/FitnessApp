package com.bblaysstudio.fitnessapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bblaysstudio.fitnessapp.Exercise_list;
import com.bblaysstudio.fitnessapp.R;

import java.util.ArrayList;

public class Home_Catagories_Adapter extends RecyclerView.Adapter<Home_Catagories_Adapter.ViewHolder> {

    private ArrayList<Model_Class> arrayList;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView cat_name;
        private ImageView cat_img;
        private RelativeLayout parent;



        public ViewHolder(View view) {
            super(view);

            cat_name=view.findViewById(R.id.cat_name);
            cat_img=view.findViewById(R.id.cat_img);
            parent=view.findViewById(R.id.home_cat_parent);

        }
    }


    public Home_Catagories_Adapter(ArrayList<Model_Class> arrayList,Context context) {
        this.arrayList = arrayList;
        this.context=context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_adapter, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Model_Class cat = arrayList.get(position);
        holder.cat_img.setImageBitmap(cat.cat_img);
       holder.cat_name.setText(cat.getCat_name());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, Exercise_list.class);
                intent.putExtra("workout",cat.getCat_name());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
