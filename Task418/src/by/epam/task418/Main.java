package by.epam.task418;

import java.util.Scanner;

/*
 * 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get-
 * методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими
 * конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *  Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 *  Найти и вывести:
 *      a) список покупателей в алфавитном порядке;
 *      b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Main {

  public static void main(String[] args) {
    Customer[] list = new Customer[5];

    list[0] = new Customer("01", "Allen", "Woody",
            "30 5th Avenue, New York", 33323,
            "123123123123");

    list[1] = new Customer("02", "Aykroyd", "Dan",
            "1180 S. Beverly Drive #618, Los Angeles", 77231,
            "000111222333");

    list[2] = new Customer("03", "Basinger", "Kim",
            "4833Don Juan Place, Woodland Hills", 23013,
            "012012012012");

    list[3] = new Customer("04", "Bridges", "Jeff",
            "985 Hot Springs Road, Montecito", 20113,
            "321321321321");

    list[4] = new Customer("05", "Cruise", "Tom",
            "14755 Ventura Boulevard #1-710, Sherman Oaks",
            20313, "132132132132");

    Base customers = new Base(list);

    // a) список покупателей в алфавитном порядке;
    String[] sur = customers.getSurName();
    customers.sortName();
    for (int i = 0; i < list.length; i++) {
      System.out.println(sur[i]);
    }

    //  b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
    System.out.println("Enter interval of credit cards: ");
    System.out.print("begin: ");

    Scanner in = new Scanner(System.in);
    int begin = in.nextInt();

    System.out.print("end: ");
    int end = in.nextInt();

    int c = 0;
    for (int i = 0; i < list.length; i++) {
      if (begin < list[i].getNumberOfCredCard() &&
              end > list[i].getNumberOfCredCard()) {
        System.out.println(list[i].getFirstName() + " " + list[i].getSurName());
      }
    }
  }
}

