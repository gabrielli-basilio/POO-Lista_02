package Atividade_06;

public class Serie extends Conteudo {
    private int qtdEpisodios;

    public Serie(String titulo, int qtdEpisodios){
        super(titulo);
        this.qtdEpisodios = qtdEpisodios;
    }

    @Override
    public double getPreco(){
        return qtdEpisodios * 2.0;
    }
}