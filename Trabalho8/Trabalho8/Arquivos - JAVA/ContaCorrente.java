package Trabalho8;

public class ContaCorrente {
  // Set de atributos da classe ContaCorrente
  private int numero;
  private String senha;
  private double saldo;

  
  // Método construtor da classe ContaCorrente
  public ContaCorrente(int numero, String senha, double saldo) {
    this.numero = numero;
    this.senha = senha;
    this.saldo = saldo;
  }


  @Override
  public String toString() {
    return "ContaCorrente [numero=" + numero + ", senha=" + senha + ", saldo=" + saldo + "]";
  }


  // Métodos da classe conta corrente
  public void retirar(int numero, String senha, double valor, int horas)
    throws ExcecaoContaInvalida, 
    ExcecaoSenhaInvalida, ExcecaoSaldoInsuficiente, ExcecaoHorarioInvalido {

    if (numero != this.numero) {
      throw new ExcecaoContaInvalida("Conta inválida");
    }
    if (!this.senha.equals(senha)) {
      throw new ExcecaoSenhaInvalida("Senha inválida");
    }
    if (valor > saldo) {
      throw new ExcecaoSaldoInsuficiente("Saldo insuficiente");
    }
    if (horas <= 8 || horas >= 22) {
      throw new ExcecaoHorarioInvalido("Horário inválido");
    }

    this.saldo -= valor;
  }
}
