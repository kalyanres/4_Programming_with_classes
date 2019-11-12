package by.epam.task422;

public class CarView {
  private Car car;

  public CarView() {
  }

  public CarView(Car car) {
    this.car = car;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  // вывод марки автомобиля
  public void showBrand() {
    System.out.print("The brand of car is '");
    System.out.print(car.getBrand());
    System.out.println("'.");
  }
}
