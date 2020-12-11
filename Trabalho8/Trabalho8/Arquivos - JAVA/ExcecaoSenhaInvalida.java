package Trabalho8;

public class ExcecaoSenhaInvalida extends ExcecaoAutenticacao {
  private static final long serialVersionUID = 1278980242508916203L;
  
  public ExcecaoSenhaInvalida() {
    super();
  }
  
  public ExcecaoSenhaInvalida(String mensagem) {
    super(mensagem);
  }
}
