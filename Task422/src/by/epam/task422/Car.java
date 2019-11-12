package by.epam.task422;

import java.util.Objects;

public class Car {
  private String brand;           // марка автомобиля
  private Wheel wheelFrontLeft;   // переднее левое колесо
  private Wheel wheelFrontRight;  // переднее правое колесо
  private Wheel wheelRearLeft;    // заднее левое колесо
  private Wheel wheelRearRight;   // заднее правое колесо
  private Engine engine;          // двигатель
  private boolean drive;          // false - стоит, true - едет
  private int volumeFuel;         // количество топлива

  public Car() {
  }

  public Car(String brand, Wheel wheelFrontLeft, Wheel wheelFrontRight,
             Wheel wheelRearLeft, Wheel wheelRearRight, Engine engine,
             boolean drive, int volumeFuel) {
    this.brand = brand;
    this.wheelFrontLeft = wheelFrontLeft;
    this.wheelFrontRight = wheelFrontRight;
    this.wheelRearLeft = wheelRearLeft;
    this.wheelRearRight = wheelRearRight;
    this.engine = engine;
    this.drive = drive;
    this.volumeFuel = volumeFuel;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Wheel getWheelFrontLeft() {
    return wheelFrontLeft;
  }

  public void setWheelFrontLeft(Wheel wheelFrontLeft) {
    this.wheelFrontLeft = wheelFrontLeft;
  }

  public Wheel getWheelFrontRight() {
    return wheelFrontRight;
  }

  public void setWheelFrontRight(Wheel wheelFrontRight) {
    this.wheelFrontRight = wheelFrontRight;
  }

  public Wheel getWheelRearLeft() {
    return wheelRearLeft;
  }

  public void setWheelRearLeft(Wheel wheelRearLeft) {
    this.wheelRearLeft = wheelRearLeft;
  }

  public Wheel getWheelRearRight() {
    return wheelRearRight;
  }

  public void setWheelRearRight(Wheel wheelRearRight) {
    this.wheelRearRight = wheelRearRight;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public boolean isDrive() {
    return drive;
  }

  public void setDrive(boolean drive) {
    this.drive = drive;
  }

  public int getVolumeFuel() {
    return volumeFuel;
  }

  public void setVolumeFuel(int volumeFuel) {
    this.volumeFuel = volumeFuel;
  }

  @Override
  public String toString() {
    return "Car { " +
            "brand = '" + brand + "\'\n" +
            " wheelFrontLeft = " + wheelFrontLeft +
            " wheelFrontRight = " + wheelFrontRight +
            " wheelRearLeft = " + wheelRearLeft +
            " wheelRearRight = " + wheelRearRight +
            " engine = " + engine +
            " drive = " + drive +
            " volumeFuel = " + volumeFuel +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Car)) return false;
    Car car = (Car) o;
    return isDrive() == car.isDrive() &&
            getVolumeFuel() == car.getVolumeFuel() &&
            getBrand().equals(car.getBrand()) &&
            getWheelFrontLeft().equals(car.getWheelFrontLeft()) &&
            getWheelFrontRight().equals(car.getWheelFrontRight()) &&
            getWheelRearLeft().equals(car.getWheelRearLeft()) &&
            getWheelRearRight().equals(car.getWheelRearRight()) &&
            getEngine().equals(car.getEngine());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getBrand(), getWheelFrontLeft(), getWheelFrontRight(),
            getWheelRearLeft(), getWheelRearRight(), getEngine(), isDrive(),
            getVolumeFuel());
  }
}
