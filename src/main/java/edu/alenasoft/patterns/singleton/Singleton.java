package edu.alenasoft.patterns.singleton;

public class Singleton {

  private static Singleton instance;

  private Singleton() {}

  public synchronized static Singleton getInstance() {
    if (Singleton.instance == null) {
      System.out.println("First Time");
      Singleton.instance = new Singleton();
    }
    return Singleton.instance;
  }
}
