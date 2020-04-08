package com.company.test;

import com.company.datos.Cliente;
import com.company.datos.Evento;
import com.company.funciones.LoggerWrapper;
import com.company.negocio.ClienteABM;
import com.company.negocio.EventoABM;
/*
 * Test que agrega un evento nuevo al cliente; luego lo actualizamos
 */
public class TestAgregarEventoACliente {
    public static void main(String[] args) {
        String className = TestAgregarEventoACliente.class.getName();
        LoggerWrapper logger = LoggerWrapper.getInstance(className);
        ClienteABM clienteABM = new ClienteABM();
        EventoABM eventoABM = new EventoABM();
        int dni = 32000001;
        long idEvento = 2;
        try {
            Cliente cliente = clienteABM.traer(dni);
            Evento evento = eventoABM.traerEvento(idEvento);
            logger.info("Agregar evento con id: " + idEvento + " al Cliente: \n" + cliente + "\n\n");
            boolean agregado = cliente.agregar(evento); // Para saber si fue agregado el nuevo evento o estaba repetido
            if (agregado) {
                clienteABM.modificar(cliente);
                logger.info("Cliente actualizado satisfactoriamente");
            } else {
                logger.warning("No se pudo agregar el evento al cliente");
            }
        } catch(Exception e) {
            logger.error(e.getMessage());
        }
    }
}
