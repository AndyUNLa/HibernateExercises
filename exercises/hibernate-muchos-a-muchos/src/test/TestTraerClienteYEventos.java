package test;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import datos.Cliente;
import datos.Evento;
import negocio.ClienteABM;
import negocio.EventoABM;
/*
 * Test que trae todos los eventos de un cliente
 */
public class TestTraerClienteYEventos {
    public static void main(String[] args) {
        ClienteABM clienteABM = new ClienteABM();
        EventoABM eventoABM = new EventoABM();
        int dni = 14000000;
        Cliente c = clienteABM.traer(dni);
        System.out.println("\n---> Traer eventos del Cliente=" + c + "\n\n");
        try {
            int cont = 1;
            List<Evento> list = eventoABM.traerEventos(c);
            Set<Evento> eventos = new HashSet<Evento>(list);
            eventos.addAll(list);
            for (Evento evt : eventos) {
                System.out.println("Evento " + cont + " - " + evt);
                cont++;
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
