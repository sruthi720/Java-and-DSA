package com.oops.Properties.AbstarctClasses.interfaces.nested;

public class A {
//nested interface
    public interface nestedInterface{
        boolean isOdd(int num);
}
}
class B implements A.nestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

 class Main{
    public static void main(String[] args) {
        B obj1 = new B();
        System.out.println(obj1.isOdd(90));
    }
}

