package com.oops.Properties.inheritance;

public class Inheritance {
  public static void main(String[] args) {
    Box obj1 = new Box(50.7,89,0);
    Box obj2 = new Box(50.7);
    Box obj3 = new Box();
    Box obj4 = new Box(obj3);


    System.out.println(obj1.h +" "+obj1.l+" "+obj1.w);
    obj3.information();

    BoxWeight nobj1 = new BoxWeight();
    BoxWeight nobj2 = new BoxWeight(13,45,2,90);
    BoxWeight nobj3 = new BoxWeight(nobj1 ,71);
    BoxWeight nobj4 = new BoxWeight(50.0,8);

    System.out.println(nobj2.h +" "+nobj2.l+" "+nobj2.w +" "+nobj2.weight);
    System.out.println(nobj3.weight +" "+ nobj3.h);
    System.out.println(nobj4.w);
    System.out.println(nobj1.h);

    Box box5 =new BoxWeight(12,3,4,5);
//    System.out.println(obj5.weight); --> cant be accessible since it's the type of reference variable
    System.out.println(box5.w);
    System.out.println(box5.l);
    System.out.println(box5.h);

//    BoxWeight box6 =new Box(50,3,2 );  --->child variable with  parent  object type is not possible

    BoxPrice Box7 =new BoxPrice(2,4,3);






  }
}
