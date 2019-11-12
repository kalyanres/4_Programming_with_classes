package by.epam.task422;

public class CarAction {
  private Car car;

  public CarAction() {
  }

  public CarAction(Car car) {
    this.car = car;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  // метод "ехать"
  public void driveCar(boolean drive) {
    car.setDrive(drive);
  }

  // метод "заправляться"
  public void fuelCar(int fuel) {
    int newFuel = car.getVolumeFuel() + fuel;
    if (newFuel > 60)
      newFuel = 60;
    car.setVolumeFuel(newFuel);
  }

  // метод "менять колесо" для каждого колеса
  public void changeWheelFrontLeft(Wheel wheel) {
    car.setWheelFrontLeft(wheel);
  }
  public void changeWheelFrontRight(Wheel wheel) {
    car.setWheelFrontRight(wheel);
  }
  public void changeWheelRearLeft(Wheel wheel) {
    car.setWheelRearLeft(wheel);
  }
  public void changeWheelRearRight(Wheel wheel) {
    car.setWheelRearRight(wheel);
  }
}
