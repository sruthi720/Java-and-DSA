package com.oops.Properties.Access;

public class Subclass extends Access_modifiers {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj1 = new Subclass(34,"Roushi");



//        obj1.num1;//private
        System.out.println(obj1.num2);
        System.out.println(obj1.num3);
        System.out.println(obj1.num4);

        System.out.println(obj1 instanceof  Access_modifiers);
    }
}
