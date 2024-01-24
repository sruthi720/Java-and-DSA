package com.oops.Static_examples;

//static class Test3 {     can not be static since its not depends on any class
//
//}

//does not depends on any other class
 class Test1 {
    static String name;

    public Test1(String name) {
        this.name = name;
    }


    public class Inner_class {
        static class Test2 {//depends on its  outerclass -->"Inner_class"
            String name;

            public Test2(String name) {
                this.name = name;
            }

            public static void main(String[] args) {
                Test1 obj1 = new Test1("kunal");//no error
                Test1 obj2 = new Test1("rahul");

                Test2 obj3 =new Test2("kunal"); //will be error if not static because ,static can only take static values
                Test2 obj4 = new Test2("rahul");

//                System.out.println(obj1.name);
//                System.out.println(obj2.name);

                System.out.println(obj3.name);
                System.out.println(obj4.name);



            }

        }
    }
}

