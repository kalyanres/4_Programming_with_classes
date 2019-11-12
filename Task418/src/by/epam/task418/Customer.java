package by.epam.task418;

import java.math.BigInteger;

public class Customer {
  private String id;
  private String surName;
  private String firstName;
  private String address;
  private int numberOfCredCard;
  private String bankAccount;

  public Customer() {}

  public Customer(String id, String surName, String firstName,
                  String address, int numberOfCredCard, String bankAccount) {
    this.id = id;
    this.surName = surName;
    this.firstName = firstName;
    this.address = address;
    this.numberOfCredCard = numberOfCredCard;
    this.bankAccount = bankAccount;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getNumberOfCredCard() {
    return numberOfCredCard;
  }

  public void setNumberOfCredCard(int numberOfCredCard) {
    this.numberOfCredCard = numberOfCredCard;
  }

  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "id='" + id + '\'' +
            ", surName='" + surName + '\'' +
            ", firstName='" + firstName + '\'' +
            ", address='" + address + '\'' +
            ", numberOfCredCard='" + numberOfCredCard + '\'' +
            ", bankAccount='" + bankAccount + '\'' +
            '}';
  }
}
