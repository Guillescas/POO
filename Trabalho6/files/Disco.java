package trabalho6;

import java.util.ArrayList;

public class Disco {
    private char nome;
    private ArrayList<Pasta> pastas;

    public Disco(char c) {
        this.nome = c;
        pastas = new ArrayList<Pasta>();
    }

    public Pasta criarPasta(String nome) {
        Pasta p = new Pasta(nome);
        pastas.add(p);
        return p;
    }

    public void remover(String nome) {
        Pasta p = encontraPasta(nome);
        if (p != null) {
            pastas.remove(p);
        } else {
            System.out.println("Pasta [" + nome + "] inexistente");

        }

    }

    public Pasta encontraPasta(String nomePasta) {
        Pasta pasta = null;
        for (Pasta p : pastas) {
            if (p.getNome().equals(nomePasta)) {
                pasta = p;
            }
        }
        return pasta;
    }

    public void listar() {
        System.out.println("- Disco [" + nome + "://] ");
        for (Pasta p : pastas) {
            p.imprimirNome();
            p.listar();
        }
    }

}
