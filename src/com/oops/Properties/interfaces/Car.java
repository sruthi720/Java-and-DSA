package com.oops.Properties.interfaces;

public class Car implements Engine,Break {

    int num =9;

    public  void Break(){
        System.out.println("Break function");
    }
    public  void startBreak(){
        System.out.println("Start after break");
    }


    public  void start(){
        System.out.println("start engine");
    }
    public  void accelerate(){
        System.out.println("Accelerate engine");
    }
    public  void stop(){
        System.out.println("stop engine");
    }


    public  void hi(){
//        Specified by:
//        hi in interface Break
//        hi in interface Engine

        System.out.println("Hi from any where ");
    }
}
