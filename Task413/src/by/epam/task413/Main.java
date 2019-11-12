package by.epam.task413;

/*
 * 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
 * успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого
 * типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки,
 *  равные только 9 или 10.
 *
 */
public class Main {

    public static void main(String[] args) {
        Student[] mass = new Student[10];

        mass[0] = new Student("Nelson Mandela", 3, new int[] {8, 5, 4, 9, 10});

        mass[1] = new Student("Winston Churchill", 8, new int[] { 9, 10, 9, 9, 10 });

        mass[2] = new Student("Margaret Thatcher", 1, new int[] { 10, 8, 7, 9, 10 });

        mass[3] = new Student("Marilyn Monroe", 2, new int[] { 9, 7, 8, 5, 8 });

        mass[4] = new Student("Charlie Chaplin", 7, new int[] { 9, 9, 10, 9, 9 });

        mass[5] = new Student("David Bowie", 2, new int[] { 10, 9, 10, 9, 10 });

        mass[6] = new Student("Albert Einstein", 5, new int[] { 10, 9, 10, 8, 7 });

        mass[7] = new Student("Helen Keller", 4, new int[] { 6, 8, 7, 8, 7 });

        mass[8] = new Student("Billie Jean King", 8, new int[] { 9, 9, 9, 10, 9 });

        mass[9] = new Student("Alfred Hitchcock", 7, new int[] { 7, 8, 7, 10, 9 });

        for (int i = 0; i < 10; i++) {
          StudentView studentView = new StudentView(mass[i]);
          studentView.showBestStudent();
        }
    }
}
