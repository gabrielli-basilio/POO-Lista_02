package Atividade_05;

public class Item {
    protected String nome;
    protected double preco;
    protected int quantidade;


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString(){
        return "Item: " + nome + " | Qtd: " + quantidade + " | R$ " + preco + " | Total: R$ " + (preco * quantidade);
    }
}