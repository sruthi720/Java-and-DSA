package com.oops.singleton;

public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;

    public static Singleton  getInstance(){    //it return singleton type of instance
      if(instance==null){
          instance =new Singleton();
      }
      return instance;
    }
}
