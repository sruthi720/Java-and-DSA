package com.oops.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist_Integer {
    private int[] data ; //will not be out of scope since its size not mentioned
    private static int DEFAULT_SIZE =10;
    private int size =0;

    public CustomArraylist_Integer(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void  add(int num){
        if (isFull()) {
            resize();
        }
        data[size++]=num;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        int[] temp = new int[data.length*2];

        //copy current items to the temp arrray and   point data variable to temp data
        for (int i=0; i<data.length; i++){
            temp[i]=data[i];
        }
        data= temp;
    }

    public int remove(){
        int removed = data[size--];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index ,int value){
        data[index]=value;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArraylist_Integer list = new CustomArraylist_Integer();
        list.add(3);
        list.add(9);
        list.add(8);
        list.add(5);
        list.add(1);
        System.out.println(list);//it is object so toString is modified and override
        //o/p: CustomArraylist{data=[3, 9, 0, 5, 1, 0, 0, 0, 0, 0], size=5} //we just added 5 elements

//        System.out.println(list.remove(3));
//        System.out.println(list.remove(2));
        System.out.println(list.remove());

//        System.out.println(list.size());

        for(int i= 0;i<14; i++){
            list.add(2*i);
        }
        System.out.println(list);


        ArrayList<String> A =new ArrayList<>();
        A.add("Sruthi");
        System.out.println(A); //it cant take anything other than String

//        ArrayList<Integer> A =new ArrayList<>();
//        A.add("Sruthi"); // will vbe an error

        //How do this parameterised type is let us choose what type of data to put inside custom classes .
        // It is done  via Generics


    }
}













//    public static void main(String[] args) {
//        ArrayList list =new ArrayList();
//        list.add(8);
//        list.add(10);
//        list.add(34);
//        list.add(4);
//        list.add(22);
//        list.add(90);
//        list.remove(0);
//        list.set(4,23);
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
//
//    }