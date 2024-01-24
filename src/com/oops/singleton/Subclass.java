package com.oops.singleton;

import com.oops.Properties.Access.Access_modifiers;

public class Subclass extends Access_modifiers {

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {

        //code  for access Modifier
         Subclass obj1 = new Subclass(56 ,"Kunal");
         int val =  obj1.getNum1();
         System.out.println(val);//accesing private value


//        System.out.println(obj1.num1);//private
//        System.out.println(obj1.num2);//no
        System.out.println(obj1.num3);//protect
        System.out.println(obj1.num4);//public


    }

    public static class Subsubclass extends Subclass{

        public Subsubclass(int num ,String name){
            super(num, name);
        }


        public static void main(String[] args) {

            Subsubclass obj1 = new Subsubclass(45 ,"anuja");
            int n= obj1.num3;//protected can be access in sub subclass
        }
    }

}
