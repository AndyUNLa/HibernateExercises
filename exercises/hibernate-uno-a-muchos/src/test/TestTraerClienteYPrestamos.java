package test;

import datos.Cliente;
import datos.Prestamo;
import funciones.LoggerWrapper;
import negocio.ClienteABM;

/*
 * Test que trae los prestamos 
 * que tiene un cliente dado su ID
 */
public class TestTraerClienteYPrestamos {
    public static void main(String[] args) {
        String className = TestTraerClienteYPrestamos.class.getName();
        LoggerWrapper logger = LoggerWrapper.getInstance(className, true);
        ClienteABM abm = new ClienteABM();
        long idCliente = 1;
        try {
            Cliente cliente = abm.traerClienteYPrestamos(idCliente);
            logger.info("\nTraer prestamos del cliente: " + idCliente);
            logger.info("\n" + cliente);
            for (Prestamo p : cliente.getPrestamos())
                System.out.println("\n" + p);
        } catch(Exception e) {
            logger.error(e.getMessage());
        }
    }
}
