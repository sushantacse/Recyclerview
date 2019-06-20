package com.example.recycalarview;

import android.os.Bundle;

import com.example.recycalarview.adapter.CourseAdapter;
import com.example.recycalarview.model.Course;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private CourseAdapter courseAdapter;
    private LinearLayoutManager layoutManager;
    private List<Course> courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.reyclerview);
        recyclerView.setHasFixedSize(true);
        courses = new ArrayList<>();
        CourseDatabase();
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        courseAdapter = new CourseAdapter(courses,this);
        recyclerView.setAdapter(courseAdapter);
    }

    private void CourseDatabase()
    {
        courses.add(new Course("Office Management","Shushanto Paul",R.drawable.book1));
        courses.add(new Course("Software Engineering","Nayeem Shiddiki Abir",R.drawable.book2));
        courses.add(new Course("Structured Programming Language","Minhajul Arefin",R.drawable.book3));
        courses.add(new Course("Database Management System","Samira Chowdhruy",R.drawable.book1));

    }
}
