package com.oops.Properties.AbstarctClasses.interfaces;
public class Main {
    public static void main(String[] args) {

        Car obj1 = new Car();
//        System.out.println(obj1.num);
//        obj1.stop();
//        obj1.Break();
//        obj1.start();//what is inside the car that will print

        Engine obj2 = new Car();
//        obj2.start();//only
////      obj2.num//will not be present its only have variables of engines

        Break obj3 = new Car();
//        obj3.startBreak();//only

        NiceCar obj4 = new NiceCar();
        obj4.start();
        obj4.startMusic();
        obj4.UpgradeEngine();//without creating another object
        obj4.stop();


    }
}
