package com.example.recycalarview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycalarview.R;
import com.example.recycalarview.model.Course;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.Holder> {

    private List<Course> courselist;
    private Context context;

    public CourseAdapter(List<Course> courselist, Context context) {
        this.courselist = courselist;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_course,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, final int position) {

        Picasso.get().load(courselist.get(position).getCourseImage()).into(holder.COUURSEIMAGE);
        holder.COURSENAME.setText("Course Title: "+courselist.get(position).getCourseName());
        holder.COURSEINSTRUCTOR.setText("Instructor: "+courselist.get(position).getCourseInstructor());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = courselist.get(position).getCourseName();
                Toast.makeText(context, "Clicked On "+name, Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return courselist.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        TextView COURSENAME,COURSEINSTRUCTOR;
        ImageView COUURSEIMAGE;
        public Holder(@NonNull View itemView) {
            super(itemView);
            COURSENAME = itemView.findViewById(R.id.coursename);
            COURSEINSTRUCTOR = itemView.findViewById(R.id.courseinstructor);
            COUURSEIMAGE = itemView.findViewById(R.id.imageview);
        }
    }
}
