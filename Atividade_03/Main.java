package Atividade_03;
import java.util.Scanner;

public class Main {
    public static void calcular(Operacao operacao, double a, double b){
       operacao.executar(a, b);
    }

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = leitor.nextDouble();

        Operacao soma = new Soma();
        Operacao divisao = new Divisao();
        Operacao exponenciacao = new Exponenciacao();

        calcular(soma, a, b);
        calcular(divisao, a, b);
        calcular(exponenciacao, a, b);

        leitor.close();
    }
}