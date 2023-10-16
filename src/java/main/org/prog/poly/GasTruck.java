package org.prog.poly;

public class GasTruck extends GasCar {

  @Override
  public void accelerate() {
    System.out.println("Gas truck accelerates");
  }

  @Override
  public void stop() {
    System.out.println("Gas truck slows down");
  }

    @Override
    public void turnLeft() {
        System.out.println("Gas truck slows down and turns left");
    }

    @Override
    public void turnRight() {
        System.out.println("Gas truck slows down and turns right");
    }
}

