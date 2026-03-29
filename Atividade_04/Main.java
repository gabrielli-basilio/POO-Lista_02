package Atividade_04;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        ArrayList<Contribuinte> contribuintes = new ArrayList<>();

        // Pessoa Física
        PessoaFisica pf1 = new PessoaFisica();
        System.out.print("Digite a renda da Pessoa Física 1: ");
        pf1.setRendaBruta(leitor.nextDouble());
        contribuintes.add(pf1);

        // Pessoa Jurídica
        PessoaJuridica pj1 = new PessoaJuridica();
        System.out.print("Digite a renda da Pessoa Jurídica 1: ");
        pj1.setRendaBruta(leitor.nextDouble());
        contribuintes.add(pj1);

        double totalImposto = 0;
        for(Contribuinte c : contribuintes){
            totalImposto += c.calcularImposto();
        }

        System.out.println("\nTotal de imposto arrecadado: R$ " + totalImposto);

        leitor.close();
    }
}