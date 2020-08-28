public class ContaCorrente {
  private int numero;
  private double saldo;
  private Cliente cliente;

  public CntaCorrente(int numero) {
    this.numero = numero;
    this.saldo = 0;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public void depositar(double valor) {

  }

  public void retirar(double valor) {
    
  }

  public void verificar() {
    
  }

  public void imprimir() {
    System.out.println("Cliente:        " + this.cliente.getNome());
    System.out.println("Nº da conta:    " + this.numero);
    System.out.println("Saldo da conta: " + this.saldo);
  }
}