package trabalho6;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Pasta {
    private String nome;
    private ArrayList<Arquivo> arquivos;

    public Pasta(String nome) {
        this.nome = nome;
        arquivos = new ArrayList<Arquivo>();

    }

    public String getNome() {
        return this.nome;
    }

    public void inserirArquivo(Arquivo arq) {
        arquivos.add(arq);
    }

    public void removerArq(String nomeArq) {
        Arquivo arq = encontraArquivo(nomeArq);
        if (arq != null) {
            arquivos.remove(arq);
        } else {
            System.out.println("Arquivo [" + nomeArq + "] inexistente");
        }


    }

    public void duplicar(String nomeArq) {
        Arquivo arq = encontraArquivo(nomeArq);
        if (arq != null) {
            Arquivo arqDuplicado = new Arquivo(arq.getNome() + " (copia)", 0, arquivos.size());
            arquivos.add(arqDuplicado);
        } else {
            System.out.println("Arquivo [" + nomeArq + "] inexistente");
        }

    }


    private Arquivo encontraArquivo(String nomeArq) {
        Arquivo arqu = null;
        for (Arquivo a : arquivos) {
            if (a.getNome().equals(nomeArq)) {
                return a;
            } else {
                System.out.println("Arquivo [" + nomeArq + "] inexistente");
            }

        }
        return arqu;


    }

    public void listar() {
        System.out.println("Pasta [ "+nome+" ]");
        for (Arquivo a : arquivos) {
            a.imprimirnome();
        }
    }

    public Compactado compactar() {
        Compactado c = new Compactado(this.nome, 0, arquivos.size());
        for (Arquivo a : arquivos) {
            c.compactarArquivo(a);
        }
        return c;
    }

    public void abrirTodosArquivos() {
        System.out.println("- Pasta [" + nome + "] ");
        for (Arquivo a : arquivos) {
            a.abrirArquivo();
        }
    }


    public void imprimirNome() {
        System.out.println("Pasta: " + this.nome);
    }
}
