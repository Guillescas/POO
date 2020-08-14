package P1;

public class Calculadora {
  static int contadorAdicao = 0;
  static int contadorSubtracao = 0;

  public static int soma (int a, int b) {
    contadorAdicao ++;
    return a + b;
  }

  public static int subtracao (int a, int b) {
    contadorSubtracao ++;
    return a - b;
  }

  public int getcontadorAdicao() {
    return contadorAdicao;
  }
}