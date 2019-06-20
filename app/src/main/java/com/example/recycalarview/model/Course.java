package com.example.recycalarview.model;

public class Course {

    private String CourseName;
    private String CourseInstructor;
    private int CourseImage;


    public Course(String courseName, String courseInstructor, int courseImage) {
        CourseName = courseName;
        CourseInstructor = courseInstructor;
        CourseImage = courseImage;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseInstructor() {
        return CourseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        CourseInstructor = courseInstructor;
    }

    public int getCourseImage() {
        return CourseImage;
    }

    public void setCourseImage(int courseImage) {
        CourseImage = courseImage;
    }
}
