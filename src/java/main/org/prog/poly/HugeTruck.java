package org.prog.poly;

public class HugeTruck extends GasTruck {
    @Override
    public void accelerate() {
        System.out.println("Gas truck accelerates");
    }

    @Override
    public void stop() {
        System.out.println("Gas truck slows down");
    }

    //TODO: override accelerate and stop methods
}