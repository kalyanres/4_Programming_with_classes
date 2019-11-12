package by.epam.task425;

public class TravelView {
  Travel travel;

  public TravelView() {
  }

  public TravelView(Travel travel) {
    this.travel = travel;
  }

  public Travel getTravel() {
    return travel;
  }

  public void setTravel(Travel travel) {
    this.travel = travel;
  }

  public void showTravel() {
    for (int i = 0; i < travel.getTours().length; i++) {
      System.out.println(travel.getTours()[i].toString());
    }
    System.out.println();
  }

  public void showSomeTravel(Tour[] tours) {
    for (int i = 0; i < tours.length; i++) {
      System.out.println(tours[i].toString());
    }
    System.out.println();
  }
}
