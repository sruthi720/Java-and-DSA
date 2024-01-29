package com.oops.Properties.AbstarctClasses;

public abstract class Parent {

    int age;
    final int VALUE;

    public Parent(int age) {//constructor of abstract class
        this.age = age;
        VALUE=20945;
    }

    public abstract  void career (String name);
    public abstract  void partner (String name, int age);

    static  void  hello(){
        System.out.println("Hi am Static method");
    }
    void normal(){
        System.out.println("hi");
    }

}

//final public abstract class Parent {} // you cant have a finaL abstract class
