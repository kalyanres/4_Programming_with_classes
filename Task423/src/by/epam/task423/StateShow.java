package by.epam.task423;

public class StateShow {

  private State state;

  public StateShow() {
  }

  public StateShow(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public void showCapital() {
    System.out.print("The capital of ");
    System.out.print(state.getName());
    System.out.print(" is ");
    System.out.println(state.getCapital().getName());
  }

  public void showNumberOfRegion() {
    System.out.print("The number of region is ");
    System.out.println(state.getRegions().length);
  }

  public void showStateArea() {
    System.out.print("The area of state is ");
    System.out.println(state.getArea());
  }

  public void showCapitalsOfRegions() {
    for (Region r : state.getRegions()) {
      System.out.print("The capital of ");
      System.out.print(r.getName());
      System.out.print(" is ");
      System.out.println(r.getCapital().getName());
    }
  }
}
