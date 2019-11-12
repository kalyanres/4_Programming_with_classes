package by.epam.task422;

/*
 *  2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 *  Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {

  public static void main(String[] args) {

    Wheel[] wheels = new Wheel[4];
    for (int i = 0; i < wheels.length; i++) {
      wheels[i] = new Wheel("Nokian", 185, 65, 15);
    }

    Engine engine = new Engine(2.0, 125, 200, "Gas");
    Car car = new Car("Volvo V40", wheels[0], wheels[1], wheels[2], wheels[3],
            engine, false, 13);

    CarAction carAction = new CarAction(car);
    CarView carView = new CarView(car);
    System.out.println(car.toString());
    System.out.println();

    // поехали
    System.out.println("The car become to drive");
    carAction.driveCar(true);
    car = carAction.getCar();
    System.out.println(car.toString());
    System.out.println();

    // заправка.
    System.out.println("The car needs to be refueled 38 liters");
    carAction.fuelCar(38);
    car = carAction.getCar();
    System.out.println(car.toString());
    System.out.println();

    // замена колеса на запаску
    System.out.println("The car needs to change front left wheel");
    Wheel wheel = new Wheel("Nexen", 195, 55, 15);
    carAction.changeWheelFrontLeft(wheel);
    car = carAction.getCar();
    System.out.println(car.toString());
    System.out.println();

    // вывод в консоль марки автомобиля
    carView.setCar(car);
    carView.showBrand();

  }
}
