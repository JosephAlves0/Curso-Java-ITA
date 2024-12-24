import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteCarroSoma {

    CarroDeCorrida c;
    @BeforeEach
    public void inicializaCarro(){
        c = new CarroSoma(10, 100, "teste");
    }

    @Test
    public void testCarroParado(){
        assertEquals(0, c.getVelocidade());
    }

    @Test
    public void testAcelerar(){
        c.acelerar();
        assertEquals(10, c.getVelocidade());
    }

    @Test
    public void testFrear(){
        c.acelerar();
        c.frear();
        assertEquals(5, c.getVelocidade());
    }

    @Test
    public void testFrearAteZero(){
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        assertEquals(0, c.getVelocidade());
    }

    @Test
    public void testAcelerrAteVelocidadeMaxima() {
        for(int i = 0; i < 14; i++ ) {
            c.acelerar();
        }
        assertEquals(100, c.getVelocidade());
    }
}
