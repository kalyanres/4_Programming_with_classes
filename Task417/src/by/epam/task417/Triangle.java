package by.epam.task417;

public class Triangle {
  private Point A;
  private Point B;
  private Point C;

  public Triangle() {
    A = new Point();
    B = new Point();
    C = new Point();
  }

  public Triangle(double Xa, double Ya,
                  double Xb, double Yb,
                  double Xc, double Yc) {
    A = new Point(Xa, Ya);
    B = new Point(Xb, Yb);
    C = new Point(Xc, Yc);
  }


  public Point getA() {
    return A;
  }

  public void setA(Point a) {
    A = a;
  }

  public Point getB() {
    return B;
  }

  public void setB(Point b) {
    B = b;
  }

  public Point getC() {
    return C;
  }

  public void setC(Point c) {
    C = c;
  }
}
