import java.util.ArrayList;

public class ColecaoSelos {
  public static void main(String[] args) {
    ArrayList<Selo> colecao = new ArrayList<Selo>();

    Selo meuSelo = new Selo("Finados", 2010, 0.75);

    colecao.add(meuSelo);

    colecao.add(new Selo("Independencia", 1990, 0.25));
    colecao.add(new Selo("Natal", 1965, 1.25));

    for (Selo s: colecao) {
      s.imprimeSelo();
    }

    meuSelo = colecao.get(1);
    meuSelo.imprimeSelo();
    System.out.println("Elementos da coleção: " + colecao.size());
  }
}