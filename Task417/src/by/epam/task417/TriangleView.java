package by.epam.task417;

public class TriangleView {
  private TriangleLogic triangleLogic;

  public TriangleView() {
  }

  public TriangleView(TriangleLogic triangleLogic) {
    this.triangleLogic = triangleLogic;
  }

  public TriangleLogic getTriangleLogic() {
    return triangleLogic;
  }

  public void setTriangleLogic(TriangleLogic triangleLogic) {
    this.triangleLogic = triangleLogic;
  }

  public void showParameters() {
    System.out.print("perimeter  ");
    System.out.printf("%.3f", triangleLogic.calcPerimeter());
    System.out.println();
    System.out.print("area ......");
    System.out.printf("%.3f", triangleLogic.calcArea());
    System.out.println();
    System.out.print("median intersection (");
    System.out.printf("%.3f", triangleLogic.calcPointMedian().getX());
    System.out.print("; ");
    System.out.printf("%.3f", triangleLogic.calcPointMedian().getY());
    System.out.println(")");
  }
}
