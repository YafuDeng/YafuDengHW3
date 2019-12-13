package com.example.yafudenghw3;

import java.util.ArrayList;

public class Student {
    protected String fName;
    protected String lName;
    protected String cwid;
    protected ArrayList<CourseEnroll> cList;

    public Student(String firstName, String lastName,String CWID){
        fName = firstName;
        lName = lastName;
        cwid = CWID;
    }

    public String getFirstName(){
        return fName;
    }
    public String getLastName(){
        return lName;
    }
    public String getCWID(){
        return cwid;
    }
    public ArrayList<CourseEnroll> getcList(){return cList;}

    public void setFirstName(String firstName){
        fName = firstName;
    }
    public void setLastName(String lastName){
        lName = lastName;
    }
    public void setcList(ArrayList<CourseEnroll> courseList){cList = courseList;}
}
