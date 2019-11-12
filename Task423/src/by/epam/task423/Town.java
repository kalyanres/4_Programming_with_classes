package by.epam.task423;

import java.util.Objects;

public class Town {
  private String name;
  private int population;

  public Town() {
  }

  public Town(String name, int population) {
    this.name = name;
    this.population = population;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Town)) return false;
    Town town = (Town) o;
    return getPopulation() == town.getPopulation() &&
            Objects.equals(getName(), town.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getPopulation());
  }

  @Override
  public String toString() {
    return "Town{" +
            "name='" + name + '\'' +
            ", population=" + population +
            '}';
  }
}
