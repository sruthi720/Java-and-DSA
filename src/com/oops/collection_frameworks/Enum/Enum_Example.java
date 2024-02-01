package com.oops.collection_frameworks.Enum;

public class Enum_Example {
    enum  Week{
        sunday ,monday, tuesday,wednesday,thursday,friday, Wednesday, Thursday, saturday;

        Week(){ //constructor of enum week
            System.out.println("Constructor called for " + this);//internally works as -->  public static final Week =  new Week();
        }
    }

    public static void main(String[] args) {
        Week day =Week.monday;
        System.out.println(day);


        for (Week i: Week.values()) {
            System.out.println(i);
        }


        Week j =Week.Thursday;
        System.out.println(j.ordinal());//position of the constant



    }
}
