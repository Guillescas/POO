public class LocalVisita {
  private String pais;
  private String cidade;
  private String nomeLocal;
  private int horaInicio;
  private int horaFim;
  private String diaSemana;

  // Diz o que o local da visita precisa ter
  public LocalVisita(String pais, String cidade, String nomeLocal, int horaInicio, int horaFim, String diaSemana) {
    this.pais = pais;
    this.cidade = cidade;
    this.nomeLocal = nomeLocal;
    this.horaInicio = horaInicio;
    this.horaFim = horaFim;
    this.diaSemana = diaSemana;
  }

  // Método de impressão do local de visita
  public void imprimirLocalVisita() {
    System.out.println("\nLocal da Visita: " + this.nomeLocal);
    System.out.println(" - Hora Início:     " + this.horaInicio);
    System.out.println(" - Hora Fim:        " + this.horaFim);
    System.out.println(" - Dia da semana:   " + this.diaSemana);
    System.out.println("");
  }
};
