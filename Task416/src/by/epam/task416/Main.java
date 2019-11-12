package by.epam.task416;

/*
 * 6.
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
 * времени на заданное количество часов, минут и секунд.
 */
public class Main {

    public static void main(String[] args) {
      Time clock = new Time();
      Time clock_t = new Time(7, 55, 4);

      System.out.println(clock.toString());
      System.out.println(clock_t.toString());

      clock.setHour(4);
      clock.setMinute(32);
      clock.setSecond(77);

      clock_t.setHour(0);
      clock_t.setMinute(8);
      clock_t.setSecond(0);

      System.out.println(clock.toString());
      System.out.println(clock_t.toString());
    }
}
