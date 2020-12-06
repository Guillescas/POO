package trabalho6;

public class Texto extends Documento {
    public Texto(String nome, int endereco, int blocos) {
        super(nome, endereco, blocos);
    }

    public void abrir() {
        super.abrirArquivo();
    }
}

