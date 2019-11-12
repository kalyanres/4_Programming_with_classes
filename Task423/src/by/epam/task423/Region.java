package by.epam.task423;

import java.util.Arrays;
import java.util.Objects;

public class Region {
  private String name;
  private Town capital;
  private District[] districts;
  private int area;
  private int population;

  public Region() {
  }

  public Region(String name, District[] districts, String capital) {
    this.name = name;
    this.districts = districts;

    // автоматическое определение столицы
    for (District d : this.districts) {
      if (d.getCapital().getName().equals(capital))
        this.capital = d.getCapital();
    }
    // автоматическое вычисление площади
    for (District x : districts) {
      area += x.getArea();
    }
    // автоматическое вычисление численности населения
    for (District x : districts) {
      population += x.getPopulation();
    }
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

  public District[] getDistricts() {
    return districts;
  }

  public void setDistricts(District[] districts) {
    this.districts = districts;
  }

  public int getArea() {
    return area;
  }

  public int getPopulation() {
    return population;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Region)) return false;
    Region region = (Region) o;
    return Objects.equals(getName(), region.getName()) &&
            Objects.equals(getCapital(), region.getCapital()) &&
            Arrays.equals(getDistricts(), region.getDistricts());
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(getName(), getCapital());
    result = 31 * result + Arrays.hashCode(getDistricts());
    return result;
  }

  @Override
  public String toString() {
    return "Region{" +
            "name='" + name + '\'' +
            ", capital=" + capital +
            ", districts=" + Arrays.toString(districts) +
            '}';
  }
}
