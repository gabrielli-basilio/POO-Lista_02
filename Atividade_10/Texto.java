package Atividade_10;

public class Texto extends Arquivo {
    public Texto(String nome, double tamanho){
        super(nome, tamanho);
    }

    @Override
    public void abrir(){
        System.out.println("Lendo texto: " + nome);
    }
}