package com.example.yafudenghw3;

public class CourseEnroll {
    protected String cID;
    protected String cGrade;

    public CourseEnroll(String courseID, String grade){
        cID = courseID;
        cGrade = grade;
    }

    public String getCourseID(){
        return cID;
    }
    public String getGrade(){
        return cGrade;
    }

    public void setCourseID(String courseID){
        cID = courseID;
    }
    public void setGrade(String grade){
        cGrade = grade;
    }
}
