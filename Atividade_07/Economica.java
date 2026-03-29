package Atividade_07;

public class Economica extends Passagem {
    public Economica(double precoBase){
        super(precoBase);
    }

    @Override
    public double calcularPrecoFinal(){
        return precoBase + (precoBase * 0.10);
    }
}