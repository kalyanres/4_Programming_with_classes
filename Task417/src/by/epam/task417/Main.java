package by.epam.task417;

/*
 * 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */
public class Main {

  public static void main(String[] args) {
    // создаем треугольник по координатам трех точек
    Triangle tr1 = new Triangle(2.0, 2.0, 6.0, 7.0, 12.0, 2.0);
    Triangle tr2 = new Triangle(2.0, 8.0, 5.0, 2.0, 13.0, 9.0);

    TriangleLogic triangleLogic1 = new TriangleLogic(tr1);
    TriangleLogic triangleLogic2 = new TriangleLogic(tr2);
    TriangleView triangleView1 = new TriangleView(triangleLogic1);
    TriangleView triangleView2 = new TriangleView(triangleLogic2);

    System.out.println("Triangle 1: ");
    triangleView1.showParameters();
    System.out.println();
    System.out.println("Triangle 2: ");
    triangleView2.showParameters();
    System.out.println();
  }
}

