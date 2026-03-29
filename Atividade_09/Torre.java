package Atividade_09;

public class Torre extends Unidade {
    @Override
    public void mover(){
        System.out.println("Não pode mover");
    }

    @Override
    public void atacar(){
        System.out.println("Ataca com canhão");
    }
}