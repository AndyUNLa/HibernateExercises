package test;
import java.util.List;
import java.util.ArrayList;
import datos.Cliente;
import negocio.ClienteABM;

public class TestTraerClientes {
    public static void main(String[] args) {
        ClienteABM abm = new ClienteABM();
        List<Cliente> list = abm.traer();
        for (Cliente cliente : list) {
            System.out.println(cliente);
        }
    }
}