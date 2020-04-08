package com.company.test;

import com.company.datos.Cliente;
import com.company.datos.Evento;
import com.company.funciones.LoggerWrapper;
import com.company.negocio.ClienteABM;
import com.company.negocio.EventoABM;
/*
 * Test que elimina un cliente de un evento
 */
public class TestEliminarClienteDeEvento {
    public static void main(String[] args) {
        String className = TestAgregarEventoACliente.class.getName();
        LoggerWrapper logger = LoggerWrapper.getInstance(className, true); // El 2do parámetro es para que hibernate no muestre los logs
        ClienteABM clienteABM = new ClienteABM();
        EventoABM eventoABM = new EventoABM();
        int dni = 32000003;
        long idEvento = 2;
        try {
            Cliente cliente = clienteABM.traer(dni);
            Evento evento = eventoABM.traerEvento(idEvento);
            logger.info("Eliminar cliente con dni: " + dni + " al evento: \n" + evento + "\n\n");
            boolean eliminado = evento.eliminar(cliente);
            if (eliminado) {
                eventoABM.modificar(evento);
                logger.info("Evento actualizado satisfactoriamente");
            } else {
                logger.warning("ERROR: No se pudo eliminar el cliente al evento.");
            }
        } catch(Exception e) {
            logger.error(e.getMessage());
        }
    }
}
