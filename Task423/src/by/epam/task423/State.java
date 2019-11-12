package by.epam.task423;

import java.util.Arrays;
import java.util.Objects;

public class State {
  private String name;
  private Town capital;
  private Region[] regions;
  private int area;
  private int population;

  public State() {
  }

  public State(String name, Region[] regions, String capital) {
    this.name = name;
    this.regions = regions;

    for (int i = 0; i < this.regions.length; i++)
      if (this.regions[i].getCapital().getName().equals(capital))
        this.capital = this.regions[i].getCapital();

    // автоматическое вычисление площади
    for (Region x:regions) {
      area += x.getArea();
    }
    // автоматическое вычисление численности населения
    for (Region x:regions) {
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

  public Region[] getRegions() {
    return regions;
  }

  public void setRegions(Region[] regions) {
    this.regions = regions;
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
    if (!(o instanceof State)) return false;
    State state = (State) o;
    return Objects.equals(getName(), state.getName()) &&
            Objects.equals(getCapital(), state.getCapital()) &&
            Arrays.equals(getRegions(), state.getRegions());
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(getName(), getCapital());
    result = 31 * result + Arrays.hashCode(getRegions());
    return result;
  }

  @Override
  public String toString() {
    return "State{" +
            "name='" + name + '\'' +
            ", capital=" + capital +
            ", regions=" + Arrays.toString(regions) +
            '}';
  }
}
