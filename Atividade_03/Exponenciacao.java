package Atividade_03;

public class Exponenciacao extends Operacao {
    @Override
    public double executar(double a, double b){
        System.out.println("Exponenciação: " + Math.pow(a, b));
        return Math.pow(a, b);
    }
}