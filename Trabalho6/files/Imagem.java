package trabalho6;

public class Imagem extends Documento {
    public Imagem(String nome, int endereco, int blocos) {
        super(nome, endereco, blocos);
    }

    public void abir() {
        System.out.println("Imagems - ");
        super.abrirArquivo();
    }
}

