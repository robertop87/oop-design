package edu.alenasoft.patterns.iterator;

import java.util.Iterator;

// Esto es utilizando el default de JAVA
public class TestIterator implements Iterator<MenuItem> {

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public MenuItem next() {
    return null;
  }
}
