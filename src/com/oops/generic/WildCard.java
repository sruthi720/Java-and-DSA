package com.oops.generic;

import java.util.Arrays;
import java.util.List;

public class WildCard<T extends Number> {//can be any type of number, upperbound wildcard


    //How do this parameterised type is let us choose what type of data to put inside custom classes .
    // It is done  via Generics

    //writing the same code for string data type will be tedious
    //1.Code Reusability :what if there is a common template of code u can use it with by  only changing the data types of it.
    //2.Type safety:What if there's only one type of  data should be provided.all other not able to enter.
           //        eg: only integer allowed-->
           //        ArrayList<Integer> A =new ArrayList<>();
           //        A.add("Sruthi"); // will vbe an error
    //3.Generics Can only be classes not primitive types




    private Object[] data ; //will not be out of scope since its size not mentioned
    private static int DEFAULT_SIZE =10;
    private int size =0;

    public WildCard(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void  add(T num){
        if (isFull()) {
            resize();
        }
        data[size++]=num;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        Object[] temp = new Object[data.length*2];

        //copy current items to the temp arrray and   point data variable to temp data
        for (int i=0; i<data.length; i++){
            temp[i]=data[i];
        }
        data= temp;
    }

    public T remove(){
        T removed = (T) data[size--];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public void set(int index ,T value){
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



    public void  getList(List<Number> list){
        System.out.println(list);//can only pass number type
    }
    public void getLists(List< ? extends Number> list1){
        System.out.println(list1);// if you want to pass subclasses of this Numbers use this ie, integer or float
    }




    public static void main(String[] args) {
        WildCard list1 = new WildCard();
        list1.add(5);
        list1.add(9);
        list1.add(6);
        list1.add(7);
        list1.add(2);

        System.out.println(list1);;

//        WildCard<String> list2 = new WildCard();
//        list2.add("h");
//        list2.add("e");
//        list2.add("l");
//        list2.add("l");
//        list2.add("o");
//        System.out.println(list2); //it cant be number since it contains number

        WildCard<Float> list3 = new WildCard();
        list3.add(0.5f);
        list3.add(9.4f);
        list3.add(6.0f);
        list3.add(7.1f);
        list3.add(2f);

        System.out.println(list3);

    }
}
