package by.epam.task422;

import java.util.Objects;

public class Wheel {
  private String brand;         // марка
  private int width;            // ширина
  private int proportionality;  // отношение ширины к высоте профиля
  private int diameter;

  public Wheel() {
  }

  public Wheel(String brand, int width, int proportionality, int diameter) {
    this.brand = brand;
    this.width = width;
    this.proportionality = proportionality;
    this.diameter = diameter;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getProportionality() {
    return proportionality;
  }

  public void setProportionality(int proportionality) {
    this.proportionality = proportionality;
  }

  public int getDiameter() {
    return diameter;
  }

  public void setDiameter(int diameter) {
    this.diameter = diameter;
  }

  @Override
  public String toString() {
    return "{'" +
              brand +
            "' "    + width +
            "/" + proportionality +
            " R" + diameter +
            "}\n";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Wheel wheel = (Wheel) o;
    return width == wheel.width &&
            proportionality == wheel.proportionality &&
            diameter == wheel.diameter;
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, proportionality, diameter);
  }
}
