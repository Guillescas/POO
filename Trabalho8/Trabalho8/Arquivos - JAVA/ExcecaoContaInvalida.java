package Trabalho8;

public class ExcecaoContaInvalida extends ExcecaoAutenticacao {
  private static final long serialVersionUID = 7939225935750387717L;
  
  public ExcecaoContaInvalida() {
    super();
  }
  
  public ExcecaoContaInvalida(String mensagem) {
    super(mensagem);
  }
}
