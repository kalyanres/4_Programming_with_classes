package by.epam.task415;

/*
 *
 * 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое
 * значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по
 * умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
 * и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все
 * возможности класса.
 *
 */

public class Main {

    public static void main(String[] args) {
        // имеем одномерный массив чисел от -50 до 50
        // посчитать на сколько положительных чисел больше чем отрицательных
      int n = 100;
      int[] a = new int[n];

      // массив заполняется случайными числами от -50 до 50
      for (int i = 0; i < n; i++){
        a[i] = (int) (Math.random() * 101 - 50);
        System.out.print(a[i] + " ");
      }
      System.out.println();

      Counter counter = new Counter(0, -n, n);
      CounterLogic counterLogic = new CounterLogic(counter);

      for (int i = 0; i < n; i++) {
        if (a[i] < 0) {
          counterLogic.decrease();
        } else if (a[i] > 0) {
          counterLogic.increase();
        }
      }

      counter.setCount(counterLogic.getCounter().getCount());

      System.out.println(counter.toString());
    }
}
