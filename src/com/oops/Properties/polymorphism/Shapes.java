package com.oops.Properties.polymorphism;

import org.w3c.dom.ls.LSOutput;

public class Shapes {
    void area() {
        System.out.println("The shape !");
    }

    static void wishes(){
        System.out.println("Hello,darling");
    }

//    @Override ///static method greeting is in both parentclass shapes and child class sqaure but it is not overriding
    static void greeting(){
        System.out.println("Hello,darling from shape");
    }


    //early binding
//     final void test(){
//        System.out.println("do random");//  final used to prevent over ridng so method over riding is not possible
//    }

}
//      !! if class is final its cant be inherited and all of its method will  implicitly be final