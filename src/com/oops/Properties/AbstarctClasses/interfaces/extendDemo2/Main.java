package com.oops.Properties.AbstarctClasses.interfaces.extendDemo2;

public class Main implements A, B { //class to interface-->implements
    public Main() {
        super();
    }

//there is no error if we are not overriding the fun(), because it set as default
//    @Override
//    public void fun() {
//
//    }


    @Override
    public void hello(){

    }

    @Override
    public void greet() {

    }

    //these both methods together bind ,can use this

    public static void main(String[] args) {
        A.greetings();
    }
}
