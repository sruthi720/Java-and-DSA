package com.oops;

public class Wrapper_class {
    public static void main(String[] args) {
        int a = 10;
        int b = 40;
        swap(a, b);
        System.out.println("In main function,After swapping: num1 = " + a + ", num2 = " + b);


//        Integer num =new Integer(45); or
        Integer num1 = 5;
        Integer num2 = 6;

        swap(num1, num2);

        System.out.println("In main function,After swapping: num1 = " + num1 + ", num2 = " + num2);



    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }



}
