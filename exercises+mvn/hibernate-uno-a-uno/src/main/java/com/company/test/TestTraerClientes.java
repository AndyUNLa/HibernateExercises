package com.company.test;
import java.util.List;
import java.util.ArrayList;
import com.company.datos.Cliente;
import com.company.negocio.ClienteABM;

public class TestTraerClientes {
    public static void main(String[] args) {
        ClienteABM abm = new ClienteABM();
        List<Cliente> list = abm.traer();
        for (Cliente cliente : list) {
            System.out.println(cliente);
        }
    }
}