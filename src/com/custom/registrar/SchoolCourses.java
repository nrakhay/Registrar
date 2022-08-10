package com.custom.registrar;

import java.util.ArrayList;

public class SchoolCourses {
    private String schoolName;
    private ArrayList<Course> courses;

    public SchoolCourses(String schoolName, ArrayList<Course> courses) {
        this.schoolName = schoolName;
        this.courses = new ArrayList<Course>();
    }

    public SchoolCourses() {

    }

    public boolean courseExists (String courseCode) {
        for (Course course: courses) {
            if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                return true;
            }
        }

        return false;
    }

    public boolean addCourseToSchool (String title, String courseCode, int courseLevel) {
        if (courseExists(courseCode)) {
            System.out.println(title + " already exists");
            return false;
        } else {
            courses.add(new Course(title, courseCode, courseLevel));
            System.out.println(title + " is successfully added to the list");
            return true;
        }
    }

    public boolean removeCourseByCode (String courseCode) {
        if (courseExists(courseCode)) {
            for (Course course: courses) {
                if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                    courses.remove(course);
                    System.out.println("Course " + courseCode + " is successfully removed");
                    return true;
                }
            }
        }

        return false;
    }

    public void showCourseList () {
        int count = 1;
        for (Course course: courses) {
            System.out.println(count + ": " + course.getTitle() + " (" + course.getCourseCode() + ")\n");
            count++;
        }
    }

    public void clearCourseList () {
        courses.clear();
    }

}
