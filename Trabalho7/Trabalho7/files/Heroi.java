package Trabalho7;

public abstract class Heroi extends Personagem {
  // Método construtor da classe Heroi
  public Heroi(int cor) {
    super(cor);
  }

  
  // Métodos da classe Heroi
  @Override
  public void correr(float x, float y) {
    this.posicaoX = x;
    this.posicaoY = y;
    System.out.println("Herói está correndo...");
  }

  @Override
  public void saltar(float z) {
    this.posicaoZ = z;
    System.out.println("Herói está saltando...");
  }
}
