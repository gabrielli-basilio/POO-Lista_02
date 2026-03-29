package Atividade_06;

public class Documentario extends Conteudo {
    public Documentario(String titulo){
        super(titulo);
    }

    @Override
    public double getPreco(){
        return 5.0;
    }
}