package application;

import client.Sprite;

public class Duck implements Sprite {

  private DisplayBehavior displayBehavior;
  private FlyBehavior flyBehavior;
  private SoundBehavior soundBehavior;

  public Duck() {
    this.displayBehavior = new MallardDuckDisplay();
    this.soundBehavior = new QuackSound();
    this.flyBehavior = new DuckFly();
  }

  public Duck(DisplayBehavior displayBehavior,
      FlyBehavior flyBehavior, SoundBehavior soundBehavior) {
    this.displayBehavior = displayBehavior;
    this.flyBehavior = flyBehavior;
    this.soundBehavior = soundBehavior;
  }

  @Override
  public void play() {
    this.displayBehavior.display();
    this.flyBehavior.fly();
    this.soundBehavior.play();
  }

  public void setSoundBehavior(SoundBehavior soundBehavior) {
    this.soundBehavior = soundBehavior;
  }
}
