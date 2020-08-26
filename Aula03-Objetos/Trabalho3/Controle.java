import javax.swing.*;

public class Controle {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    Pessoa p2 = new Pessoa();

    String um = JOptionPane.showInputDialog(parentComponent null, message "Nome da Pessoa 1: ");
    String dois = JOptionPane.showInputDialog(parentComponent null, message "Sobrenome da Pessoa 2: ");

    p1.setNome(um);
    p1.setSobrenome(dois);

    
  }
}