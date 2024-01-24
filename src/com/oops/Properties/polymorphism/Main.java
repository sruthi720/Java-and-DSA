package com.oops.Properties.polymorphism;

import com.oops.Properties.inheritance.Box;

import static com.oops.Properties.polymorphism.Shapes.wishes;//hence wishes is static method


public class Main {
    public static void main(String[] args) {
//        Shapes shape =new Shapes();
//        shape.area();
//
//        circle circle = new circle();
//        circle.area();
//
//        square square  =new square();
//        square.area();

        Shapes obj1 = new circle();
        obj1.area();


//        Box obj1 = new Box(50.7,89,0);
//        Box obj2 = new Box(50.7);
//        Box obj3 = new Box();
//        Box obj4 = new Box(obj3);
// these are example for compile time polymorphism, same thing for methods and constructor

        square.greeting();
        wishes();////hence wishes is static method


        Shapes obj2 = new circle();// u can inherit but u cant override
        obj2.greeting();//always call the fuction  from parent class , no matter which object is called, it is depends on the class only



    }
}
