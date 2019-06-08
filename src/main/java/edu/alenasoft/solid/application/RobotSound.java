package edu.alenasoft.solid.application;

public class RobotSound implements SoundBehavior {

  @Override
  public void play() {
    System.out.println("BEEP");
  }
}
