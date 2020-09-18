public class Turista {
  private String nome;
  private String nacionalidade;
  private String idioma;
  private int idade;

  // Método que diz o que o Turista irá precisar ter
  public Turista(String nome, String nacionalidade, String idioma, int idade) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idioma = idioma;
    this.idade = idade;
  }

  // Retorna a idade
  public int getIdade() {
    return this.idade;
  }

  // Mpetodo de impressão
  public void imprimirTurista() {
    System.out.println("\nNome do Turista:  " + this.nome);
    System.out.println(" - Nacionalidade: " + this.nacionalidade);
    System.out.println(" - Idioma:        " + this.idioma);
    System.out.println(" - Idade:         " + this.idade);
  }
}
