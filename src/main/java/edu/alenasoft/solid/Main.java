package edu.alenasoft.solid;

import edu.alenasoft.solid.application.DeadSoundBehavior;
import edu.alenasoft.solid.application.DogDisplay;
import edu.alenasoft.solid.application.Duck;
import edu.alenasoft.solid.application.DuckFly;
import edu.alenasoft.solid.application.GuauBehavior;
import edu.alenasoft.solid.application.MallardDuckDisplay;
import edu.alenasoft.solid.application.NoFly;
import edu.alenasoft.solid.application.QuackSound;
import edu.alenasoft.solid.application.RedheadDisplay;
import edu.alenasoft.solid.application.RobotDisplay;
import edu.alenasoft.solid.application.RobotSound;
import edu.alenasoft.solid.application.RubberDisplay;
import edu.alenasoft.solid.application.SoundBehavior;
import edu.alenasoft.solid.application.SqueazSound;
import edu.alenasoft.solid.client.DefaultFireBehavior;
import edu.alenasoft.solid.client.Robot;
import edu.alenasoft.solid.client.Sprite;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello coders!");

    Duck mallard = new Duck(
        new MallardDuckDisplay(),
        new DuckFly(),
        new QuackSound());

    mallard.setSoundBehavior(new DeadSoundBehavior());

    Duck redhead = new Duck(
        new RedheadDisplay(),
        new DuckFly(),
        new QuackSound()
    );

    Duck rubber = new Duck(
        new RubberDisplay(),
        new NoFly(),
        new SqueazSound()
    );

    Duck dog = new Duck(new DogDisplay(),
        new NoFly(),
        new GuauBehavior());

    Robot robot = new Robot(new RobotDisplay(),
        new RobotSound(),
        new DefaultFireBehavior());

    List<Sprite> sprites = new ArrayList<>(0);
    sprites.add(mallard);
    sprites.add(rubber);
    sprites.add(redhead);
    sprites.add(dog);
    sprites.add(robot);
    sprites.add(new Duck(new MallardDuckDisplay(),
        new NoFly(),
        new RobotSound()));
    Duck special = new Duck();
    special.setSoundBehavior(
        new SoundBehavior() {
          @Override
          public void play() {
            System.out.println("Crazy sound");
          }
        });
    sprites.add(new Duck());
    sprites.add(special);

    sprites.forEach(Sprite::play);
  }
}
