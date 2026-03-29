package Atividade_07;

public class PrimeiraClasse extends Passagem {
    public PrimeiraClasse(double precoBase){
        super(precoBase);
    }

    @Override
    public double calcularPrecoFinal(){
        return precoBase * 2;
    }
}