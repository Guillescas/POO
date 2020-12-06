package Trabalho7;

public class Batman extends Heroi implements Camuflagem {
  // Método construtor da classe Batman
  public Batman(int cor) {
    super(cor);
  }

  
  // Métodos da classe Batman
  @Override
  public void atirar() {
    System.out.println("Batman está atirando...");
  }

  public void camuflar(int cor) {
    System.out.println("Batman está se camuflando...");
  }
}
