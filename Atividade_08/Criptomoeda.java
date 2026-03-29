package Atividade_08;

public class Criptomoeda extends MetodoPagamento {
    @Override
    public void processar(double valor){
        System.out.println("Convertendo R$ " + valor + " para Bitcoin...");
    }
}