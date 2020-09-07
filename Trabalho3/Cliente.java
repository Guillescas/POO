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
    Scanner handleChoice = new Scanner(System.in);
    Scanner handleInput = new Scanner(System.in);
    int option;
    boolean bExit = false;

    System.out.println("\n====DETALHES DA CONTA====\n");
    contaCorrente.imprimir();

    System.out.print("\nQual a operação desejada? \n\n");
    
    System.out.print("1- Saque\n");
    System.out.print("2- Depósito\n");
    System.out.print("3- Verificar saldo em conta\n\n");

    System.out.print("Escolha uma opção digitando o número correspondente: ");
    option = handleChoice.nextInt();

    switch (option) {
      case 1:
        double saldoAtual = contaCorrente.verificar();
        System.out.print("\nSeu saldo atual é de: R$" + saldoAtual);
        System.out.print("\nEntre com o valor do saque: ");
        double opt1 = handleInput.nextDouble();

        if (opt1 > saldoAtual) {
          System.out.print("\nSeu saldo é menor do que o valor a ser sacado.");
        } else {
          this.contaCorrente.retirar(opt1);
        }
        this.contaCorrente.imprimir();

        break;

      case 2:
        System.out.print("Entre com o valor do depósito: ");
        double opt2 = handleInput.nextDouble();
        this.contaCorrente.depositar(opt2);
        this.contaCorrente.imprimir();

        break;

      case 3:
        System.out.println("\nSeu saldo atual é: " + this.contaCorrente.verificar());

        break;
    }
  }
}