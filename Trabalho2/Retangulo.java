package Matematica;

public class Retangulo {
  private static double sideH, sideV;

  public static void definirLados(double h, double v) {
    /*
    * Define os tamanho dos lados conforme os parâmetros obtidos
    * Param h: Lado referente à altura do retângulo
    * Param v: Lado referente à largura do retângulo
    * Return: None  
    */
    assert (h > 0 && v > 0): 
    "Erro: Medida deve ser maior do que zero";
    sideH = h;
    sideV = v; 
  }

  public static double area() {
    /*
    * Calcula a área do retângulo
    * Param: None
    * Return: Área do retângulo  
    */
    double areaValue = (sideH * sideV);
    return areaValue;
  }

  public static double perimetro() {
    /*
    * Calcula o perímetro do retângulo
    * Param: None
    * Return: Perímetro do retângulo  
    */
    double perimeterValue = (2 * (sideH + sideV));
    return perimeterValue;
  }
}