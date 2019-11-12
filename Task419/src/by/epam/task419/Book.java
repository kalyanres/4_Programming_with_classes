package by.epam.task419;

public class Book {
  int id;
  String title;
  String author;
  String publishingHouse;
  int year;
  int numberOfPages;
  double price;
  String binding;

  public Book() {
  }

  public Book(int id, String title, String author,
              String publishingHouse, int year,
              int numberOfPages, double price,
              String binding) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.publishingHouse = publishingHouse;
    this.year = year;
    this.numberOfPages = numberOfPages;
    this.price = price;
    this.binding = binding;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPublishingHouse() {
    return publishingHouse;
  }

  public void setPublishingHouse(String publishingHouse) {
    this.publishingHouse = publishingHouse;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages(int numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getBinding() {
    return binding;
  }

  public void setBinding(String binding) {
    this.binding = binding;
  }

  @Override
  public String toString() {
    return "Book{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", publishingHouse='" + publishingHouse + '\'' +
            ", year=" + year +
            ", numberOfPages=" + numberOfPages +
            ", price=" + price +
            ", binding='" + binding + '\'' +
            '}';
  }
}
