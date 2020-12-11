package Trabalho8;

public class ExcecaoSaldoInsuficiente extends Exception {
  private static final long serialVersionUID = -9003438169399307220L;

  public ExcecaoSaldoInsuficiente() {
    super();
  }
  
  public ExcecaoSaldoInsuficiente(String mensagem) {
    super(mensagem);
  }
}
