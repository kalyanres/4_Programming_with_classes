package by.epam.task411;

public class Test1 {
    private int x;
    private int y;

    public void show() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int sum() {
        return x + y;
    }

    public int max() {
        if (x >= y)
            return x;
        else
            return y;
    }
}
