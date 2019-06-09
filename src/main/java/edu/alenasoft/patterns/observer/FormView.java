package edu.alenasoft.patterns.observer;

public class FormView implements DataStorageObserver {

  private Double currentFactor;

  public FormView(Double currentFactor) {
    this.currentFactor = currentFactor;
  }

  public void printForm() {
    System.out.println("FormView: Operacion con factor"
        + this.currentFactor);
  }

  @Override
  public void notifyAction(Double factor) {
    this.currentFactor = factor;
    System.out.println("Cambio el factor " + factor);
  }
}
