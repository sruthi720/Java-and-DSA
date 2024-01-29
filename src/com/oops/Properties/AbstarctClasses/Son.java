package com.oops.Properties.AbstarctClasses;

public class Son  extends  Parent{


    public Son(int age) {//create constructor of abstract  class
        super(age);//use to refer the variables of the parent class constructor
    }

    public void career (String name){
        System.out.println("iam a "+ name);
    }
    public void partner (String name ,int age){
        System.out.println("iam the "+age+ "th "+ name);
    }

    @Override
    void normal(){
        super.normal();
    }


}
