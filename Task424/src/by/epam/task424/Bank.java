package by.epam.task424;

public class Bank {
  private Account[] accounts;

  public Bank() {
  }

  public Bank(Account[] accounts) {
    this.accounts = accounts;
  }

  public Account[] getAccounts() {
    return accounts;
  }

  public void setAccounts(Account[] accounts) {
    this.accounts = accounts;
  }

  // поиск всех счетов данного клиента
  public Account[] searchName(String customerName) {
    int count = 0;
    // ищем все счета с данным именем клиента
    for (int i = 0; i < accounts.length; i++) {
      if (customerName.equals(accounts[i].getCustomerName())) {
        count++;
      }
    }
    if (count == 0)
      return null;
    // создаем и заполняем массив счетов данного клиента
    Account[] array = new Account[count];
    int j = 0;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i].getCustomerName().equals(customerName)) {
        array[j] = accounts[i];
        j++;
      }
    }
    return array;
  }

  // поиск по номеру счета
  public Account searchAccountNumber(String accountNumber) {
    for (Account account : accounts) {
      if (account.getAccountNumber().equals(accountNumber))
        return account;
    }
    return null;
  }

  // поиск заблокированных счетов
  public Account[] searchBlockedAccount() {
    int count = 0;
    for (Account account : accounts) {
      if (account.isBlockAccount())
        count++;
    }
    if (count == 0)
      return null;
    // создаем и заполняем массив заблокированных счетов
    Account[] array = new Account[count];
    int j = 0;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i].isBlockAccount()) {
        array[j] = accounts[i];
        j++;
      }
    }
    return array;
  }

  // поиск незаблокированных счетов
  public Account[] searchNotBlockedAccount() {
    int count = 0;
    for (Account account : accounts) {
      if (!account.isBlockAccount())
        count++;
    }
    if (count == 0)
      return null;
    // создаем и заполняем массив заблокированных счетов
    Account[] array = new Account[count];
    int j = 0;
    for (int i = 0; i < accounts.length; i++) {
      if (!accounts[i].isBlockAccount()) {
        array[j] = accounts[i];
        j++;
      }
    }
    return array;
  }

  // сортировка счетов по именам клиентов
  public void sortCustomerNames() {
    int j = 0;
    Account temp;
    int n = accounts.length;
    int c = 0; // переменная для перехода к следующему символу
    // реализация сортировки Шелла
    while (j < n - 1) {
      if (!accounts[j].getCustomerName().equals(accounts[j + 1].getCustomerName())) {
        if (accounts[j].getCustomerName().charAt(c) >
                accounts[j + 1].getCustomerName().charAt(c)) {
          temp = accounts[j];
          accounts[j] = accounts[j + 1];
          accounts[j + 1] = temp;
          if (j > 0) {
            j--;
            c = 0;
          } else {
            j++;
            c = 0;
          }
          // если символы совпадают, сравниваем следующие
        } else if (accounts[j].getCustomerName().charAt(c) ==
                accounts[j + 1].getCustomerName().charAt(c)) {
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

  // сортировка счетов по номеру счета
  public void sortAccountNumber() {
    int j = 0;
    Account temp;
    int n = accounts.length;
    int c = 0; // переменная для перехода к следующему символу
    // реализация сортировки Шелла
    while (j < n - 1) {
      if (accounts[j].getAccountNumber().charAt(c) >
              accounts[j + 1].getAccountNumber().charAt(c)) {
        temp = accounts[j];
        accounts[j] = accounts[j + 1];
        accounts[j + 1] = temp;
        if (j > 0) {
          j--;
          c = 0;
        } else {
          j++;
          c = 0;
        }
        // если символы совпадают, сравниваем следующие
      } else if (accounts[j].getAccountNumber().charAt(c) ==
              accounts[j + 1].getAccountNumber().charAt(c)) {
        c++;
      } else {
        j++;
        c = 0;
      }
    }
  }

  // сортировка счетов по сумме, находящейся на счету
  public void sortAmount() {
    int j = 0;
    Account temp;
    int n = accounts.length;
    // реализация сортировки Шелла
    while (j < n - 1) {
      if (accounts[j].getAmount() >
              accounts[j + 1].getAmount()) {
        temp = accounts[j];
        accounts[j] = accounts[j + 1];
        accounts[j + 1] = temp;
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

  // вычисление общей суммы по счетам
  public int calcBalance() {
    int sum = 0;
    for (Account account : accounts) {
      sum += account.getAmount();
    }
    return sum;
  }

  // вычисление общей суммы по счетам, имеющим отрицательный баланс
  public int calcNegativeBalance() {
    int sum = 0;
    for (Account account : accounts) {
      if (account.getAmount() < 0)
        sum += account.getAmount();
    }
    return sum;
  }

  // вычисление общей суммы по счетам, имеющим положительный баланс
  public int calcPositiveBalance() {
    int sum = 0;
    for (Account account : accounts) {
      if (account.getAmount() > 0)
        sum += account.getAmount();
    }
    return sum;
  }

  // вычисление суммы по любым набором счетов если счет не блокирован
  public int calcSomeBalance(Account[] accounts) {
    int sum = 0;
    for (Account account : accounts) {
      if (!account.isBlockAccount())
        sum += account.getAmount();
    }
    return sum;
  }
}
