package Atividade_09;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Unidade> unidades = new ArrayList<>();

        unidades.add(new Arqueiro());
        unidades.add(new Cavaleiro());
        unidades.add(new Torre());

        for(Unidade u : unidades){
            System.out.println("--- " + u.getClass().getSimpleName() + " ---");
            u.mover();
            u.atacar();
            System.out.println();
        }
    }
}