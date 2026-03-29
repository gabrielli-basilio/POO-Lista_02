package Atividade_10;
import java.util.ArrayList;
import java.util.List;

public class Pasta {
    private String nome;
    private List<Arquivo> arquivos = new ArrayList<>();

    public Pasta(String nome){
        this.nome = nome;
    }

    public void adicionarArquivo(Arquivo arquivo){
        arquivos.add(arquivo);
    }

    public void abrirTodos(){
        System.out.println("--- Pasta: " + nome + " ---");
        for(Arquivo a : arquivos){
            System.out.println("[" + a.getClass().getSimpleName() + "] " + a.tamanho + "MB");
            a.abrir();
            System.out.println();
        }
    }
}