package com.oops.Properties.Access;

import java.security.PublicKey;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num= num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num ==((ObjectDemo)obj).num;//check whether num are same or not

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString(); //gives the string representation
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();//calls when garbage collector hits
    }


    public static void main(String[] args) {
        ObjectDemo obj1 =new ObjectDemo(34);
        ObjectDemo obj2 =new ObjectDemo(34);
        ObjectDemo obj3 = obj2;


//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
//        System.out.println(obj3.hashCode());
//
//        if(obj1 == obj2){
//            System.out.println("same object is pointinted by 2 variables or not");
//        }
//        if(obj1.equals(obj2)){
//            System.out.println("same value or  not");
//        }
//
//        System.out.println(obj2 instanceof  ObjectDemo);

        System.out.println(obj1.getClass().getName());






    }
}
