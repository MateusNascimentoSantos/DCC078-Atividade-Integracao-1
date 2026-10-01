package locadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoRetiradaTest {

    @Test
    void deveExecutarRetirada() {
        IServico servico = ServicoFactory.obterServico("Retirada");
        assertEquals("Retirada efetivada", servico.executar());
    }

    @Test
    void deveCancelarRetirada() {
        IServico servico = ServicoFactory.obterServico("Retirada");
        assertEquals("Retirada cancelada", servico.cancelar());
    }

}