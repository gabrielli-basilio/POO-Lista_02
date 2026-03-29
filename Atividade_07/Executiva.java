package Atividade_07;

public class Executiva extends Passagem {
    public Executiva(double precoBase){
        super(precoBase);
    }

    @Override
    public double calcularPrecoFinal(){
        return precoBase + (precoBase * 0.50);
    }
}