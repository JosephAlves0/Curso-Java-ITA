
public class Principal {
    public static void main(String[] args) {
        Corrida corridaDaAmizade = new Corrida(2000);
        corridaDaAmizade.adicionaCarro(new CarroSoma(10, 110, "Carro A"));
        corridaDaAmizade.adicionaCarro(new CarroSoma(8,110,"Carro B"));
        corridaDaAmizade.adicionaCarro(new CarroMult(100,1.7,"Carro C"));
        corridaDaAmizade.adicionaCarro(new CarroMult(110,1.4,"Carro D"));

        corridaDaAmizade.umDoisTresEJa();
    }
}

