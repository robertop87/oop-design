package edu.alenasoft.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class SoeClient {

  public static void main(String[] args) {
    List<FoodMenu> partnerMenus = new ArrayList<>(0);
    partnerMenus.add(new FridolinMenu());
    partnerMenus.add(new CasaCambaMenu());
    partnerMenus.add(new FridolinMenu());

    partnerMenus.forEach(partnerMenu ->
        printMenu(partnerMenu.createIterator()));
  }

  public static void printMenu(FoodIterator iterator) {
    while (!iterator.isDone()) {
      System.out.println(iterator.next());
    }
  }

  /* Primera implementacion con el problema
  public static void main(String[] args) {
    FridolinMenu fridolinMenu = new FridolinMenu();
    List items = fridolinMenu.getItems();
    System.out.println("=== DESAYUNO");
    for (int i = 0; i < items.size() ; i++) {
      System.out.println(items.get(i));
    }

    System.out.println("=== ALMUERZO");
    CasaCambaMenu casaCambaMenu = new CasaCambaMenu();
    MenuItem[] cambaItems = casaCambaMenu.getItems();
    for (int i = 0; i < cambaItems.length; i++) {
      System.out.println(cambaItems[i]);
    }
  }*/

  /*
  public static void printMenu(Object menu) {
    int size = (menu instanceof CasaCambaMenu)
        ? ((CasaCambaMenu) menu).getItems().length
        : ((FridolinMenu) menu).getItems().size();

    for (int i = 0; i < size; i++) {
      if (menu instanceof CasaCambaMenu) {
        List cItems = Arrays.asList(((CasaCambaMenu) menu).getItems());
        System.out.println(cItems.get(i));
      } else if (menu instanceof FridolinMenu) {
        MenuItem
      }
    }
  }*/
}
