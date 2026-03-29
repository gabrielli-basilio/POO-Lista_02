package Atividade_08;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valor = leitor.nextDouble();

        System.out.println("\n--- Método de Pagamento ---");
        System.out.println("1 - Crédito");
        System.out.println("2 - Débito");
        System.out.println("3 - Criptomoeda");

        System.out.print("\nEscolha o método de pagamento: ");
        int opcao = leitor.nextInt();

        Loja loja;
        switch(opcao){
            case 1:
                loja = new Loja(new Credito());
                break;
            case 2:
                loja = new Loja(new Debito());
                break;
            case 3:
                loja = new Loja(new Criptomoeda());
                break;
            default:
                System.out.println("Opção inválida");
                return;
        
        }
    
        loja.finalizarCompra(valor);
        System.out.println("Compra finalizada!");

        leitor.close();
    }
}