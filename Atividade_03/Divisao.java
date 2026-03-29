package Atividade_03;

public class Divisao extends Operacao{
    @Override
    public double executar(double a, double b){
        if(b == 0){
            System.out.println("Erro: divisão por zero!");
            return 0;
        } else {
            System.out.println("Divisão: " + (a / b));
            return a / b;
        }
    }
}