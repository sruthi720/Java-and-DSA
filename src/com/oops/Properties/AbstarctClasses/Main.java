package com.oops.Properties.AbstarctClasses;

public class Main {
    public static void main(String[] args) {
        Son obj1 = new Son(40);
        obj1.career("Doctor");
        System.out.println(obj1.VALUE);

        Daughter obj2 = new Daughter(30);
        obj2.partner("Vinayak" ,23);


        //Parent Mom = new Parent() ;//'Parent' is abstract; cannot be instantiated , so object cat create
        //parent father =new parent(78);

        Parent.hello();//calling static method of parent class

        obj1.normal();//normal method CALLING


    }
}
