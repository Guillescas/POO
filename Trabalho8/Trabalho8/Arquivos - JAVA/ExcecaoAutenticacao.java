package Trabalho8;

public abstract class ExcecaoAutenticacao extends ExcecaoSeguranca {
  private static final long serialVersionUID = -8969396009607402940L;

  public ExcecaoAutenticacao() {
    super();
  }
  
  public ExcecaoAutenticacao(String mensagem) {
    super(mensagem);
  }
}
