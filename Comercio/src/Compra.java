public class Compra {

    int valorTotal;
    int numeroParcelas;

    //a vista
    public Compra(int valor){
        valorTotal = valor;
        numeroParcelas = 1;
    }

    //parcelado
    public Compra(int qtdParcela, int valorParcela) {
        numeroParcelas = qtdParcela;
        valorTotal = valorParcela * numeroParcelas;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public int getValorParcela() {
        return  valorTotal / numeroParcelas;
    }
}
