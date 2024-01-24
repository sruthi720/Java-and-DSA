package com.oops.Static_examples;


   public class Human{
        int age;
        String name;
        int salary;
        boolean married;

        //static
        static long population;

        static  void message(){
            System.out.println("Hi object !");
           // System.out.println(this.age);//u cant access because age is not static keyword
        }

        public Human(int age, String name, int salary, boolean married) {
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;

            Human.population+=1;
        }


    }


