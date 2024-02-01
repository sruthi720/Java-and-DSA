package com.oops.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(34,"Kunal");
//        Human twin = new Human(kunal);//takes lots opf processing time

        Human twin = (Human) kunal.clone();//cast expression to human
        //something that inside this function throws an exception
        System.out.println("Age : "+twin.age+" & Name : "+twin.name);
        System.out.println(Arrays.toString(twin.arr));


        //shallow copy , both twin and kunal values are changed
        twin.arr[0]=100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kunal.arr));




    }
}
