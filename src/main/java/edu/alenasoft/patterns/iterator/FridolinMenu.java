package edu.alenasoft.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class FridolinMenu implements FoodMenu {

  private List<MenuItem> items;

  public FridolinMenu() {
    this.items = new ArrayList(0);
    this.items.add(new MenuItem("Pan", 2.5));
    this.items.add(new MenuItem("Torta", 72.5));
    this.items.add(new MenuItem("Tamal", 6.0));
  }

  @Override
  public FoodIterator createIterator() {
    return new FridolinIterator(this.items);
  }
}
