package edu.alenasoft.patterns.observer;

public class MainClient {

  public static void main(String[] args) {
    DataStorage dataStorage = new DataStorage(6.96);
    FormView formView = new FormView(6.96);
    dataStorage.attach(formView);
    dataStorage.attach(new WebView());

    formView.printForm();

    dataStorage.setFactor(7.0);
    formView.printForm();

    dataStorage.setFactor(7.0);
    dataStorage.setFactor(15.0);
    dataStorage.setFactor(85.0);
    dataStorage.setFactor(11.0);
  }
}
