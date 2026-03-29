package Atividade_02;

public class Twitter extends RedeSocial{
    @Override
    public void postar(String mensagem){
        if(mensagem.length() <= 280){
            System.out.println("[Twitter] || @" + usuario + " Tweetou: " + mensagem);
        } else{
            System.out.println("[Twitter] || Texto muito longo");
        }
    }
}