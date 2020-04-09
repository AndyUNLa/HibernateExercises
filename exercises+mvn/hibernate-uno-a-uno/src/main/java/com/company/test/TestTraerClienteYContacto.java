package com.company.test;

import com.company.datos.Cliente;
import com.company.funciones.LoggerWrapper;
import com.company.negocio.ClienteABM;

/*
 * Test que obtiene un cliente y sus
 * datos de contacto dado su ID
*/
public class TestTraerClienteYContacto {
    public static void main(String[] args) {
        String className = TestTraerClienteYContacto.class.getName();
        LoggerWrapper logger = LoggerWrapper.getInstance(className, true);
        ClienteABM abm = new ClienteABM();
        long idCliente = 1;
        try {
            logger.info("Traer Cliente y contacto dado idCliente=" + idCliente);
            Cliente cliente = abm.traerClienteYContacto(idCliente);
            logger.info("Cliente y datos de contacto: \n" + cliente);
        } catch(Exception e) {
            logger.error(e.getMessage());
        }
    }
}
