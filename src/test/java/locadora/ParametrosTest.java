package locadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarNomeLocadora() {
        Parametros.getInstance().setNomeLocadora("Locadora 1");
        assertEquals("Locadora 1", Parametros.getInstance().getNomeLocadora());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Parametros.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", Parametros.getInstance().getUsuarioLogado());
    }

}