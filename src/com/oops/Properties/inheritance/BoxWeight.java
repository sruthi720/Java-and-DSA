package com.oops.Properties.inheritance;

public class BoxWeight extends Box {
    double weight  ;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);//initialize first then subclass

        //use case 2-->super keyword can be used as "this "  keyword
        System.out.println(super.l);
//        System.out.println(super.weight);//this is the weight in Box, parent class
        System.out.println(this.weight);//this is the weiht in the child class

        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);//To call the parent class constructor,used to initialise values of parent class constructor
        this.weight = weight;
    }

    public BoxWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }

     BoxWeight(BoxWeight other){ // invoke the Box(box) because u r able to put it over here
        super( other);
        weight = other.weight;
    }//OR
//    Box box5 =new BoxWeight(12,3,4,5);
////    System.out.println(obj5.weight); --> cant be accessible since it's the type of reference variable
//    System.out.println(box5.w);
//    System.out.println(box5.l);
//    System.out.println(box5.h);
    //both are same
    //what is accessd is based on reference variable  not depend on the object

    //there are many variables in both parent and child classes
    //you are given access to variables that are in the ref type, i.e ,box weight
    //hence you should have access to weight variable
    //ie,once you are trying to access should be initialsed
    //but here object itself is the type of parent class so how will u call the child constructor
    //this is the error


}
