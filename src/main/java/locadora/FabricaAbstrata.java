package locadora;

public interface FabricaAbstrata {
    Contrato createContrato();
    Apolice createApolice();
}