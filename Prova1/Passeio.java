import java.util.ArrayList;
import java.text.DecimalFormat;

public class Passeio {
  private ArrayList<LocalVisita> locaisVisita;
  private ArrayList<Turista> grupoTuristas;

  // Construtor passeio
  public Passeio() {
    locaisVisita = new ArrayList<LocalVisita>();
    grupoTuristas = new ArrayList<Turista>();

    imprimirPasseio();
  }

  // Setando idadeTotal como 0 e depois, fazendo o cálculo da idade média
  double idadeTotal = 0;

  public double idadeMedia() {
    for (Turista i: grupoTuristas) {
      idadeTotal += i.getIdade();
    };

    double idadeMedia = (idadeTotal / grupoTuristas.size());

    return idadeMedia;
  }

  // Cálculo da maior idade 
  public double maiorIdade() {
    double maiorIdade = 0;
    for (Turista i: this.grupoTuristas) {
      if (i.getIdade() > maiorIdade) {
        maiorIdade = i.getIdade();
      } else {
        continue;
      }
    }
    return maiorIdade;
  }

  // Imprime todas as informações buscando as informações em cada função
  public void imprimirPasseio() {
    System.out.println("Grupo de Turistas");
    System.out.println("-----------------");
    System.out.println("Média de Idade: " + new DecimalFormat("##.##").format(this.idadeMedia()));
    System.out.println("Maior Idade:    " + this.maiorIdade());
    System.out.println("");
    for (Turista t : this.grupoTuristas) {
      t.imprimirTurista();
    }
    System.out.println("");
    System.out.println("\nLocais de Visita");
    System.out.println("------------------");
    for (LocalVisita l : this.locaisVisita) {
      l.imprimirLocalVisita();
    }
  }

  // Método main que dá o start no programa
  public static void main(String[] args) {
    // Criação do passeio 1, seus lugares e pessoas
    Passeio passeio1 = new Passeio();
    
    Turista turista1 = new Turista("Guilherme Illescas", "Brasileiro", "Português", 21);
    Turista turista2 = new Turista("Elisa Illescas", "Brasileira", "Portugês", 18);
    Turista turista3 = new Turista("Leonardo Kitzmann", "Alemão", "Alemão", 14);
    
    passeio1.grupoTuristas.add(turista1);
    passeio1.grupoTuristas.add(turista2);
    passeio1.grupoTuristas.add(turista3);
    
    LocalVisita localVisita1 = new LocalVisita("Estados Unidos", "Miami", "Beach", 14, 18, "Sábado");
    LocalVisita localVisita2 = new LocalVisita("Brasil", "Curitiba", "Jardim Botânico", 9, 15, "Domingo");
    
    passeio1.locaisVisita.add(localVisita1);
    passeio1.locaisVisita.add(localVisita2);
    
    passeio1.imprimirPasseio();

    

    // Criação do passeio 2, seus lugares e pessoas
    Passeio passeio2 = new Passeio();

    Turista turista4 = new Turista("Pessoa 4", "Português", "Português", 40);
    Turista turista5 = new Turista("Pessoa 5", "Inglês", "Portugês", 65);
    Turista turista6 = new Turista("Pessoa 6", "Alemão", "Alemão", 30);

    passeio2.grupoTuristas.add(turista4);
    passeio2.grupoTuristas.add(turista5);
    passeio2.grupoTuristas.add(turista6);

    LocalVisita localVisita3 = new LocalVisita("Estados Unidos", "Miami", "Beach", 14, 18, "Sábado");
    LocalVisita localVisita4 = new LocalVisita("Brasil", "Curitiba", "Jardim Botânico", 9, 15, "Domingo");
    
    passeio1.locaisVisita.add(localVisita3);
    passeio1.locaisVisita.add(localVisita4);

    passeio2.imprimirPasseio();
  }
};