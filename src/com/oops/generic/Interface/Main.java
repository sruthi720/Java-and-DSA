package com.oops.generic.Interface;

public class Main implements Generic_Interface<Integer> { //generic type interface
    public void display(Integer num){
        System.out.println(num);
    }
    public static void main(String[] args) {

        Main obj = new Main();
        obj.display(5);
    }
}
