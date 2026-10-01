package locadora;

public class ServicoRetirada implements IServico {

    public String executar() {
        return "Retirada efetivada";
    }

    public String cancelar() {
        return "Retirada cancelada";
    }
}