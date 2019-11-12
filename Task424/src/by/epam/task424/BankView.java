package by.epam.task424;

public class BankView {
  private Bank bank;

  public BankView() {
  }

  public BankView(Bank bank) {
    this.bank = bank;
  }

  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }

  public void showAccounts(Account[] accounts) {
    for (Account account : accounts) {
      System.out.println(account.toString());
    }
    System.out.println();
  }

  public void showBank() {
    for (Account account : bank.getAccounts()){
      System.out.println(account.toString());
    }
    System.out.println();
  }

}
