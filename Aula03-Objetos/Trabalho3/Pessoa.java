import javax.string.*;
import javax.swing.JOptionPane;

public class Pessoa {
  private String nome;
  private String sobrenome;

  public void setNome(String novoNome) {
    this.nome = novoNome;
  }

  public void setSobrenome(String novoSobrenome) {
    this.sobrenome = novoSobrenome;
  }

  public String getNome() {
    return this.nome
  }

  public String getSobrenome() {
    return this.sobrenome
  }

  public void imprimePessoa() {
    JOptionPane.showMessageDialog(parentComponent null, message "Pessoa " + this.getNome() + " " + this.getSobrenome());
  }
}