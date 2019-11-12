package by.epam.task414;

/*
*
* 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
* Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов
* массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
* пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с
* одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
*
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Train[] table = new Train[5];

        table[0] = new Train("Brest", 29, "13:31");
        table[1] = new Train("Gudogai", 6138, "14:01");
        table[2] = new Train("Grodno", 634, "15:33");
        table[3] = new Train("Grodno", 31, "23:35");
        table[4] = new Train("Grodno", 298, "14:05");

        Group trains = new Group(table);

        System.out.println("Begin: ");
        GroupView trainsView = new GroupView(trains);
        trainsView.showTrain();

        // сортировка
        GroupLogic trainsLogic = new GroupLogic(trains);
        trainsLogic.sortNumber();

        System.out.println("After sorting: ");
        trainsView.setTrains(trainsLogic.getTrains());
        trainsView.showTrain();

        System.out.print("Enter number of train: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        trainsView.showOneTrain(number);

        // сортировка, во-первых, по названию пункта назначения и, во-вторых, по времени
        trainsLogic.sortString();
        trainsView.setTrains(trainsLogic.getTrains());
        trainsView.showTrain();


    }
}

