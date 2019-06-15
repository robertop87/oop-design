package edu.alenasoft.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements File {

  private String name;
  private List<File> files;

  public Folder(String name) {
    this.name = name;
    this.files = new ArrayList<>(0);
  }

  @Override
  public void print() {
    System.out.println(this.name);
    this.files.forEach(File::print);
  }

  public void addFile(File file) {
    this.files.add(file);
  }
}
