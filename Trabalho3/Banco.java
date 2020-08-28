public class Banco {
  public static void main(String[] args) {
    Cliente guilherme = new Cliente('Guilherme', 11987);
    Cliente elisa = new Cliente('Elisa', 11456);

    guilherme.operar();
    elisa.operar();
  }
}