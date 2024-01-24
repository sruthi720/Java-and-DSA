package com.oops.Properties.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num){
        this.num =num;
    }
    @Override // overrides the method of object  class at run time
    public String toString() {
        return "ObjectPrint{ num= "+num+" }";
    }

    //what if i provided a  toString method

    public static void main(String[] args) {
        ObjectPrint obj1 =new ObjectPrint(54);
        System.out.println(obj1);//while printing obj it wil call default obj.toString() of object class, since we didn't specified its value


    }
}
