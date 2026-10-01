package locadora;

public class ServicoDevolucao implements IServico {

    public String executar() {
        return "Devolução efetivada";
    }

    public String cancelar() {
        return "Devolução cancelada";
    }
}