

package com.amigoes;

import java.util.LinkedList;
import java.util.ListIterator;

public class Queue_Works {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.addFirst(new Person("Sruthi", 23));
        linkedList.add(new Person("amal", 29));
        linkedList.add(new Person("Rejil", 20));

        // Print the initial list
        System.out.println("Initial List:");
        printList(linkedList);

        // Add more elements
        linkedList.add(new Person("John", 35));
        linkedList.add(new Person("Jane", 30));

        // Print the updated list
        System.out.println("\nUpdated List:");
        printList(linkedList);
    }

    static void printList(LinkedList<Person> list) {
        ListIterator<Person> personListIterator = list.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
    }

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + '}';
        }
    }
}


















//package com.amigoes;
//
//import java.util.LinkedList;
//import java.util.ListIterator;
//
//public class Queue_Works {
//    public static void main(String[] args) {
//        LinkedList<Person> linkedList = new LinkedList<>();
//        linkedList.addFirst(new Person("Sruthi", 23));
//        linkedList.add(new Person("amal", 29));
//        linkedList.add(new Person("Rejil", 20));
//        ListIterator<Person> personListIterator = linkedList.listIterator();
//        while (personListIterator.hasNext()) {
//            System.out.println(personListIterator.next());
//        }
//    }
//
////    private static void queues() {
////        Queue<Person> supermarket = new LinkedList<>();
////        supermarket.add(new Person("john", 21));
////        supermarket.add(new Person("sruthi", 18));
////        supermarket.add(new Person("riya", 27));
////
////        System.out.println(supermarket.size());
////        System.out.println(supermarket.peek());
////        System.out.println(supermarket.poll());
////        System.out.println(supermarket.size());
////    }
//
//    static class Person {
//        String name;
//        int age;
//
//        public Person(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//    }
//}
