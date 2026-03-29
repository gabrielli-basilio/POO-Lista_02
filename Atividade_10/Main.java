package Atividade_10;

public class Main {
    public static void main(String[] args){
        Pasta pasta = new Pasta("ARQUIVOS");

        pasta.adicionarArquivo(new Imagem("foto.png", 2.5));
        pasta.adicionarArquivo(new Texto("documento.txt", 0.1));
        pasta.adicionarArquivo(new Video("filme.mp4", 700.0));

        pasta.abrirTodos();
    }
}