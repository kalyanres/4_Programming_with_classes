package by.epam.task422;

import java.util.Objects;

public class Engine {

  private double volume;     // объем двигателя
  private int power;      // мощность
  private int torque;     // крутящий момент
  private String fuel;    // тип топлива

  public Engine() {
  }

  public Engine(double volume, int power, int torque, String fuel) {
    this.volume = volume;
    this.power = power;
    this.torque = torque;
    this.fuel = fuel;
  }

  public double getVolume() {
    return volume;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }

  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public int getTorque() {
    return torque;
  }

  public void setTorque(int torque) {
    this.torque = torque;
  }

  public String getFuel() {
    return fuel;
  }

  public void setFuel(String fuel) {
    this.fuel = fuel;
  }

  @Override
  public String toString() {
    return "Engine{" +
            "volume=" + volume +
            ", power=" + power +
            ", torque=" + torque +
            ", fuel='" + fuel + '\'' +
            "}\n";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Engine)) return false;
    Engine engine = (Engine) o;
    return getVolume() == engine.getVolume() &&
            getPower() == engine.getPower() &&
            getTorque() == engine.getTorque() &&
            Objects.equals(getFuel(), engine.getFuel());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getVolume(), getPower(), getTorque(), getFuel());
  }
}
