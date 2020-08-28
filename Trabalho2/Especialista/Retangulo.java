package Especialista;

public class Retangulo {
  private static float ladoH, ladoV;

  public void definir_lados(float a, float b) {
    if (a || b < 0) {
      System.out.println("O número inserido não é valido. Por favor, coloque um número maior do que 0");
    } else {
      ladoH = a;
      ladoV = b;
    }
  }

  public float area() {
    float area = ladoH * ladoV;
  }

  public float perimetro() {
    float perimetro = ((ladoH * 2) + (ladoV * 2));
  }
}
