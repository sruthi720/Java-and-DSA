package com.oops.collection_frameworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();//list is an interface
        List<Integer> list2 = new LinkedList<>();


        list.add(6);//there are many common funtions common to both linked list and arraylist which are in the list interface
        list2.add(5);




    }
}
