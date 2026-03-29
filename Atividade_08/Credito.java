package Atividade_08;

public class Credito extends MetodoPagamento {
    @Override
    public void processar(double valor){
        System.out.println("Cobrando R$ " + valor + " no cartão... - Taxa de 5%: R$ " + (valor * 1.05));
    }
}