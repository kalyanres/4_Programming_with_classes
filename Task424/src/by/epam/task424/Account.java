package by.epam.task424;

import java.util.Objects;

public class Account {
  private String customerName;
  private String accountNumber;
  private int amount;
  private boolean blockAccount;

  public Account() {
  }

  public Account(String customerName, String accountNumber, int amount) {
    this.customerName = customerName;
    this.accountNumber = accountNumber;
    this.amount = amount;
    this.blockAccount = false;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public boolean isBlockAccount() {
    return blockAccount;
  }

  public void setBlockAccount() {
    this.blockAccount = true;
  }

  public void setUnBlockAccount() {
    this.blockAccount = false;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Account)) return false;
    Account account = (Account) o;
    return Double.compare(account.getAmount(), getAmount()) == 0 &&
            isBlockAccount() == account.isBlockAccount() &&
            Objects.equals(getAccountNumber(), account.getAccountNumber());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAccountNumber(), getAmount(), isBlockAccount());
  }

  @Override
  public String toString() {
    String string;
    if (!this.blockAccount) {
      string ="Account{" +
              '\'' + customerName + '\'' +
              ", accountNumber='" + accountNumber + '\'' +
              ", amount=" + amount +
              ", account doesn't blocked"+
              '}';
    } else {
      string ="Account{" +
              '\'' + customerName + '\'' +
              ", accountNumber='" + accountNumber + '\'' +
              ", amount=" + amount +
              ", account blocked"+
              '}';

    }
    return string;
  }
}
