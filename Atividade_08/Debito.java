package Atividade_08;

public class Debito extends MetodoPagamento {
    @Override
    public void processar(double valor){
        System.out.println("Cobrando R$ " + valor + " no débito... - Sem taxa");
    }
}