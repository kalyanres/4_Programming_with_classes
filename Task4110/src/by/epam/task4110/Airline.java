package by.epam.task4110;

public class Airline {
  private String destination;
  private int flightNumber;
  private String typeOfPlane;
  private Time departureTime;
  private String dayOfWeek;

  public Airline() {
  }

  public Airline(String destination, int flightNumber, String typeOfPlane, Time departureTime, String dayOfWeek) {
    this.destination = destination;
    this.flightNumber = flightNumber;
    this.typeOfPlane = typeOfPlane;
    this.departureTime = departureTime;
    this.dayOfWeek = dayOfWeek;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public int getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(int flightNumber) {
    this.flightNumber = flightNumber;
  }

  public String getTypeOfPlane() {
    return typeOfPlane;
  }

  public void setTypeOfPlane(String typeOfPlane) {
    this.typeOfPlane = typeOfPlane;
  }

  public Time getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(Time departureTime) {
    this.departureTime = departureTime;
  }

  public String getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  @Override
  public String toString() {
    return "Airline{" +
            "destination='" + destination + '\'' +
            ", flightNumber=" + flightNumber +
            ", typeOfPlane='" + typeOfPlane + '\'' +
            ", departureTime=" + departureTime +
            ", daysOfWeek='" + dayOfWeek + '\'' +
            '}';
  }
}
