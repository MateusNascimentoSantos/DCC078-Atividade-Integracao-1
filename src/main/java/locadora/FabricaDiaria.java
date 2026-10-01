package locadora;

public class FabricaDiaria implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        return new ContratoDiaria();
    }

    @Override
    public Apolice createApolice() {
        return new ApoliceDiaria();
    }
}