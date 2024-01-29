package com.oops.Properties.interfaces;

public class CDplayer implements Media {
    @Override
    public void start() {
        System.out.println("Start Media CDplayer ");
    }

    @Override
    public void stopMusic() {
        System.out.println("stop Media CDplayer ");

    }


}
