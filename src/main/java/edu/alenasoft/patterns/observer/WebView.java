package edu.alenasoft.patterns.observer;

public class WebView implements DataStorageObserver {

  @Override
  public void notifyAction(Double factor) {
    System.out.println("WEB T/C" + factor);
  }
}
