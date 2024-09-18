import static org.junit.Assrt.*;

public class TesteRegistroPontos {

    @Test
    public void pontosCriarTopico() {
        Usuario u = new Usuario();
        u.nome = "Bento";
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 5);
    }
}