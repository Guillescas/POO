package Sinaleiro;

public class Controle {
  public static void printColor(int cor) {
    switch (cor) {
      case 0:
        System.out.println("Cor: Verde");
        break;
      case 1:
        System.out.println("Cor: Amarelo");
        break;
      default:
        System.out.println("Cor: Vermelho");
      }
  }
  public static void main(String[] args) {
    System.out.println("");
    printColor(Sinaleiro.MostraCor());
    System.out.println("");

    int counter = 0;
    while (counter < 10) {
      Sinaleiro.MudaProximaCor();
      printColor(Sinaleiro.MostraCor());
      counter += 1;
      System.out.println("A função já rodou " + counter + " vezes");
    }

    Sinaleiro.MudaCorFixa(1); 

    System.out.println("");
    printColor(Sinaleiro.MostraCor());
    System.out.println("");
  }
}