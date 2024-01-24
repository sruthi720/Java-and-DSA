package com.oops.Properties.polymorphism;

public class circle extends Shapes {

    //this run when the circle is created
    //hence circle overriding  the parent method
    @Override //this is called annotation, used to check wether the area is overriden or not, here no error on the @override hence area overiden
    void area (){
        System.out.println( "area is pie*r*r");
    }


    static void greeting(){
        System.out.println("Hello,darling from circle");
    }



//    void test(){
//        System.out.println("do random"); //test()' cannot override 'test()' in 'com.oops.Properties.polymorphism.Shapes';
//        // overridden method is final
//    }
}
