package com.oops.Properties.inheritance;

public class Box {
//    private double l; //can only be accessd in this file
    double l;

    double w;
    double h;
//    double weight ;//for checking the super keyword working

    Box() {
        super();//directly referring the object class since its is not inherited from anything,use case 1
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double side) {  //cube
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public void information(){
        System.out.println("Running the program");
    }
}
