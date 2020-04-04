package com.company.test;

import java.time.LocalDate;
import com.company.datos.Cliente;
import com.company.negocio.ClienteABM;

public class TestEliminarCliente {
	public static void main(String[] args) {
		ClienteABM abm = new ClienteABM();
		long id = 1;
		try {
			abm.eliminar(id);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
