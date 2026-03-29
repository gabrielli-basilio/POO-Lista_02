package Atividade_05;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        double total = 0;
        int i = 1;

        Scanner leitor = new Scanner(System.in);
        ArrayList<Item> mercado = new ArrayList<>();

        System.out.print("Quantos tipos de produtos diferentes você comprou? ");
        int quant = leitor.nextInt();
        leitor.nextLine();


        do {
            Item item = new Item();
            System.out.print("\nDigite o nome do item " + i + ": ");
            item.setNome(leitor.nextLine());
            System.out.print("Digite a quantidade do item " + i + ": ");
            item.setQuantidade(leitor.nextInt());
            leitor.nextLine();
            System.out.print("Digite o preço unitário do item " + i + ": ");
            item.setPreco(leitor.nextDouble());
            leitor.nextLine();
            mercado.add(item);
            i++;

        } while(i<=quant);

        System.out.println("\n--- Carrinho de Compras ---");
        for(Item item : mercado){
            System.out.println(item); // chama toString()
            total += item.getPreco() * item.getQuantidade();
        }
        System.out.println("TOTAL GERAL: R$ " + total);
        
        leitor.close();
    }
}