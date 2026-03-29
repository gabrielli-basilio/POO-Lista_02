package Atividade_09;

public class Cavaleiro extends Unidade {

    @Override
    public void mover(){
        System.out.println("Move 3 casas");
    }

    @Override
    public void atacar(){
        System.out.println("Ataca corpo a corpo");
    }
}