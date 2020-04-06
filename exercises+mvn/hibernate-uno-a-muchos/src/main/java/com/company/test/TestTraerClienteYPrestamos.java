package com.company.test;

import com.company.datos.Cliente;
import com.company.datos.Prestamo;
import com.company.negocio.ClienteABM;

public class TestTraerClienteYPrestamos {
    public static void main(String[] args) {
        long idCliente = 1;
        ClienteABM abm = new ClienteABM();
        try {
            Cliente cliente = abm.traerClienteYPrestamos(idCliente);
            System.out.println("\nTraer Cliente y prestamos:\n" + idCliente);
            System.out.println("\n" + cliente);
            for (Prestamo p : cliente.getPrestamos()) System.out.println("\n" + p);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
