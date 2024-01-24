package com.oops.Properties.polymorphism;

public class numbers {
    // in method overloading ,if name is same then the number of arguments,return type ,order should be different

    double sum(double a, int b){ //if we passing 1, 2 -->integers java automatically coverts it to double
        //here a=2 ok, but  b=3.45 is not ok
        return a+b;
    }
//    double sum(int b,double a){ //order is different
//        return a+b;
//    }

//    int sum(int a, int b){
//        return a+b;
//    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        numbers num =new numbers();
        num.sum(1,2);//in compile time it knows which function has to run
        num.sum(3,4,5);
    }
}
