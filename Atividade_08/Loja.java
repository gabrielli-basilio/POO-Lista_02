package Atividade_08;

public class Loja {
    private MetodoPagamento metodoPagamento;

    public Loja(MetodoPagamento metodoPagamento){
        this.metodoPagamento = metodoPagamento;
    }

    public void finalizarCompra(double valor){
        metodoPagamento.processar(valor);
    }
}