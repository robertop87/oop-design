package edu.alenasoft.patterns.iterator;

public class CasaCambaMenu implements FoodMenu {

  private MenuItem[] items;
  private final int maxItems = 5;

  public CasaCambaMenu() {
    this.items = new MenuItem[this.maxItems];
    this.items[0] = new MenuItem("Majao de charque", 35.0);
    this.items[1] = new MenuItem("Locro", 25.0);
    this.items[2] = new MenuItem("Sopa de Maní", 20.0);
    this.items[3] = new MenuItem("Keperí", 35.0);
    this.items[4] = new MenuItem("Jarra de chicha", 40.0);
  }

  @Override
  public FoodIterator createIterator() {
    return new CasaCambaFoodIterator(this.items);
  }
}
