package edu.alenasoft.patterns.composite;

public class PdfFile implements File {

  private String name;
  private final String extension = ".pdf";

  public PdfFile(String name) {
    this.name = name;
  }

  @Override
  public void print() {
    System.out.println(this.name + this.extension);
  }
}
