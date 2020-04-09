package com.company.test;
import java.util.List;
import com.company.datos.Cliente;
import com.company.funciones.LoggerWrapper;
import com.company.negocio.ClienteABM;

/*
 * Test que trae todos clientes
 */
public class TestTraerClientes {
    public static void main(String[] args) {
        String className = TestTraerClientes.class.getName();
        LoggerWrapper logger = LoggerWrapper.getInstance(className, true);
        ClienteABM abm = new ClienteABM();
        List<Cliente> list = abm.traer();
        logger.info("Traer todos los clientes \n\n");
        for (Cliente cliente : list) {
            System.out.println(cliente);
        }
    }
}
