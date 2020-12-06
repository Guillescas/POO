package Trabalho7;

public abstract class Terrorista extends Vilao {
  // Método construtor da classe Terrorista
  public Terrorista(int cor) {
    super(cor);
  }

  
  // Métodos da classe Terrorista
  @Override
  public void atirar() {
    System.out.println("Terrorista está atirando...");
  }

  @Override
  public void saltar(float z) {
    this.posicaoZ = z;
    System.out.println("Terrorista está saltando... " + z);
  }
}