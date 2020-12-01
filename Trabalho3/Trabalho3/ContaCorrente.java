package Trabalho3;

public class ContaCorrente {
  // Attributes set (3)
  private int numero;
  private double saldo;
  private Cliente cliente;

  // Constructor Method
  public ContaCorrente(int numero) {
    this.numero = numero;
  }

  public void depositar(double valor) {
    /*
    * Método responsável por simular um deposito em uma conta corrente
    * Param valor: valor monetário a ser depositado
    * return: None
    */
    assert (valor < 0): 
      "Erro! Valor do depósito deve ser positivo.";
    this.saldo += valor;
  }

  public void retirar(double valor) {
    /*
    * Método responsável por simular um retirado em uma conta corrente
    * Param valor: valor monetário a ser retirado
    * return: None
    */
    assert ((saldo - valor) < 0): 
      "Erro! Valor do saldo deve ser positivo.";
    this.saldo -= valor;
  }

  public double verificar() {
    /*
    * Método responsável por verificar o saldo da conta
    * Param: none
    * return: saldo da conta
    */
    return this.saldo;
  }

  public void imprimir() {
    /*
    * Método responsável por imprimir os dados da conta corrente do cliente
    * Param: none
    * return: none
    */
    System.out.println("\n=========================");
    System.out.println("------- IMPRESSÃO -------");
    System.out.println("=========================");
    System.out.println("Número da conta: " + this.numero);
    System.out.println("Saldo da conta: " + verificar());
    System.out.println("Cliente: " + this.cliente.getNome());
    System.out.println("=========================");
  }

  // SETTER methods
  public void setCliente(Cliente cliente) {
    /*
    * Método responsável por associar a conta corrente a um cliente em especial
    * Param cliente: cliente a ser associado a conta corrente
    * return: None
    */
    this.cliente = cliente;
  }
}