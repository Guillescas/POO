import java.util.Scanner;

public class Cliente {
  private String nome;
  private ContaCorrente contaCorrente;

  public Cliente(String nome, int numero) {
    this.nome = nome;
    this.contaCorrente = new ContaCorrente(numero);
    this.contaCorrente.setCliente(this);
  }

  public String getNome() {
    return this.nome;
  }

  public void operar() {
    Scanner leitor = new Scanner(System.in);

    System.out.print("Entre com o valor do depósito: ");
    double valor = leitor.nextDouble();
    this.contaCorrente.depositar(valor);

    System.out.print("Entre com o valor do saque: ");
    valor = leitor.nextDouble();
    this.contaCorrente.retirar(valor);
    
    this.contaCorrente.imprimir();
  }
}