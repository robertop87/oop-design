package application;

public class QuackSound implements SoundBehavior {

  @Override
  public void play() {
    System.out.println("QUACK");
  }
}
