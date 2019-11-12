package by.epam.task4110;

public class AirTrafficView{

  private AirTraffic airTraffic;

  public AirTrafficView(AirTraffic airTraffic) {
    this.airTraffic = airTraffic;
  }

  // вывод в консоль всех рейсов
  public void showAllAirlines() {
    for (int i = 0; i < airTraffic.getAirlines().length; i++) {
      System.out.println(airTraffic.getAirlines()[i].toString());
    }
    System.out.println();
  }

  //a) список рейсов для заданного пункта назначения;
  public void showDestination(String destination) {
    for (int i = 0; i < airTraffic.getDestination(destination).length; i++) {
      System.out.println(airTraffic.getDestination(destination)[i].toString());
    }
    System.out.println();
  }

  // b) список рейсов для заданного дня недели;
  public void showDayOfWeek(String dayOfWeek) {
    for (int i = 0; i < airTraffic.getDayOfWeek(dayOfWeek).length; i++) {
      System.out.println(airTraffic.getDayOfWeek(dayOfWeek)[i].toString());
    }
    System.out.println();
  }

  // c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
  public void showDayOfWeekTime(String dayOfWeek, Time time) {
    for (int i = 0; i < airTraffic.getDayOfWeekTime(dayOfWeek, time).length; i++) {
      System.out.println(airTraffic.getDayOfWeekTime(dayOfWeek, time)[i].toString());
    }
    System.out.println();
  }
}
