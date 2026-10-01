package locadora;

public class FabricaMensal implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        return new ContratoMensal();
    }

    @Override
    public Apolice createApolice() {
        return new ApoliceMensal();
    }
}