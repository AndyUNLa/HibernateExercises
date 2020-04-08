package test;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Set;
import datos.Cliente;
import datos.Evento;
import negocio.ClienteABM;
import negocio.EventoABM;
/*
 * Test que trae un evento específico y sus clientes
 */
public class TestTraerEventoYClientes {
    public static void main(String[] args) {
        Logger.getLogger("org.hibernate").setLevel(Level.OFF); // Para no mostrar los logs de Hibernate
        ClienteABM clienteABM = new ClienteABM();
        EventoABM eventoABM = new EventoABM();
        long idEvento = 1;
        System.out.println("\n---> Traer clientes del Evento idEvento=" + idEvento + "\n\n");
        try {
            Evento evento = eventoABM.traerEvento(idEvento);
            System.out.println("Evento: " + evento);
            int cont = 1;
            Set<Cliente> clientes = evento.getClientes();
            for (Cliente c : clientes) {
                System.out.println("Cliente " + cont + " - " + c);
                cont++;
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
