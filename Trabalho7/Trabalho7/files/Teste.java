package Trabalho7;

public class Teste {
  public static void main(String[] args) {
    Batman batman = new Batman(1);
    Coringa coringa = new Coringa(2);
    Pinguim pinguim = new Pinguim(2);

    JamesBond james = new JamesBond(1);
    DrNo dr = new DrNo(2);
    Goldfinger goldfinger = new Goldfinger(2);

    System.out.println("---------------------------------------");
    batman.atirar();
    batman.correr(20, 30);
    batman.camuflar(2);
    batman.saltar(20);

    System.out.println("---------------------------------------");
    coringa.correr(20, 30);
    coringa.atirar();
    coringa.saltar(5);

    System.out.println("---------------------------------------");
    pinguim.correr(20, 30);
    pinguim.atirar();
    pinguim.saltar(4);

    System.out.println("---------------------------------------");
    james.atirar();
    james.correr(20, 30);
    james.saltar(5);

    System.out.println("---------------------------------------");
    dr.correr(20, 30);
    dr.atirar();
    dr.saltar(3);

    System.out.println("---------------------------------------");
    goldfinger.personificar(james);
    goldfinger.camuflar(1);
    goldfinger.correr(20, 30);
    goldfinger.atirar();
    goldfinger.saltar(2);
  }
}