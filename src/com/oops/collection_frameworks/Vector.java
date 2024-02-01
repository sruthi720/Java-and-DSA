package com.oops.collection_frameworks;

import java.util.List;

public class Vector {
    public static void main(String[] args) {

        //VECTOR example ,same as array list ,but it is slower
        List<Integer> list3 = new java.util.Vector<>();
        list3.add(2);
        list3.add(4);
        list3.add(5);
        list3.add(7);
        list3.add(8);
        System.out.println(list3);
    }
}
