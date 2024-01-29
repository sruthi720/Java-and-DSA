package com.oops.Properties.AbstarctClasses.interfaces;

public class NiceCar {
    private Engine engine; //by default
    private Media music =new CDplayer();


    public NiceCar(){
        engine = new PowerEngine();

    }
    public  NiceCar(Engine engine){
            this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }

    public  void  startMusic(){
        music.start();
    }
    public  void  stopMusic(){
        music.stopMusic();
    }

    public void UpgradeEngine() { this.engine = new ElectricEngine();}

}
