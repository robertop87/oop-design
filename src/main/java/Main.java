import application.DeadSoundBehavior;
import application.DogDisplay;
import application.Duck;
import application.DuckFly;
import application.GuauBehavior;
import application.MallardDuckDisplay;
import application.NoFly;
import application.QuackSound;
import application.RedheadDisplay;
import application.RobotDisplay;
import application.RobotSound;
import application.RubberDisplay;
import application.SoundBehavior;
import application.SqueazSound;
import client.DefaultFireBehavior;
import client.Robot;
import client.Sprite;
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
