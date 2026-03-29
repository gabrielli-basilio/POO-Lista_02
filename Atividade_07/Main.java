package Atividade_07;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        ArrayList<Passagem> passagens = new ArrayList<>();

        System.out.print("Digite o preço base da Econômica: ");
        passagens.add(new Economica(leitor.nextDouble()));

        System.out.print("Digite o preço base da Executiva: ");
        passagens.add(new Executiva(leitor.nextDouble()));

        System.out.print("Digite o preço base da Primeira Classe: ");
        passagens.add(new PrimeiraClasse(leitor.nextDouble()));

        System.out.println("\n--- Passagens ---");
        for(Passagem p : passagens){
            System.out.println(p.getClass().getSimpleName() + " | Preço final: R$ " + p.calcularPrecoFinal());
        }

        leitor.close();
    }
}