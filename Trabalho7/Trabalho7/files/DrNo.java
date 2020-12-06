package Trabalho7;

public class DrNo extends Terrorista {
  // Método construtor da classe DrNo
  public DrNo(int cor) {
    super(cor);
  }

  
  // Métodos da classe DrNo
  @Override
  public void saltar(float z) {
    this.posicaoZ = z;
    System.out.println("DrNo está saltando... " + z);
  }

  @Override
  public void atirar() {
    System.out.println("DrNo está atirando...");
  }

  @Override
  public void correr(float x, float y) {
    this.posicaoX = x;
    this.posicaoZ = y;
    System.out.println("DrNo está correndo...");
  }
}