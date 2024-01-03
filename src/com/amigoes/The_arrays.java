package com.amigoes;

public class The_arrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0]="Purple";
        colors[1]="Blue";
        colors[2]="Yellow";

        for (int i=colors.length-1; i>=0 ; i--){
            System.out.println(colors[i]);
        }
    }
}
