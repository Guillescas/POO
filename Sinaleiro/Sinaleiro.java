package Sinaleiro;

public class Sinaleiro {
  public static int cor = 2; 

  public static void MudaProximaCor() {
    switch (cor) {
      case 0:
        cor +=1;
        break;
      case 1:
        cor +=1;
        break;
      default:
        cor = 0;
      }
  }

  public static void MudaCorFixa(int fixaCor) {
    cor = fixaCor;
  }

  public static int MostraCor() {
    System.out.println("\nA cor atual do semáforo é: " + cor);
    return cor;
  }
}
