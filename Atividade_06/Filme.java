package Atividade_06;

public class Filme extends Conteudo {
    public Filme(String titulo){
        super(titulo);
    }

    @Override
    public double getPreco(){
        return 10.0;
    }
}