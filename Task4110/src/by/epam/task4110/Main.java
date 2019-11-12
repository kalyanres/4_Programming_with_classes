package by.epam.task4110;

/*
 *  10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,
 * set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа
 * Airline, с подходящими конструкторами и методами. Задать критерии выбора данных и
 * вывести эти данные на консоль.
 *    Airline: пункт назначения, номер рейса, тип самолета,
 * время вылета, дни недели. Найти и вывести:
 *      a) список рейсов для заданного пункта назначения;
 *      b) список рейсов для заданного дня недели;
 *      c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Main {

    public static void main(String[] args) {

        Airline[] airlines = new Airline[10];

        airlines[0] = new Airline("Budapest", 811, "CRJ",
                new Time(13, 20, 0), "Thursday");
        airlines[1] = new Airline("Budapest", 813, "CRJ",
                new Time(12, 45, 0), "Sunday");
        airlines[2] = new Airline("Geneva", 871, "Embraer 175",
                new Time(12, 10, 0), "Sunday");
        airlines[3] = new Airline("Geneva", 871, "Boeing 737",
                new Time(15, 15, 0), "Saturday");
        airlines[4] = new Airline("Nice", 815, "Embraer 175",
                new Time(8, 35, 0), "Saturday");
        airlines[5] = new Airline("London", 851, "Embraer 195",
                new Time(12, 10, 0), "Wednesday");
        airlines[6] = new Airline("London", 851, "Embraer 195",
                new Time(12, 30, 0), "Monday");
        airlines[7] = new Airline("Paris", 863, "Embraer 195",
                new Time(14, 50, 0), "Monday");
        airlines[8] = new Airline("Paris", 865, "Embraer 195",
                new Time(12, 40, 0), "Friday");
        airlines[9] = new Airline("Paris", 863, "Boing 737",
                new Time(8, 25, 0), "Sunday");

        AirTraffic airTraffic = new AirTraffic(airlines);
        AirTrafficView airTrafficView = new AirTrafficView(airTraffic);

        // вывод всех рейсов
        airTrafficView.showAllAirlines();

        //a) список рейсов для заданного пункта назначения;
        System.out.println("The list of airlines to Budapest");
        airTrafficView.showDestination("Budapest");

        // b) список рейсов для заданного дня недели;
        System.out.println("The list of airlines to departure on Sunday");
        airTrafficView.showDayOfWeek("Sunday");

        // c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
        System.out.println("The list of airlines to departure on Monday after 12:00 o'clock");
        airTrafficView.showDayOfWeekTime("Monday", new Time(12, 0, 0));
    }
}
