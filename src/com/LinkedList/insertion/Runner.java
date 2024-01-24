package com.LinkedList.insertion;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(18);
        list.insert(67);
        list.insert(54);

        list.insertAtStart(45);
        list.insertAt(2 ,70);

        list.deleteAt(0);



        list.show();
    }
}
