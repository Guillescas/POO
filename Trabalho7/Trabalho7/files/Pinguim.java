package Trabalho7;

public class Pinguim extends Ladrao {
  // Método construtor da classe Pinguim
  public Pinguim(int cor) {
    super(cor);
	}

  // Métodos da classe Pinguim
  @Override
  public void atirar() {
    System.out.println("Penguim está atirando...");
  }

  @Override
  public void correr(float x, float y) {
    this.posicaoX = x;
    this.posicaoY = y;
    System.out.println("Penguim está correndo...");
  }
}
