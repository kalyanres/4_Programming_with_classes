package by.epam.task423;

import java.util.Arrays;
import java.util.Objects;

public class District {
  private String name;
  private Town capital;
  private Town[] towns;
  private int area;
  private int population;

  public District() {
  }

  public District(String name, Town[] towns, String capital, int area, int population) {
    this.name = name;
    this.towns = towns;
    for (Town t: this.towns) {
      if (t.getName().equals(capital))
        this.capital = t;
    }
    this.area = area;
    this.population = population;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Town getCapital() {
    return capital;
  }

  public void setCapital(Town capital) {
    this.capital = capital;
  }

  public Town[] getTowns() {
    return towns;
  }

  public void setTowns(Town[] towns) {
    this.towns = towns;
  }

  public int getArea() {
    return area;
  }

  public void setArea(int area) {
    this.area = area;
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
    if (!(o instanceof District)) return false;
    District district = (District) o;
    return getArea() == district.getArea() &&
            getPopulation() == district.getPopulation() &&
            Objects.equals(getName(), district.getName()) &&
            Objects.equals(getCapital(), district.getCapital()) &&
            Arrays.equals(getTowns(), district.getTowns());
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(getName(), getCapital(), getArea(), getPopulation());
    result = 31 * result + Arrays.hashCode(getTowns());
    return result;
  }

  @Override
  public String toString() {
    return "District{" +
            "name='" + name + '\'' +
            ", capital=" + capital +
            ", towns=" + Arrays.toString(towns) +
            ", area=" + area +
            ", population=" + population +
            '}';
  }
}
