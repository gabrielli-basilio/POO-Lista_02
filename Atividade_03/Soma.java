package Atividade_03;

public class Soma extends Operacao{
    @Override
    public double executar(double a, double b){
        System.out.println("Soma: " + (a + b));
        return a + b;
    }
}