package edu.alenasoft.patterns.iterator;

public interface FoodIterator {

  MenuItem next();
  boolean isDone();
  MenuItem currentItem();
}
