package Atividade_10;

public class Video extends Arquivo {
    public Video(String nome, double tamanho){
        super(nome, tamanho);
    }

    @Override
    public void abrir(){
        System.out.println("Dando play: " + nome);
    }
}