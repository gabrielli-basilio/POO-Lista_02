package Atividade_10;

public class Imagem extends Arquivo {
    public Imagem(String nome, double tamanho){
        super(nome, tamanho);
    }

    @Override
    public void abrir(){
        System.out.println("Mostrando foto: " + nome);
    }
}