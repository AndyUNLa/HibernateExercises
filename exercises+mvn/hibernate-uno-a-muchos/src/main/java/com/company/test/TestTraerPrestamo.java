package com.company.test;
import java.util.List;
import java.util.ArrayList;
import com.company.datos.Cliente;
import com.company.datos.Prestamo;
import com.company.negocio.ClienteABM;
import com.company.negocio.PrestamoABM;

public class TestTraerPrestamo {
    public static void main(String[] args) {
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
        System.out.println("\n---> TraerPrestamos del Cliente=" + c + "\n\n");
        try {
            List<Prestamo> prestamos = prestamoABM.traerPrestamo(c);
            for (Prestamo o : prestamos)
                System.out.println(o + "\nPertenece a " + o.getCliente());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
