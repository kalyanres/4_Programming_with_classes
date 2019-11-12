package by.epam.task417;

public class TriangleLogic {

 private Triangle triangle;

  public TriangleLogic(Triangle triangle) {
    this.triangle = triangle;
  }

  public TriangleLogic() {
  }

  public Triangle getTriangle() {
    return triangle;
  }

  public void setTriangle(Triangle triangle) {
    this.triangle = triangle;
  }

  public double calcLength(Point A, Point B) {
    return Math.sqrt((A.getX() - B.getX()) * (A.getX() - B.getX()) +
             (A.getY() - B.getY()) * (A.getY() - B.getY()));
  }
  public double calcArea() {
    double a = calcLength(triangle.getA(), triangle.getB());
    double b = calcLength(triangle.getB(), triangle.getC());
    double c = calcLength(triangle.getA(), triangle.getC());
    double p = (a + b + c) / 2.0;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }

  public double calcPerimeter() {
    double a = calcLength(triangle.getA(), triangle.getB());
    double b = calcLength(triangle.getB(), triangle.getC());
    double c = calcLength(triangle.getA(), triangle.getC());
    return a + b + c;
  }

  public Point calcPointMedian() {
    Point N = new Point((triangle.getA().getX() + triangle.getC().getX()) / 2,
            (triangle.getA().getY() + triangle.getC().getY()) / 2);
    Point L = new Point((triangle.getA().getX() + triangle.getB().getX()) / 2,
            (triangle.getA().getY() + triangle.getB().getY()) / 2);
    double a1 = (L.getY() - triangle.getC().getY()) /
            (L.getX() - triangle.getC().getX());
    double b1 = triangle.getC().getX() * (triangle.getC().getY() - L.getY()) /
            (L.getX() - triangle.getC().getX()) + triangle.getC().getY();
    double a2 = (N.getY() - triangle.getB().getY()) / (N.getX() - triangle.getB().getX());
    double b2 = triangle.getB().getX() * (triangle.getB().getY() - N.getY()) /
            (N.getX() - triangle.getB().getX()) + triangle.getB().getY();
    Point O = new Point((b2 - b1) / (a1 - a2), (b2 - b1) / (a1 - a2) * a1 + b1);
    return O;
  }
}
