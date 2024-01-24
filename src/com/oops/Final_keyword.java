package com.oops;

public class Final_keyword {
    public static void main(String[] args) {
        final int INCREASE =5 ;

//        INCREASE =0; // is not possible

        Student obj1 =new Student("Sruthi");
        obj1.name="other name";// but its posible


        //when a non primitive is final you can not assign it
//        kunal =new Student("newObject");
        System.out.println(obj1.name);

   //garbage collector after a limit
        Student obj2 ;
        for(int i=0;i<10000000;i++){
            obj2 =new Student("cat");
        }

    }


    static class Student{
        final int SUM=10;
        String name;

        Student(String name){
            this.name= name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object  Destroyed !");
        }
    }
}
