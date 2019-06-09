package edu.alenasoft.patterns.observer;

public interface DataStorageSubject {

  void attach(DataStorageObserver dataStorageObserver);
  void notifyAllObservers();
}
