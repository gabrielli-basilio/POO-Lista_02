package Atividade_10;

public class Arquivo {
    protected String nome;
    protected double tamanho;

    public Arquivo(String nome, double tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public void abrir(){
        System.out.println("Abrindo arquivo...");
    }
}