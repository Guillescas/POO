package Trabalho7;

public class JamesBond extends Heroi {
  // Método construtor da classe JamesBond
  public JamesBond(int cor) {
    super(cor);
	}


  // Métodos da classe JamesBond
  @Override
  public void saltar(float z) {
    this.posicaoZ = z;
    System.out.println("James Bond está saltando... " + z);
  }

  @Override
  public void atirar() {
    System.out.println("James Bond está atirando...");
  }
}
