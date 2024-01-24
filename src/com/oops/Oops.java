package com.oops;

import java.sql.SQLOutput;

public class Oops {
    public static void main(String[] args) {

        //without using constructor
        Student S1 = new Student();

        Student s2 = new Student();

        Student s3  =new Student(15,"john",79.03f);

        Student random=new Student(s3);

        //constructor  calling a constructor
        Student random2 =new Student();



        Student one= new Student();
        Student two =new Student();
//        System.out.println(one.name);
//        System.out.println(two.name);
        one.name="One Person";
        System.out.println(two.name);

//        System.out.println(S1.name);
//
//        s2.changeName("vinayak");
//        s2.greetings();
//
//        System.out.println(S1.rnos);
//        System.out.println(S1.marks);
//        System.out.println(S1.name);
//
//        System.out.println(s2.rnos);
//        System.out.println(s2.marks);
//        System.out.println(s2.name);
//
//        System.out.println(s3.rnos);
//        System.out.println(s3.marks);
//        System.out.println(s3.name);


//        System.out.println(random.rnos);
//        System.out.println(random.marks);
//        System.out.println(random.name);

//        System.out.println(random2.rnos);
//        System.out.println(random2.marks);
//        System.out.println(random2.name);
//        random2.greetings();








    }
}
   class Student{
    int rnos;
    String name;
    Float marks;

    void greetings(){
        System.out.println("Hello "+name);
    }

    void changeName(String newName){
        name= newName;
    }

//    Student(){
//        this.rnos =13;
//        this.name="Sruthi";
//        this.marks=45.7f;
//    }    //        Student s2 = new Student(); --->without any parameters

    Student(Student other){
        this.rnos=other.rnos;
        this.marks=other.marks;
        this.name= other.name;
    }

    Student(int rnos, String name,float marks){
        this.rnos=rnos;
        this.marks=marks;
        this.name=name;



//   Student(int rolls ,String naam , float grade){

        //'this' is not necessary here because instantce variable and argument both are difference
//            rnos=rolls;
//            name=naam;
//            marks =grade;
//        }

    }



    Student(){
       //Constructor calls another constructor
        this(28,"default person",67.0f); //this will run the  constructor containing this parameters

    }
}

//without constructor
//package com.oops;
//
//public class Oops {
//    public static void main(String[] args) {
//
//        //without using constructor
//        Student S1 = new Student();
//        S1.rnos =13;
//        S1.name="Sruthi";
//        S1.marks=45.7f;
//
//        System.out.println(S1.rnos);
//        System.out.println(S1.marks);
//        System.out.println(S1.name);
//
//
//
//    }
//}
//class Student{
//    int rnos;
//    String name;
//    Float marks;
//}
//
//
//
//



