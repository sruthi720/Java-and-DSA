package com.amigoes;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<Integer> stacksElements = new Stack<>();
        stacksElements.push(1);
        stacksElements.push(2);
        stacksElements.push(3);

        System.out.println(stacksElements.peek());
        System.out.println(stacksElements.size());
        System.out.println(stacksElements.pop());
        System.out.println(stacksElements.size());
        System.out.println(stacksElements.empty());


    }
    
    
    

}
