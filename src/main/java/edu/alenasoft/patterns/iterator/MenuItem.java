package edu.alenasoft.patterns.iterator;

public class MenuItem {

  private String name;
  private Double price;

  public MenuItem(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return String.format("%s, %.2f Bs", this.name, this.price);
  }
}
