package by.epam.task412;

public class Test2 {
    private int x;
    private int y;

    // конструктор с входными параметрами
    public Test2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // конструктор по умолчанию
    public Test2() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
