package Especialista;

import Matematica.*;

public class EngenheiroCivil {
  // Attributes set
  private static String name = "Oscar Niemeyer";
  private static int age = 104;

  // Methods set
  private static void showPersonalInfo() {
    /*
    * Exibe informações dados do engenheiro civil
    * Param: None
    * Return: Área do retângulo  
    */
    System.out.println(name);
    System.out.println(age + " anos de idade.");
  }
  public static void main(String[] args) {
    showPersonalInfo();
    Retangulo.definirLados(4.7, 8.2);
    System.out.println("Área do retângulo: " + Retangulo.area());
    System.out.println("Perímetro do retângulo: " + Retangulo.perimetro());
  }
}