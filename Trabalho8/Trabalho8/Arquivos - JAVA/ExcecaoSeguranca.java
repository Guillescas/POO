package Trabalho8;

public abstract class ExcecaoSeguranca extends Exception {
  private static final long serialVersionUID = -4474442448223009771L;
  
  public ExcecaoSeguranca() {
    super();
  }
  
  public ExcecaoSeguranca(String mensagem) {
    super(mensagem);
  }
}
