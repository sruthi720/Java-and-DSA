package com.oops.Properties.interfaces;

public class ElectricEngine implements  Engine{ // separate class of same interface Engine
    @Override
    public void start() {
        System.out.println("start electric engine");
    }

    @Override
    public void stop() {
        System.out.println("stop electric engine");
    }

    @Override
    public void accelerate() {

    }
    @Override
    public void hi() {

    }
}
