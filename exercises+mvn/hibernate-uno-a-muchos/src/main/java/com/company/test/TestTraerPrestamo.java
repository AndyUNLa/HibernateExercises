package com.company.test;
import java.util.List;
import com.company.datos.Cliente;
import com.company.datos.Prestamo;
import com.company.funciones.LoggerWrapper;
import com.company.negocio.ClienteABM;
import com.company.negocio.PrestamoABM;

/*
 * Test que trae un prestamo dado su ID y los 
 * prestamos que tiene un cliente
 */
public class TestTraerPrestamo {
    public static void main(String[] args) {
        String className = TestTraerClientes.class.getName();
        LoggerWrapper logger = LoggerWrapper.getInstance(className, true);
        ClienteABM clienteABM = new ClienteABM();
        PrestamoABM prestamoABM = new PrestamoABM();
        long idPrestamo = 1;
        System.out.println("\n---> TraerPrestamo idPrestamo=" + idPrestamo + "\n\n");
        try {
            Prestamo p = prestamoABM.traerPrestamo(idPrestamo);
            System.out.println(p + "\nPertenece a " + p.getCliente());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        int dni = 14000000;
        Cliente c = clienteABM.traer(dni);
        logger.info("Traer Prestamos del Cliente=" + c + "\n\n");
        try {
            List<Prestamo> prestamos = prestamoABM.traerPrestamo(c);
            for (Prestamo o : prestamos)
                System.out.println(o + "\nPertenece a " + o.getCliente());
        } catch(Exception e) {
            logger.error(e.getMessage());
        }
    }
}
