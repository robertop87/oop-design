package edu.alenasoft.patterns.decorator;

public interface Extra extends Food {

  @Override
  String saleDescription();

  @Override
  int getTotalPrice();
}
