package by.epam.task414;

public class GroupLogic {

  private Group trains;

  public GroupLogic(Group trains) {
    this.trains = trains;
  }

  public Group getTrains() {
    return trains;
  }

  public void setTrains(Group trains) {
    this.trains = trains;
  }

  public void sortNumber() {
    int j = 0;
    Train temp;
    int n = trains.getTrains().length;

    // реализация сортировки Шелла
    while (j < n - 1) {
      if (trains.getTrains()[j].numberOfTrain >
              trains.getTrains()[j + 1].numberOfTrain) {
        temp = trains.getTrains()[j];
        trains.setTrains(j, trains.getTrains()[j + 1]);
        trains.setTrains(j + 1, temp);
        if (j > 0)
          j--;
        else
          j++;
      } else
        j++;
    }
  }

  public void sortString() {
    int j = 0;
    Train temp;
    int n = trains.getTrains().length;
    int c = 0; // переменная для перехода к следующему символу

    // если названия пунктов назначения не равны между собой, то сортируем по ним
    // реализация сортировки Шелла
    while (j < n - 1) {
      if (!(trains.getTrains()[j].destName.equals(trains.getTrains()[j + 1].destName))) {
        if (trains.getTrains()[j].destName.charAt(c) >
                trains.getTrains()[j + 1].destName.charAt(c)) {
          temp = trains.getTrains()[j];
          trains.setTrains(j, trains.getTrains()[j + 1]);
          trains.setTrains(j + 1, temp);
          if (j > 0) {
            j--;
            c = 0;
          } else {
            j++;
            c = 0;
          }
          // если символы совпадают, сравниваем следующие
        } else if (trains.getTrains()[j].destName.charAt(c) ==
                trains.getTrains()[j + 1].destName.charAt(c)) {
          c++;
        } else {
          j++;
          c = 0;
        }
      } else { // при равенстве названий пунктов назначения, сортируем по времени
        // реализация сортировки Шелла
        if (trains.getTrains()[j].timeArrive.charAt(c) >
                trains.getTrains()[j + 1].timeArrive.charAt(c)) {
          temp = trains.getTrains()[j];
          trains.setTrains(j, trains.getTrains()[j + 1]);
          trains.setTrains(j + 1, temp);
          if (j > 0) {
            j--;
            c = 0;
          } else {
            j++;
            c = 0;
          }
          // если символы совпадают, сравниваем следующие
        } else if (trains.getTrains()[j].timeArrive.charAt(c) ==
                trains.getTrains()[j + 1].timeArrive.charAt(c)) {
          c++;
        } else {
          j++;
          c = 0;
        }
      }
    }
  }
}
