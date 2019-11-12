package by.epam.task414;

public class GroupView {

  Group trains;

  public GroupView() {
  }

  public GroupView(Group trains) {
    this.trains = trains;
  }

  public Group getTrains() {
    return trains;
  }

  public void setTrains(Group trains) {
    this.trains = trains;
  }

  public void showTrain() {
    System.out.println("All destination names: ");
    for (int i = 0; i < trains.getTrains().length; i++) {
      System.out.println(trains.getTrains(i).toString()+ " ");
    }
    System.out.println();
  }

  public void showOneTrain(int numberOfTrain) {
    for (int i = 0; i < trains.getTrains().length; i++) {
      if (trains.getTrains(i).getNumberOfTrain() == numberOfTrain) {
        System.out.println(trains.getTrains(i).toString() + " ");
        System.out.println();
        return;
      }
    }
    System.out.println("A train with that number does not exist.");
  }

}
