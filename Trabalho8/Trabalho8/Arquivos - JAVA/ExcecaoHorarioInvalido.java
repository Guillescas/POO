package Trabalho8;

public class ExcecaoHorarioInvalido extends ExcecaoAutenticacao {
  private static final long serialVersionUID = 6414657286161274244L;
  
  public ExcecaoHorarioInvalido() {
    super();
  }
  
  public ExcecaoHorarioInvalido(String mensagem) {
    super(mensagem);
  }
}
