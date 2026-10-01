package locadora;

public class ServicoReserva implements IServico {

    public String executar() {
        return "Reserva efetivada";
    }

    public String cancelar() {
        return "Reserva cancelada";
    }
}