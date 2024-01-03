










package com.amigoes;

import java.util.HashSet;
import java.util.Set;

public class SetS {
    public static void main(String[] args) {
        // Your code here
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Yellow"));
        balls.add(new Ball("Red"));
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Green"));

        // Print the added elements using forEach loop
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }

    static class Ball {
        String color;

        public Ball(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Ball{color='" + color + "'}";
        }
    }
}














//package com.amigoes;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class SetS {
//    public static void main(String[] args) {
//        // Your code here
//        Set<Ball> balls = new HashSet<>();
//        balls.add(new Ball("Yellow"));
//        balls.add(new Ball("red"));
//        balls.add(new Ball("blue"));
//        balls.add(new Ball("green"));
//
//        balls.forEach(System.out::println);
//    }
//
//    static class Ball {
//        String color;
//
//        public Ball(String color) {
//            this.color = color;
//        }
//    }
//}
