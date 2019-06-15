package edu.alenasoft.patterns.decorator;

public class MenuClient {

  public static void main(String[] args) {
    System.out.println("Pizza Menu");

    Pizza pizza = new Pizza(85);

    Extra pizzaWithTomato = new ExtraImpl(pizza, "Tomato", 8);
    Extra pizzaWithTomatoBeef = new ExtraImpl(pizzaWithTomato, "Carne", 88);
    Extra pizzaFull = new ExtraImpl(pizzaWithTomatoBeef, "Full", 2000);

    System.out.println(pizzaFull.saleDescription());
//    System.out.println(pizza.saleDescription());
//    System.out.println(pizzaWithBeef.saleDescription());
//    System.out.println(pizzaWithTomato.saleDescription());
  }
}
