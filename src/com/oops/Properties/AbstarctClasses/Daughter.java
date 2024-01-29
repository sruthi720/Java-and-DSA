package com.oops.Properties.AbstarctClasses;

public class Daughter extends  Parent{


    public Daughter(int age){
        super(age);


    }
    public void career (String name){
        System.out.println("iam a "+ name);
    }
    public void partner (String name ,int age){
        System.out.println("iam the "+age+ "th "+ name);
    }

}
