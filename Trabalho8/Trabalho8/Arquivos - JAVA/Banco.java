package Trabalho8;

import java.util.ArrayList;

public class Banco {
  // Set de atributos da classe Banco
  private String nome;
  private ArrayList<ContaCorrente> contas;


  // Método construtor da classe Banco
  public Banco (String nome) {
    this.nome = nome;
    contas = new ArrayList<ContaCorrente>();
  }

  public void addConta(ContaCorrente c) {
    contas.add(c);
  }

  public void operacoes() {
    int contador = 1;
    System.out.println("OPERAÇÕES NO BANCO " + this.nome);
    for (ContaCorrente c : contas ) {
      System.out.println("--------------------------------------------------");
      System.out.println("ANTES DA OPERAÇÃO:");
      imprimeConta(c);
      try {
        c.retirar(contador, "POO", 100, 18+contador);
        System.out.println("Saque OK");
      } catch (ExcecaoContaInvalida e) {
        System.out.println("»»»»» Erro autenticação: " + e.getMessage() + " ««««««");
      } catch (ExcecaoSenhaInvalida e) {
        System.out.println("»»»»» Erro autenticação: " + e.getMessage() + " ««««««");
      } catch (ExcecaoHorarioInvalido e) {
        System.out.println("»»»»» Erro sugurança: " + e.getMessage() + " ««««««");
      } catch (ExcecaoSaldoInsuficiente e) {
        System.out.println("»»»»» Erro autenticação: " + e.getMessage() + " ««««««");
      } finally {
        System.out.println("\nAPÓS A OPERAÇÃO:");
        imprimeConta(c);
        contador++;
      }
    }
  }

  public void imprimeConta(ContaCorrente c) {
    System.out.println(c.toString());
  }

  public static void main(String[] args) {
    Banco banco = new Banco("Itau");
    banco.addConta(new ContaCorrente(1, "POO", 500.0));
    banco.addConta(new ContaCorrente(20, "POO", 400.0));
    banco.addConta(new ContaCorrente(3, "OOP", 300));
    banco.addConta(new ContaCorrente(4, "POO", 10.0));
    banco.addConta(new ContaCorrente(5, "POO", 200.0));
    banco.operacoes();
  }
}
