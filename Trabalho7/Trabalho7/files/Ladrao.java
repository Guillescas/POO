package Trabalho7;

public abstract class Ladrao extends Vilao {
  // Método construtor da classe Ladrao
  public Ladrao(int cor) {
    super(cor);
  }

  
  // Métodos da classe Ladrao
  @Override
  public void saltar(float z) {
    this.posicaoZ = z;
    System.out.println("Ladrao está saltando... " + z);
  }

  @Override
  public void atirar() {
    System.out.println("Ladrão está atirando...");
  }
}
