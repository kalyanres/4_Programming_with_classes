package by.epam.task4110;

public class AirTraffic {
  private Airline[] airlines;

  public AirTraffic() {
  }

  public AirTraffic(Airline[] airlines) {
    this.airlines = airlines;
  }

  public Airline[] getAirlines() {
    return airlines;
  }

  public void setAirlines(Airline[] airlines) {
    this.airlines = airlines;
  }

  // создание массива из рейсов одинакового пункта назначения
  // указанного в "destination"
  public Airline[] getDestination(String destination) {
    int count = 0;
    int j = 0;
    for (int i = 0; i < airlines.length; i++) {
      if (destination.equals(airlines[i].getDestination()))
        count++;
    }
    Airline[] array = new Airline[count];
    for (int i = 0; i < airlines.length; i++) {
      if (destination.equals(airlines[i].getDestination())) {
        array[j] = airlines[i];
        j++;
      }
    }
    return array;
  }

  // создание массива из рейсов одинакового дня недели
  // указанного в "dayOfWeek"
  public Airline[] getDayOfWeek(String dayOfWeek) {
    int count = 0;
    int j = 0;
    for (int i = 0; i < airlines.length; i++) {
      if (dayOfWeek.equals(airlines[i].getDayOfWeek()))
        count++;
    }
    Airline[] array = new Airline[count];
    for (int i = 0; i < airlines.length; i++) {
      if (dayOfWeek.equals(airlines[i].getDayOfWeek())) {
        array[j] = airlines[i];
        j++;
      }
    }
    return array;
  }

  // создание массива из рейсов одинакового дня недели
  // указанного в "dayOfWeek" и времени после указанного в "time"
  public Airline[] getDayOfWeekTime(String dayOfWeek, Time time) {
    int count = 0;
    int j = 0;
    for (int i = 0; i < airlines.length; i++) {
      if (dayOfWeek.equals(airlines[i].getDayOfWeek()) &&
          airlines[i].getDepartureTime().equals(time))
        count++;
    }
    Airline[] array = new Airline[count];
    for (int i = 0; i < airlines.length; i++) {
      if (dayOfWeek.equals(airlines[i].getDayOfWeek()) &&
              airlines[i].getDepartureTime().equals(time)) {
        array[j] = airlines[i];
        j++;
      }
    }
    return array;
  }

}
