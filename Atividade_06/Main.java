package Atividade_06;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        double total = 0;

        ArrayList<Conteudo> catalogo = new ArrayList<>();

        catalogo.add(new Filme("Harry Potter"));
        catalogo.add(new Serie("Percy Jackson", 8));
        catalogo.add(new Documentario("Natureza Selvagem"));

        System.out.println("--- Catálogo ---");

        for(Conteudo c : catalogo){
            System.out.println(c.titulo + " | R$ " + c.getPreco());
            total += c.getPreco();
        }
        System.out.println("Total: R$ " + total);
    }
}