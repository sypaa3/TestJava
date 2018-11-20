package pl.stqa.pft.sandbox;

public class Test {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Maciej");

    double l = 5;
    double a = 4;
    double b = 6;

    System.out.println("Pole kwadratu o boku " + l + " = " + area(l));
    System.out.println("Pole prostokata o bokach " + a + " i " + b  + " = " + area(a,b));

    Point p1 = new Point(2.0, 3.5);
    Point p2 = new Point(8.2, 2.7);

    System.out.println("Distance between P1 and P2 = " + Point.distance(p1, p2));
    System.out.println("Distance between P1 and P2 = (method using)"+ p1.distance(p2));
  }



  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");

  }

  public static double area(double len) {
    return len * len;

  }

  public static double area(double a, double b){
    return a * b;

  }
}