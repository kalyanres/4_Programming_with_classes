package by.epam.task412;

/*
*
*2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
* Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get-
* методы для полей экземпляра класса.
*
 */
public class Main {

    public static void main(String[] args) {
        Test2 one = new Test2();
        Test2 two = new Test2();
        System.out.println("object one: " + one.getX() + " " + one.getY());
        System.out.println("object two: " + two.getX() + " " + two.getY());

        one.setX(4);
        one.setY(9);
        two.setX(7);
        two.setY(48);

        System.out.println("After setter:");
        System.out.println("object one: " + one.getX() + " " + one.getY());
        System.out.println("object two: " + two.getX() + " " + two.getY());
    }
}
