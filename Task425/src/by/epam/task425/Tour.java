package by.epam.task425;

public class Tour {
  private String country;
  private String type;
  private String transport;
  private String meals;
  private int numberOfDays;

  public Tour() {
  }

  public Tour(String country, String type, String transport, String meals, int numberOfDays) {
    this.country = country;
    this.type = type;
    this.transport = transport;
    this.meals = meals;
    this.numberOfDays = numberOfDays;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTransport() {
    return transport;
  }

  public void setTransport(String transport) {
    this.transport = transport;
  }

  public String getMeals() {
    return meals;
  }

  public void setMeals(String meals) {
    this.meals = meals;
  }

  public int getNumberOfDays() {
    return numberOfDays;
  }

  public void setNumberOfDays(int numberOfDays) {
    this.numberOfDays = numberOfDays;
  }

  @Override
  public String toString() {
    return "Tour {" +
            " '" + country + '\'' +
            ", '" + type + '\'' +
            ", transport = '" + transport + '\'' +
            ", meals = '" + meals + '\'' +
            ", " + numberOfDays + " days% " +
            '}';
  }
}
