package com.oops.generic.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main   {
    public static void main(String[] args) {
        Student kunal = new Student(4,78.9f);
        Student rahul = new Student(108,96.7f);
        Student arpit = new Student(45,86.2f);
        Student karan = new Student(99,66.5f);
        Student sachin = new Student(1,45.8f);


        Student[] list ={kunal,rahul,arpit,karan,sachin};

        System.out.println(Arrays.toString(list));



//        Arrays.sort(list);
//
//        OR


        //can add comparator
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                return (int)(o1.marks-o2.marks);
//                return -(int)(o1.marks-o2.marks);//sort in decesnding order
//            }
//        });


//          OR

//        replacing it with lambda expression
                Arrays.sort(list, (o1, o2) -> {
    //                return (int)(o1.marks-o2.marks);
                    return -(int)(o1.marks-o2.marks);//sort in decesnding order
                });



        System.out.println(Arrays.toString(list));



//        if (kunal.compareTo(rahul) < 0 ) {//Operator '<' cannot be applied to 'com.oops.generic.comparing.Student', 'com.oops.generic.comparing.Student'
//            //to solve this problem we have to implement class--> comparable
//            System.out.println(kunal.compareTo(rahul));
//            System.out.println("rahul has more marks");
//        }

    }


}
