package locadora;

public class Locacao {

    private Contrato contrato;
    private Apolice apolice;

    public Locacao (FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
        this.apolice = fabrica.createApolice();
    }

    public String emitirContrato() {
        return this.contrato.emitir() + " - " + Parametros.getInstance().getNomeLocadora();
    }

    public String emitirApolice() {
        return this.apolice.emitir() + " - " + Parametros.getInstance().getNomeLocadora();
    }

    public String executarServico(String servico) {
        return ServicoFactory.obterServico(servico).executar();
    }

    public String cancelarServico(String servico) {
        return ServicoFactory.obterServico(servico).cancelar();
    }
}