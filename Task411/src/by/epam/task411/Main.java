package by.epam.task411;

public class Main {
    public static void main(String[] args) {
        Test1 one = new Test1();
        Test1 two = new Test1();

        one.setX(5);
        one.setY(8);
        one.show();
        two.setX(10);
        two.setY(1);
        two.show();
        System.out.println(one.max());
        System.out.println(two.max());
        System.out.println(one.sum());
        System.out.println(two.sum());
    }
}
