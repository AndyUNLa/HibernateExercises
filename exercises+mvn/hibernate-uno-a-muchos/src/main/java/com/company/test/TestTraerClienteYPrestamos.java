package com.company.test;

import com.company.datos.Cliente;
import com.company.datos.Prestamo;
import com.company.funciones.LoggerWrapper;
import com.company.negocio.ClienteABM;

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
            logger.info("\nTraer Cliente y prestamos:\n" + idCliente);
            logger.info("\n" + cliente);
            for (Prestamo p : cliente.getPrestamos())
                System.out.println("\n" + p);
        } catch(Exception e) {
            logger.error(e.getMessage());
        }
    }
}
