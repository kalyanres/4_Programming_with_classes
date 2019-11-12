package by.epam.task419;

/*
 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Book[] books = new Book[10];

      books[0] = new Book(1, "The Call of the Wild", "Jack London",
              "CreateSpace Independent Publishing Platform", 2018, 66, 1.99,
              "soft");
      books[1] = new Book(2, "Tom Sawyer and Huckleberry Finn","Mark Twain",
              "Everyman's Library", 1991, 600, 8.79,
              "hard");
      books[2] = new Book(3, "The Adventures of Huckleberry Finn","Mark Twain",
              "GIANLUCA", 2017, 233, 9.99,
              "hard");
      books[3] = new Book(4, "Martin Eden: 100th Anniversary Collection","Jack London",
              "SeaWolf Press", 2018, 444, 8.64,
              "hard");
      books[4] = new Book(5, "Life on the Mississippi","Mark Twain",
              "SeaWolf Press", 2018, 488, 12.90,
              "hard");
      books[5] = new Book(6, "Uncle Tom's Cabin","Harriet Beecher Stowe",
              "Wordsworth Editions Ltd", 1999, 480, 3.99,
              "soft");
      books[6] = new Book(7, "Macbeth (Second Edition)","William Shakespeare",
              "W. W. Norton & Company", 2013, 416, 5.89,
              "hard");
      books[7] = new Book(8, "Hamlet","William Shakespeare",
              "Simon & Schuster", 1992, 342, 3.83,
              "soft");
      books[8] = new Book(9, "Complete Sherlock Holmes","Sir Arthur Conan Doyle",
              "Wordsworth Editions Ltd", 2008, 1408, 17.63,
              "hard");
      books[9] = new Book(010, "Treasure Island","Robert Louis Stevenson",
              "SeaWolf Press", 2018, 256, 9.95,
              "hard");

      Library libr = new Library(books);

      // a) список книг заданного автора;
      System.out.println("The list of authors: ");
      String[] authors = libr.getAuthor();
      for (int i = 0; i < books.length; i++) {
        System.out.println('\t' + authors[i]);
      }
      System.out.print("\nEnter author: ");
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String[] booksAuthor = libr.getBookOfAuthor(str);
      for (int i = 0; i < booksAuthor.length; i++) {
        System.out.println(booksAuthor[i]);
      }
      System.out.println();

      //  b) список книг, выпущенных заданным издательством;
      String[] publish = libr.getPublishingHouse();
      for (int i = 0; i < books.length; i++) {
        System.out.println(publish[i]);
      }
      System.out.print("\nEnter publish: ");
      str = in.nextLine();

      publish = libr.getBooksOfPublish(str);
      for (int i = 0; i < publish.length; i++) {
        System.out.println(publish[i]);
      }
      System.out.println();

      //  c) список книг, выпущенных после заданного года.
      System.out.println("\nEnter year: ");
      int year = in.nextInt();

      String[] booksAfterYear = libr.getBooksAfterYear(year);
      for (int i = 0; i < books.length; i++) {
        System.out.println(booksAfterYear[i]);
      }
    }
}
