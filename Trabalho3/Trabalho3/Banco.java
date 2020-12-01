package Trabalho3;

public class Banco {
  public static void main(String[] args) {
    Cliente cliente1 = new Cliente("Nome1", 11111);
    cliente1.operar();

    Cliente cliente2 = new Cliente("Nome2", 22222);
    cliente2.operar();

    Cliente cliente3 = new Cliente("Nome3", 33333);
    cliente3.operar();
  }
}
