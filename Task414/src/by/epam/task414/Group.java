package by.epam.task414;

public class Group {

  private Train[] trains;

  public Group(Train[] trains) {
    this.trains = trains;
  }

  public Train[] getTrains() {
    return trains;
  }

  public Train getTrains(int element) {
    return trains[element];
  }

  public void setTrains(Train[] trains) {
    this.trains = trains;
  }

  public void setTrains(int element, Train trains) {
    this.trains[element] = trains;
  }

}
