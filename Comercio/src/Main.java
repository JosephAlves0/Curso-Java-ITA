public class Main {
    public static void main(String[] args) {

        Compra c = new Compra(500);

        System.out.println("Valor Total: " + c.getValorTotal());
        System.out.println("Número de parcelas: " + c.getNumeroParcelas());
        System.out.println("Valor Parcela: " + c.getValorParcela());

        Compra c2 = new Compra(4, 250);
        System.out.println("Valor Total: " + c2.getValorTotal());
        System.out.println("Número de parcelas: " + c2.getNumeroParcelas());
        System.out.println("Valor Parcela: " + c2.getValorParcela());

    }
}
