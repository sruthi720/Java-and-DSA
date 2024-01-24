package com.oops.Static_examples;

public class Main {
    public static void main(String[] args) {
        System.out.println(Human.population);//it will run if object is not created because its only depends on its class
        Human kunal = new Human(43, "Kunal", 100000, true);
        System.out.println(Human.population);
        Human rahul = new Human(35, "rahul", 15000, false);
        System.out.println(Human.population);
        System.out.println(rahul.married);


        greeting();//accessed becuse its static function
        //hello(); not possible because its not a static function
        Main obj = new Main();
        obj.hello();


    }

    static void greeting() {
        //this function  is not depend on object
        System.out.println("Hi,Good morning...!");


//        hello();//cant use it ,require its instances
        Main obj = new Main();
        obj.hello();
    }


    void hello() {
        //this function  is  depend on object
        System.out.println("Hello,Good morning...!");// cant call in  static function ,belongs to some instance
    }
}






