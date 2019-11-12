package by.epam.task425;

/*
 *      5. Туристические путевки. Сформировать набор предложений клиенту по выбору
 * туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз
 * и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта, питания
 * и числа дней. Реализовать выбор и сортировку путевок.
 */

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Tour[] tours = new Tour[20];
    tours[0] = new Tour("Egypt", "rest", "plane", "AI", 12);
    tours[1] = new Tour("Egypt", "shopping", "plane", "HB+", 6);
    tours[2] = new Tour("Egypt", "excursion", "plane", "HB", 10);
    tours[3] = new Tour("UAE", "shopping", "plane", "BB", 4);
    tours[4] = new Tour("UAE", "excursion", "plane", "BB+", 6);
    tours[5] = new Tour("Greece", "excursion", "bus", "BB", 7);
    tours[6] = new Tour("Greece", "shopping", "bus", "BB", 4);
    tours[7] = new Tour("Turkey", "rest", "plane", "AI", 14);
    tours[8] = new Tour("Turkey", "rest", "plane", "AI", 14);
    tours[9] = new Tour("Minsk-Riga-Stockholm-Copenhagen-Amsterdam", "cruise",
            "ferry", "AI", 6);
    tours[10] = new Tour("Cuba", "cruise", "cruise ship", "AI", 13);
    tours[11] = new Tour("Karlovy Vary", "treatment", "bus", "FB", 10);
    tours[12] = new Tour("Heviz Lake", "treatment", "bus", "HB", 14);
    tours[13] = new Tour("Andorra", "rest", "plane", "AI", 7);
    tours[14] = new Tour("Sri Lanka", "rest", "plane", "AI", 12);
    tours[15] = new Tour("Thailand", "rest", "plane", "HB", 11);
    tours[16] = new Tour("New Zealand", "excursion", "plane", "HB+", 15);
    tours[17] = new Tour("Portugal", "rest", "plane", "BB", 10);
    tours[18] = new Tour("Crete", "shopping", "ferry", "HB", 5);
    tours[19] = new Tour("Montenegro", "rest", "bus", "FB", 12);

    Travel travel = new Travel(tours);
    TravelView travelView = new TravelView(travel);
    travelView.showTravel();

    System.out.print("What type of tour do you want to choose? :: ");

    Scanner in = new Scanner(System.in);
    String string = in.nextLine();
    Travel travelTour = new Travel(travel.searchType(string));
    travelView.setTravel(travelTour);
    travelView.showTravel();

    System.out.print("What transport do you want to use? :: ");
    string = in.nextLine();
    travelTour.setTours(travelTour.searchTransport(string));
    travelView.setTravel(travelTour);
    travelView.showTravel();


  }
}
