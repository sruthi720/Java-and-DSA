package com.oops.Properties.Access;

public class Access_modifiers {
     private int num1; //data Members
     int num2;//no modifiers ,so in sam package  can access but  in different package cant access
     protected int num3;
     public int num4;
     int[] arr ;//data Members
     String name;//data Members

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;

    }

    public Access_modifiers(int num, String name) {
        this.num1 = num;
        this.name = name;
        this.arr= new int[num];

        System.out.println(num1);//private
        System.out.println(num2);//no
        System.out.println(num3);//protected
        System.out.println(num4);//public
    }
}
//check singleton's Main class
