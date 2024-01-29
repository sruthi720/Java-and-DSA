package com.oops.Properties.interfaces.extendDemo2;

public interface A {

    static void greetings(){//static  interface methods should always have  body
        System.out.println("hello static method");
    }
    void hello();
    default void fun(){
        System.out.println("Hello , Iam function!");
    }
}
