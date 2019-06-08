package edu.alenasoft.patterns.iterator;

public class CasaCambaFoodIterator implements FoodIterator {

  private MenuItem[] items;
  private int position;

  public CasaCambaFoodIterator(MenuItem[] items) {
    this.items = items;
    this.position = 0;
  }

  @Override
  public MenuItem next() {
    return this.items[this.position++];
  }

  @Override
  public boolean isDone() {
    return this.position >= this.items.length;
  }

  @Override
  public MenuItem currentItem() {
    return this.items[this.position];
  }
}
