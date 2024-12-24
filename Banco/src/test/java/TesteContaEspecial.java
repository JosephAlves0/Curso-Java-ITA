import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteContaEspecial extends TesteContaCorrente{

    @BeforeEach
    public void inicializaConta(){
        cc = new ContaEspecial(100);
        cc.depositar(200);
    }

    @Test
    public void saqueMaiorQueSaldo(){
        int valorSacado = cc.sacar(350);
        assertEquals(200, cc.saldo);
        assertEquals(0, valorSacado);
    }

    @Test
    public void saqueMaiorQueSaldoDentroDoLimite(){
        int valorSacado = cc.sacar(250);
        assertEquals(-50, cc.saldo);
        assertEquals(250, valorSacado);
    }
}
