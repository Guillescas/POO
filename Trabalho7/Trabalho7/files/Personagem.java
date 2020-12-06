package Trabalho7;

public abstract class Personagem {
  // set de Atributos da classe Personagem
  private boolean vivo;
  protected float posicaoX;
  protected float posicaoY;
  protected float posicaoZ;
  protected int cor;


  // Método construtor da classe Personagem
  public Personagem(int cor) {
    this.cor = cor;
  }

  
  // Métodos abstratos da classe Personagem
  abstract public void correr(float x, float y);

  abstract public void saltar(float z);

  abstract public void atirar();


  // Métodos concretos da classe Personagem
  public void morrer() {
    setVivo(false);
    System.out.println("Morto :(");
  }


  // Métodos especais (Getter && Setter)
  public boolean isVivo() {
    return vivo;
  }

  public void setVivo(boolean vivo) {
    this.vivo = vivo;
  }
}
