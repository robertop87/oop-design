package edu.alenasoft.patterns.decorator;

public class Pizza implements Food {

  private final String name = "Pizza";
  private int price;

  public Pizza(int price) {
    this.price = price;
  }

  @Override
  public String saleDescription() {
    return String.format("%s ", this.name);
  }

  @Override
  public int getTotalPrice() {
    return this.price;
  }
}
