package com.company.test;

import com.company.datos.Cliente;
import com.company.datos.Evento;
import com.company.funciones.LoggerWrapper;
import com.company.negocio.ClienteABM;
import com.company.negocio.EventoABM;
/*
 * Test que agrega un cliente a un evento; luego lo actualizamos
 */
public class TestAgregarClienteAEvento {
    public static void main(String[] args) {
        String className = TestAgregarClienteAEvento.class.getName();
        LoggerWrapper logger = LoggerWrapper.getInstance(className);
        ClienteABM clienteABM = new ClienteABM();
        EventoABM eventoABM = new EventoABM();
        int dni = 33000000;
        long idEvento = 2;
        try {
            Cliente cliente = clienteABM.traer(dni);
            Evento evento = eventoABM.traerEvento(idEvento);
            logger.info("Agregar cliente con dni: " + dni + " al Evento: \n" + evento + "\n\n");
            boolean agregado = evento.agregar(cliente); // Para saber si fue agregado el nuevo evento o estaba repetido
            if (agregado) {
                eventoABM.modificar(evento);
                logger.info("El cliente fue agregado al evento exitosamente");
            } else {
                logger.warning("No se pudo agregar el cliente al evento");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
