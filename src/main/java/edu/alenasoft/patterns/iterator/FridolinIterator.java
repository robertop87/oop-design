package edu.alenasoft.patterns.iterator;

import java.util.List;

public class FridolinIterator implements FoodIterator {

  private List<MenuItem> items;
  private int position;

  public FridolinIterator(
      List<MenuItem> items) {
    this.items = items;
    this.position = 0;
  }

  @Override
  public MenuItem next() {
    return this.items.get(this.position++);
  }

  @Override
  public boolean isDone() {
    return this.position >= this.items.size();
  }

  @Override
  public MenuItem currentItem() {
    return this.items.get(this.position);
  }
}
