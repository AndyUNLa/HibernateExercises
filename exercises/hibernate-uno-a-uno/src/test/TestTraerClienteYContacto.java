package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestTraerClienteYContacto {
    public static void main(String[] args) {
        ClienteABM abm = new ClienteABM();
        long idCliente = 1;
        try {
            Cliente cliente = abm.traerClienteYContacto(idCliente);
            System.out.println("\nTraer Cliente y contacto:\n" + cliente);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
