package com.oops.Static_examples;

public class Static_Block {
    static int a=10;
    static  int b= 20;


    static{
        System.out.println("In a static block");//run only when first obj created
        b=b*a;
    }

    public static void main(String[] args) {
         Static_Block obj = new Static_Block();
         System.out.println(Static_Block.a +" " +Static_Block.b);

         Static_Block.b +=3;
         Static_Block obj2 =new Static_Block();
         System.out.println((Static_Block.a +" "+Static_Block.b));
    }
}
