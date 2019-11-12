package by.epam.task425;

public class Travel {
  Tour[] tours;

  public Travel() {
  }

  public Travel(Tour[] tours) {
    this.tours = tours;
  }

  public Tour[] getTours() {
    return tours;
  }

  public void setTours(Tour[] tours) {
    this.tours = tours;
  }

  // поиск путевок по типу отдыха
  public Tour[] searchType(String type) {
    int count = 0;
    for (Tour tour : tours) {
      if (type.equals(tour.getType()))
        count++;
    }
    if (count == 0)
      return null;
    // создаем и заполняем массив
    Tour[] array = new Tour[count];
    int j = 0;
    for (Tour tour : tours) {
      if (type.equals(tour.getType())) {
        array[j] = tour;
        j++;
      }
    }
    return array;
  }

  // поиск путевок по типу транспорта
  public Tour[] searchTransport(String transport) {
    int count = 0;
    for (Tour tour : tours) {
      if (transport.equals(tour.getTransport()))
        count++;
    }
    if (count == 0)
      return null;
    // создаем и заполняем массив
    Tour[] array = new Tour[count];
    int j = 0;
    for (Tour tour : tours) {
      if (transport.equals(tour.getTransport())) {
        array[j] = tour;
        j++;
      }
    }
    return array;
  }

  // поиск путевок по типу питания
  public Tour[] searchMeals(String meals) {
    int count = 0;
    for (Tour tour : tours) {
      if (meals.equals(tour.getMeals()))
        count++;
    }
    if (count == 0)
      return null;
    // создаем и заполняем массив
    Tour[] array = new Tour[count];
    int j = 0;
    for (Tour tour : tours) {
      if (meals.equals(tour.getMeals())) {
        array[j] = tour;
        j++;
      }
    }
    return array;
  }

  // поиск по числу дней
  public Tour[] searchDays(int days) {
    int count = 0;
    for (Tour tour : tours) {
      if (days + 1 >= tour.getNumberOfDays() ||
          days - 1 <= tour.getNumberOfDays())
        count++;
    }
    if (count == 0)
      return null;
    // создаем и заполняем массив
    Tour[] array = new Tour[count];
    int j = 0;
    for (Tour tour : tours) {
      if (days + 1 >= tour.getNumberOfDays() ||
              days - 1 <= tour.getNumberOfDays()) {
        array[j] = tour;
        j++;
      }
    }
    return array;
  }

  // сортировка путевок по странам
  public void sortCountry() {
    int j = 0;
    Tour temp;
    int n = tours.length;
    int c = 0; // переменная для перехода к следующему символу
    // реализация сортировки Шелла
    while (j < n - 1) {
      if (!tours[j].getCountry().equals(tours[j + 1].getCountry())) {
        if (tours[j].getCountry().charAt(c) >
                tours[j + 1].getCountry().charAt(c)) {
          temp = tours[j];
          tours[j] = tours[j + 1];
          tours[j + 1] = temp;
          if (j > 0) {
            j--;
            c = 0;
          } else {
            j++;
            c = 0;
          }
          // если символы совпадают, сравниваем следующие
        } else if (tours[j].getCountry().charAt(c) ==
                tours[j + 1].getCountry().charAt(c)) {
          c++;
        } else {
          j++;
          c = 0;
        }
      } else {
        j++;
        c = 0;
      }
    }
  }

  // сортировка путевок по типу отдыха
  public void sortType() {
    int j = 0;
    Tour temp;
    int n = tours.length;
    int c = 0; // переменная для перехода к следующему символу
    // реализация сортировки Шелла
    while (j < n - 1) {
      if (!tours[j].getType().equals(tours[j + 1].getType())) {
        if (tours[j].getType().charAt(c) >
                tours[j + 1].getType().charAt(c)) {
          temp = tours[j];
          tours[j] = tours[j + 1];
          tours[j + 1] = temp;
          if (j > 0) {
            j--;
            c = 0;
          } else {
            j++;
            c = 0;
          }
          // если символы совпадают, сравниваем следующие
        } else if (tours[j].getType().charAt(c) ==
                tours[j + 1].getType().charAt(c)) {
          c++;
        } else {
          j++;
          c = 0;
        }
      } else {
        j++;
        c = 0;
      }
    }
  }

  // сортировка путевок по типу транспорта
  public void sortTransport() {
    int j = 0;
    Tour temp;
    int n = tours.length;
    int c = 0; // переменная для перехода к следующему символу
    // реализация сортировки Шелла
    while (j < n - 1) {
      if (!tours[j].getTransport().equals(tours[j + 1].getTransport())) {
        if (tours[j].getTransport().charAt(c) >
                tours[j + 1].getTransport().charAt(c)) {
          temp = tours[j];
          tours[j] = tours[j + 1];
          tours[j + 1] = temp;
          if (j > 0) {
            j--;
            c = 0;
          } else {
            j++;
            c = 0;
          }
          // если символы совпадают, сравниваем следующие
        } else if (tours[j].getTransport().charAt(c) ==
                tours[j + 1].getTransport().charAt(c)) {
          c++;
        } else {
          j++;
          c = 0;
        }
      } else {
        j++;
        c = 0;
      }
    }
  }

  // сортировка путевок по типу питания
  public void sortMeals() {
    int j = 0;
    Tour temp;
    int n = tours.length;
    int c = 0; // переменная для перехода к следующему символу
    // реализация сортировки Шелла
    while (j < n - 1) {
      if (!tours[j].getMeals().equals(tours[j + 1].getMeals())) {
        if (tours[j].getMeals().charAt(c) >
                tours[j + 1].getMeals().charAt(c)) {
          temp = tours[j];
          tours[j] = tours[j + 1];
          tours[j + 1] = temp;
          if (j > 0) {
            j--;
            c = 0;
          } else {
            j++;
            c = 0;
          }
          // если символы совпадают, сравниваем следующие
        } else if (tours[j].getMeals().charAt(c) ==
                tours[j + 1].getMeals().charAt(c)) {
          c++;
        } else {
          j++;
          c = 0;
        }
      } else {
        j++;
        c = 0;
      }
    }
  }

  // сортировка по дням отдыха
  public void sortDays() {
    int j = 0;
    Tour temp;
    int n = tours.length;
    // реализация сортировки Шелла
    while (j < n - 1) {
      if (tours[j].getNumberOfDays() >
              tours[j + 1].getNumberOfDays()) {
        temp = tours[j];
        tours[j] = tours[j + 1];
        tours[j + 1] = temp;
        if (j > 0) {
          j--;
        } else {
          j++;
        }
      } else {
        j++;
      }
    }
  }
}
