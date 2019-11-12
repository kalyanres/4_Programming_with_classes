package by.epam.task415;

public class Counter {
    private int count;
    private int minimum;
    private int maximum;

    // конструктор по умолчанию
    public Counter() {
        count = 0;
        minimum = -100;
        maximum = 100;
    }

    // конструктор инициализации произвольным значением

    public Counter(int count, int minimum, int maximum) {
        this.count = count;
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    @Override
    public String toString() {
        return "Counter { " +
                " count = " + count +
                ", minimum = " + minimum +
                ", maximum = " + maximum +
                " }";
    }
}

