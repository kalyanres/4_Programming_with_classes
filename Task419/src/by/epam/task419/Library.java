package by.epam.task419;

public class Library {
  Book[] libr;

  public Library(Book[] libr) {
    this.libr = libr;
  }

  public int[] getId() {
    int[] array = new int[libr.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = libr[i].getId();
    }
    return array;
  }

  public String[] getTitle() {
    String[] array = new String[libr.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = libr[i].getTitle();
    }
    return array;
  }

  public String[] getAuthor() {
    String[] array = new String[libr.length];
    for (int i = 0; i < libr.length; i++) {
      array[i] = libr[i].getAuthor();
    }
    return array;
  }

  public String[] getPublishingHouse() {
    String[] array = new String[libr.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = libr[i].getPublishingHouse();
    }
    return array;
  }

  public int[] getYear() {
    int[] array = new int[libr.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = libr[i].getYear();
    }
    return array;
  }

  public int[] getNumberOfPages() {
    int[] array = new int[libr.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = libr[i].getNumberOfPages();
    }
    return array;
  }

  public double[] getPrice() {
    double[] array = new double[libr.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = libr[i].getPrice();
    }
    return array;
  }

  public String[] getBinding() {
    String[] array = new String[libr.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = libr[i].getBinding();
    }
    return array;
  }

  // вывод массива названий книг по имени автора
  public String[] getBookOfAuthor(String author) {
    int count = 0;
    for (int i = 0; i < libr.length; i++) {
      if (author.equals(libr[i].getAuthor()))
        count++;
    }
    String[] array = new String[count];
    int j = 0;
    for (int i = 0; i < libr.length; i++) {
      if (author.equals(libr[i].getAuthor())) {
        array[j] = libr[i].getTitle();
        j++;
      }
    }
    return array;
  }

  // вывод массива названий книг по названию издательства
  public String[] getBooksOfPublish(String publishHouse) {
    int count = 0;
    for (int i = 0; i < libr.length; i++) {
      if (publishHouse.equals(libr[i].getPublishingHouse()))
        count++;
    }
    String[] array = new String[count];
    int j = 0;
    for (int i = 0; i < libr.length; i++) {
      if (publishHouse.equals(libr[i].getPublishingHouse())) {
        array[j] = libr[i].getTitle();
        j++;
      }
    }
    return array;
  }

  // вывод массива названий книг выпущенных после года "year"
  public String[] getBooksAfterYear(int year) {
    int count = 0;
    for (int i = 0; i < libr.length; i++) {
      if (year < libr[i].getYear())
        count++;
    }
    String[] array = new String[count];
    int j = 0;
    for (int i = 0; i < libr.length; i++) {
      if (year < libr[i].getYear()) {
        array[j] = libr[i].getTitle();
        j++;
      }
    }
    return array;
  }
}
