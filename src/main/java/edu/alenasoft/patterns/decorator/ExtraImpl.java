package edu.alenasoft.patterns.decorator;

public class ExtraImpl implements Extra {

  private Food baseFood;
  private String name;
  private int price;

  public ExtraImpl(Food baseFood, String name, int price) {
    this.price = price;
    this.name = name;
    this.baseFood = baseFood;
  }

  @Override
  public String saleDescription() {
    String baseName = this.baseFood.saleDescription();
    String extendedResult = String.join(" ",
        baseName,
        this.name,
        Integer.toString(this.getTotalPrice()),
        "Bs");
    return extendedResult;
  }

  @Override
  public int getTotalPrice() {
    return this.baseFood.getTotalPrice() + this.price;
  }
}
