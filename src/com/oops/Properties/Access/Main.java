package com.oops.Properties.Access;

public class Main {
    public static void main(String[] args) {
        Access_modifiers obj1 = new Access_modifiers(30,"Sruthi");
        //things to do
        //1.access the data members
//        System.out.println(obj1.num);//'num' has private access in 'com.oops.Properties.Access.A'
        System.out.println(obj1.arr);

//but we directrly access like this if it is pricvate so ,eg:  below
//  ArrayList<Integer> list = new ArrayList<>();
//  list.DEFAULT_CAPACITY;
// But u cant do it through some connsructor or getter  & setter
        System.out.println(obj1.getNum1());

//2.modify the data members





       // obj1.num1;//'num1' has private access in 'com.oops.Properties.Access.Acess_modifiers'
        System.out.println(obj1.num2);// no modifier
        System.out.println(obj1.num3);//protected
        System.out.println(obj1.num4);//public

}
}