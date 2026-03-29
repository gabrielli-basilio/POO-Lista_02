package Atividade_01;

public class Main {
    public static void tocarInstrumento(Instrumento instrumento){
        instrumento.tocar();
    }
    public static void main(String[] args){
        Instrumento bateria = new Bateria();
        Instrumento violao = new Violao();

        tocarInstrumento(bateria);
        tocarInstrumento(violao);
    }
}
