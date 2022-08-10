package com.custom.registrar;

public class Course {
    private String title;
    private String courseCode;
    private int courseLevel;

    public Course(String title, String courseCode, int courseLevel) {
        this.title = title;
        this.courseCode = courseCode;
        this.courseLevel = courseLevel;
    }

    public Course() {

    }

    public String getTitle() {
        return title;
    }

    public String getCourseCode() {
        return courseCode;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }
}
