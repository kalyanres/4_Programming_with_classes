package by.epam.task415;

public class CounterLogic {
  private Counter counter;

  public CounterLogic() {
  }

  public CounterLogic(Counter counter) {
    this.counter = counter;
  }

  public Counter getCounter() {
    return counter;
  }

  public void setCounter(Counter counter) {
    this.counter = counter;
  }

  public void increase() {
    counter.setCount(counter.getCount() + 1);
  }

  public void decrease() {
    counter.setCount(counter.getCount() - 1);
  }

}
