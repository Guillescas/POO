package Trabalho3;

public class Cliente {
  // Attributes set (2)
  private String nome;
  private ContaCorrente contaCorrente;

  // Constructor Method
  public Cliente(String nome, int numero) {
    this.nome = nome;
    contaCorrente = new ContaCorrente(numero);
    this.contaCorrente.setCliente(this);
  }

  public void operar() {
    /*
    * Método responsável por chamar métodos preexistentes
    * Param: None
    * return: None
    */
    this.contaCorrente.depositar(1245.33);
    this.contaCorrente.retirar(10.33);
    this.contaCorrente.verificar();
    this.contaCorrente.imprimir();
  }

  // GETTER name
  public String getNome() {
    /*
    * Método responsável por separar o nome do cliente 
    * Param: None
    * return: nome do cliente
    */
    return this.nome;
  }
}
