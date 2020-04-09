package test;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import datos.Cliente;
import datos.Evento;
import funciones.LoggerWrapper;
import negocio.ClienteABM;
import negocio.EventoABM;

/*
 * Test que trae todos los eventos de un cliente
 */
public class TestTraerClienteYEventos {
    public static void main(String[] args) {
        String className = TestTraerClienteYEventos.class.getName();
        LoggerWrapper logger = LoggerWrapper.getInstance(className, true); // El 2do parámetro es para que hibernate no muestre los logs
        ClienteABM clienteABM = new ClienteABM();
        EventoABM eventoABM = new EventoABM();
        int dni = 14000000;
        Cliente c = clienteABM.traer(dni);
        logger.info("Traer eventos del Cliente=" + c + "\n\n");
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
            logger.error(e.getMessage());
        }
    }
}
