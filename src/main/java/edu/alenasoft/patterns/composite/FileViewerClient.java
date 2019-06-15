package edu.alenasoft.patterns.composite;

public class FileViewerClient {

  public static void main(String[] args) {
    System.out.println("Visor de archivos");

    Folder myDocuments = new Folder("Mis Documentos");
    File pdf = new PdfFile("CleanCode");

    myDocuments.addFile(pdf);
    myDocuments.addFile(
        new File() {
          @Override
          public void print() {
            System.out.println("final123.zip");
          }
        });
    Folder downloads = new Folder("Downloads");
    downloads.addFile(
        new File() {
          @Override
          public void print() {
            System.out.println("Inner file .docx");
          }
        });

    myDocuments.addFile(pdf);
    myDocuments.addFile(downloads);

    myDocuments.print();
  }
}
