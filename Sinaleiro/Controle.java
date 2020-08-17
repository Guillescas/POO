public class Controle {
  public static void main(String[] args) {
    int contador = 0;

    while (contador < 10) {
      String corAtual = Sinaleiro.MostraCor();

      System.out.println(corAtual);

      contador = contador + 1;
    }
  };
};