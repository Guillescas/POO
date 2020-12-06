package trabalho6;

public class Apresentacao extends Documento {
    public Apresentacao(String nome, int endereco, int blocos) {
        super(nome, endereco, blocos);
    }

    public void abrir() {
        System.out.println("Apresentação - ");
        super.abrirArquivo();
    }
}

