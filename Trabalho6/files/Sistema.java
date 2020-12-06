package trabalho6;

public class Sistema {
    public static void main(String[] args) {
        Disco d = new Disco('c');

        Pasta escola = d.criarPasta("Escola");
        Pasta pessoal = d.criarPasta("Pessoal");

        Texto t = new Texto("Trabalho 10", 8, 4);
        escola.inserirArquivo(t);
        System.out.println();

        Apresentacao a = new Apresentacao("Defesa projeto 2", 27, 3);
        escola.inserirArquivo(a);
        System.out.println();

        Planilha p = new Planilha("Calculo 2", 40, 6);
        escola.inserirArquivo(p);
        System.out.println();

        escola.listar();

        System.out.println();
        Video v = new Video("Aniversario", 33, 5);
        pessoal.inserirArquivo(v);
        System.out.println();

        Imagem i = new Imagem("Foto RJ", 70, 2);
        pessoal.inserirArquivo(i);
        System.out.println();

        Som s = new Som("Musica chico", 57, 7);
        pessoal.inserirArquivo(s);
        System.out.println();

        pessoal.listar();

        System.out.println();
        Compactado k = pessoal.compactar();
        System.out.println();

        System.out.println("************ Disco ANTES de REMOVER [pessoal] **********");
        d.listar();
        d.remover("Pessoal");

        System.out.println();
        System.out.println("************ Disco DEPOIS de REMOVER [pessoal] **********");
        d.listar();
        System.out.println();
        k.abrir(d);
        System.out.println();
        System.out.println("************ Disco DEPOIS de DESEMCOPACTAR pasta [pessoal] **********");
        d.listar();
        System.out.println();
        System.out.println("************ Pasta [escola] abrindo todos os arquivos **********");
        escola.abrirTodosArquivos();
        System.out.println();
        System.out.println("************ Pasta [pessoal] abrindo todos os arquivos **********");
        escola.abrirTodosArquivos();
        System.out.println();
        escola.removerArq("Trabalho 10");
        System.out.println();
        escola.duplicar("Defesa projeto 2");
        System.out.println("************ Pasta [escola] depois de ********** ");
        System.out.println("    * Remover Trabalho 10 ");
        System.out.println("    * Duplicar[Defesa projeto 2]");
        System.out.println();
        escola.listar();
    }
}

