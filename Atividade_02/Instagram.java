package Atividade_02;

public class Instagram extends RedeSocial{
    @Override
    public void postar(String mensagem){
        System.out.println("[Instagram] || " + usuario + "Postou foto no feed: " + mensagem);
    }
}