package Trabalho7;

public class Goldfinger extends Terrorista implements Personificacao {
  // Atributos da classe Goldfinger
  private Heroi heroi;


  // Método construtor da classe Goldfinger
  public Goldfinger(int cor) {
    super(cor);
  }


  // Métodos da classe Goldfinger
  @Override
  public void saltar(float z) {
    this.posicaoZ = z;
    System.out.println("Goldfinger está saltando... " + z);
  }

  @Override
  public void personificar(Heroi h) {
    setHeroi(h);
    System.out.println("Goldfinger personificando James Bond...");
  }

  @Override
  public void camuflar(int cor) {
    this.cor = cor;
    System.out.println("Goldfinger está se camuflando...");
  }

  public Heroi getHeroi() {
    return heroi;
  }

  public void setHeroi(Heroi heroi) {
    this.heroi = heroi;
  }
}