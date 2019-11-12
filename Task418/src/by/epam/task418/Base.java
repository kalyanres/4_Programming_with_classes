package by.epam.task418;

public class Base {
  private static Customer[] basis;

  public Base(Customer[] basis) {
    this.basis = basis;
  }

  public String[] getId() {
    String[] array = new String[basis.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = basis[i].getId();
    }
    return array;
  }

  public String[] getSurName() {
    String[] array = new String[basis.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = basis[i].getSurName();
    }
    return array;
  }

  public String[] getFirstName() {
    String[] array = new String[basis.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = basis[i].getFirstName();
    }
    return array;
  }

  public String[] getAddress() {
    String[] array = new String[basis.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = basis[i].getAddress();
    }
    return array;
  }

  public int[] getNumberOfCredCard() {
    int[] array = new int[basis.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = basis[i].getNumberOfCredCard();
    }
    return array;
  }

  public String[] getBankAccount() {
    String[] array = new String[basis.length];
    for (int i = 0; i < array.length; i++) {
      array[i] = basis[i].getBankAccount();
    }
    return array;
  }

  public static void sortName() {
    int j = 0;
    Customer temp;
    int n = basis.length;
    int c = 0; // переменная для перехода к следующему символу

    // реализация сортировки Шелла
    while (j < n - 1) {
      if (!(basis[j].getSurName().equals(basis[j + 1].getSurName()))) {
        if (basis[j].getSurName().charAt(c) > basis[j + 1].getSurName().charAt(c)) {
          temp = basis[j];
          basis[j] = basis[j + 1];
          basis[j + 1] = temp;
          if (j > 0) {
            j--;
            c = 0;
          } else {
            j++;
            c = 0;
          }
          // если символы совпадают, сравниваем следующие
        } else if (basis[j].getSurName().charAt(c) == basis[j + 1].getSurName().charAt(c)) {
          c++;
        } else {
          j++;
          c = 0;
        }
      } else { // при равенстве фамилий, сортируем по именам
        // реализация сортировки Шелла
        if (basis[j].getFirstName().charAt(c) > basis[j + 1].getFirstName().charAt(c)) {
          temp = basis[j];
          basis[j] = basis[j + 1];
          basis[j + 1] = temp;
          if (j > 0) {
            j--;
            c = 0;
          } else {
            j++;
            c = 0;
          }
          // если символы совпадают, сравниваем следующие
        } else if (basis[j].getFirstName().charAt(c) == basis[j + 1].getFirstName().charAt(c)) {
          c++;
        } else {
          j++;
          c = 0;
        }
      }
    }
  }
}
