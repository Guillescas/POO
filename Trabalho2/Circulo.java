package Matematica;

public class Circulo {
  // Attributes set
  private static double PI = 3.1415;
  private static double radius;

  // Methods set
  public static double area(double r) {
    return PI * r * r;
  }

  public static double perimeter(double r) {
    return 2 * PI * r;
  }

  public static void setRadius(double r) {
    radius = r;
  }

  public static double area() {
    return PI * radius * radius;
  }

  public static double perimeter() {
    return 2 * PI * radius;
  }
}