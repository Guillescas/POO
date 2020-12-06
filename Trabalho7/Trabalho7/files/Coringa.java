package Trabalho7;

public class Coringa extends Ladrao {
  // Método construtor da classe Coringa
  public Coringa(int cor) {
    super(cor);
  }

  
  // Métodos da classe Coringa
  @Override
  public void atirar() {
    System.out.println("Coringa está atirando...");
  }
}
