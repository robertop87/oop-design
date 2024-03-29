package edu.alenasoft.solid.client;

import edu.alenasoft.solid.application.DisplayBehavior;
import edu.alenasoft.solid.application.SoundBehavior;

public class Robot implements Sprite {

  private DisplayBehavior displayBehavior;
  private SoundBehavior soundBehavior;
  private FireBehavior fireBehavior;

  public Robot(DisplayBehavior displayBehavior,
      SoundBehavior soundBehavior,
      FireBehavior fireBehavior) {
    this.displayBehavior = displayBehavior;
    this.soundBehavior = soundBehavior;
    this.fireBehavior = fireBehavior;
  }

  @Override
  public void play() {
    this.displayBehavior.display();
    this.soundBehavior.play();
    this.fireBehavior.fire();
  }
}
