package com.oops.generic.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student>{
    int rollNo ;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }
    @Override
    public String toString(){
//        return "rollno : "+rollNo +" & "+ "marks : "+marks ;
        return marks + "";
    }



    @Override
    public int compareTo(Student o) {

        System.out.println("In compareTo method");//for check array.sort internally

        int diff =(int)(this.marks - o.marks);

        return diff;
        //if difference is = to 0 then both are equal
        // if diff is<0, then o is bigger else o is smaller
    }
}
