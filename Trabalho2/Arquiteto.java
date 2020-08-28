package Especialista;

import Matematica.Circulo; 

public class Arquiteto {
  // Attributes set (2)
  private static String name = "Oscar Niemeyer";
  private static int age = 104;

  // Methods set
  private static void showPersonalInfo() {
    /*
    * Exibe informações pessoais do arquiteto
    */
    System.out.println(name);
    System.out.println(age + " anos de idade");
  }
  public static void main(String[] args) {
    /* 
    * Ponto inicial do programa
    */
    showPersonalInfo();
    System.out.println("Área do círculo de raio 5: " + Circulo.area(5));
    System.out.println("Perímetro do círculo de raio 5: " + Circulo.perimeter(5));
    System.out.println("Com raio 10:");
    Circulo.setRadius(10);
    System.out.println("Área: " + Circulo.area());
    System.out.println("Perimetero: " + Circulo.perimeter());
  }
}