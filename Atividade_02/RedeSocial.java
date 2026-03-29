package Atividade_02;

public class RedeSocial {
    protected String usuario;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void postar(String mensagem){
         System.out.println(usuario + " postou: " + mensagem);
    }
}