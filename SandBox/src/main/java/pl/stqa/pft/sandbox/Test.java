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