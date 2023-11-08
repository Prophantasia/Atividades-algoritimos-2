import java.util.ArrayDeque;
import java.util.Queue;

public class ControladorReserva {

    private Queue<Reserva> itens = new ArrayDeque<Reserva>();    
    
    
    public void adicionar (Reserva reserva) {
        this.itens.offer(reserva);
    }

    public Reserva proximo() {

        return this.itens.poll();
    }

   
    public void exibirReservas() {
        String reservas = "                      Lista do Outback \n";
        for (Reserva reserva : itens) {
            reservas += "\n"+"Nome: "+reserva.getResponsavel()+"\nLugares: "+reserva.getLugares()+"\n";

        }
        Ui ui = new Ui();
        ui.saida(reservas, ui.semIcone);
    }
    
}
