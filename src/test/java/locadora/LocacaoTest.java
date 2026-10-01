package locadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocacaoTest {

    @Test
    void deveEmitirContratoDiaria() {
        Parametros.getInstance().setNomeLocadora("Locadora 1");
        FabricaAbstrata fabrica = new FabricaDiaria();
        Locacao locacao = new Locacao(fabrica);
        assertEquals("Contrato de Locação Diária - Locadora 1", locacao.emitirContrato());
    }

    @Test
    void deveEmitirContratoMensal() {
        Parametros.getInstance().setNomeLocadora("Locadora 1");
        FabricaAbstrata fabrica = new FabricaMensal();
        Locacao locacao = new Locacao(fabrica);
        assertEquals("Contrato de Locação Mensal - Locadora 1", locacao.emitirContrato());
    }

    @Test
    void deveEmitirApoliceDiaria() {
        Parametros.getInstance().setNomeLocadora("Locadora 1");
        FabricaAbstrata fabrica = new FabricaDiaria();
        Locacao locacao = new Locacao(fabrica);
        assertEquals("Apólice Diária - Locadora 1", locacao.emitirApolice());
    }

    @Test
    void deveEmitirApoliceMensal() {
        Parametros.getInstance().setNomeLocadora("Locadora 1");
        FabricaAbstrata fabrica = new FabricaMensal();
        Locacao locacao = new Locacao(fabrica);
        assertEquals("Apólice Mensal - Locadora 1", locacao.emitirApolice());
    }

    @Test
    void deveExecutarServicoPelaLocacao() {
        FabricaAbstrata fabrica = new FabricaDiaria();
        Locacao locacao = new Locacao(fabrica);
        assertEquals("Reserva efetivada", locacao.executarServico("Reserva"));
    }

    @Test
    void deveCancelarServicoPelaLocacao() {
        FabricaAbstrata fabrica = new FabricaDiaria();
        Locacao locacao = new Locacao(fabrica);
        assertEquals("Retirada cancelada", locacao.cancelarServico("Retirada"));
    }

}