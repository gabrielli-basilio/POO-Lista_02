package Atividade_02;
import java.util.Scanner;

public class Main {
    public static void fazerPostagem(RedeSocial rede, String mensagem){
        rede.postar(mensagem);
    }

    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);

        RedeSocial instagram = new Instagram();
        System.out.print("Digite seu usuário do Instagram: ");
        instagram.setUsuario(leitor.nextLine());

        System.out.print("Digite a mensagem para o post do Instagram: ");
        String mensagemInstagram = leitor.nextLine();

        RedeSocial twitter = new Twitter();
        System.out.print("\nDigite seu usuário do Twitter: ");
        twitter.setUsuario(leitor.nextLine());

        System.out.print("Digite o que deseja Twittar: ");
        String mensagemTwitter = leitor.nextLine();

        System.out.println();

        fazerPostagem(instagram, mensagemInstagram);
        fazerPostagem(twitter, mensagemTwitter);

        leitor.close();
    }
}
