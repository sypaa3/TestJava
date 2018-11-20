package pl.stqa.pft.sandbox;

import org.w3c.dom.css.Rect;

public class Test {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Maciej");


    Square s = new Square(5);
    System.out.println("Pole kwadratu o boku " + s.l + " = " + s.area());
    Rectangle r = new Rectangle(4,6);
    System.out.println("Pole prostokata o bokach " + r.a + " i " + r.b  + " = " + r.area());

    Point p1 = new Point(2.0, 3.5);
    Point p2 = new Point(8.2, 2.7);

    System.out.println("Distance between P1 and P2 = " + Point.distance(p1, p2));
    System.out.println("Distance between P1 and P2 = (method using)"+ p1.distance(p2));
  }



  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");

  }


}