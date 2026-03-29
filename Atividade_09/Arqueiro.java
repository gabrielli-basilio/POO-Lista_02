package Atividade_09;

public class Arqueiro extends Unidade {
    @Override
    public void mover(){
        System.out.println("Move 1 casa");
    }

    @Override
    public void atacar(){
        System.out.println("Ataca a distância");
    }
}