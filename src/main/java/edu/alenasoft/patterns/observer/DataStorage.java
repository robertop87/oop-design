package edu.alenasoft.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class DataStorage implements DataStorageSubject {

  List<DataStorageObserver> observers;
  private Double factor;

  public DataStorage(Double factor) {
    this.observers = new ArrayList<>(0);
    this.factor = factor;
  }

  public void setFactor(Double factor) {
    this.factor = factor;
    this.notifyAllObservers();
  }

  @Override
  public void attach(DataStorageObserver dataStorageObserver) {
    this.observers.add(dataStorageObserver);
  }

  @Override
  public void notifyAllObservers() {
    this.observers.forEach(obs -> obs.notifyAction(this.factor));
  }
}
