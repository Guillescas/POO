package Trabalho7;

public abstract class Vilao extends Personagem {
  // Método construtor da classe Vilao
  public Vilao(int cor) {
    super(cor);
	}

  
  // Métodos da classe Vilao
  public void correr(float x, float y) {
    this.posicaoX = x;
    this.posicaoY = y;
    System.out.println("Vilao está correndo...");
  }
}
