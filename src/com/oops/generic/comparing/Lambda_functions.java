package com.oops.generic.comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda_functions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0;i<5;i++){
            arr.add(i+1);
        }

//        arr.forEach((item)-> System.out.println(item*2));

//        OR
        Consumer<Integer> fun = (item)-> System.out.println(item*2);
        arr.forEach(fun);


//        OR
        Operation  sum =(a,b)-> a+b;
        Operation  prod =(a,b)-> a*b;
        Operation  div =(a,b)-> a/b;


        Lambda_functions myCalculator = new Lambda_functions();

        System.out.println(myCalculator.operate(67,89,sum));
        System.out.println(myCalculator.operate(3,89,prod));
        System.out.println(myCalculator.operate(95,89,div));





    }


    private int operate( int a , int b , Operation op){
        return op.operation(a,b);
    }

//    Consumer with multiple parameters
    interface Operation{
        int operation (int a, int b);
}


}
