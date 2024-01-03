package com.amigoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
//        List<String> colors =new LinkedList<>();
        List<String> colors =new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("White");
        System.out.println(colors);

        for (String  color: colors){
            System.out.println(color);

        }

        colors.forEach(System.out::println);

        for(int i=0; i<colors.size(); i++){
            System.out.println(colors.get(i));
        }
    }
}
