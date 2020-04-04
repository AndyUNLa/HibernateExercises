package com.company.test;
import java.time.LocalDate;
import java.util.function.LongToIntFunction;

import com.company.datos.Cliente;
import com.company.negocio.ClienteABM;
import com.company.negocio.ContactoABM;

/*
 * Este test crea un nuevo usuario sin datos de 
 * contacto, pero lo agregamos posteriormente 
 * al obtener su ID.
*/
public class TestAgregarContactoNuevo {
	public static void main(String[] args) {
		String apellido = "Fernández";
		String nombre = "Mario";
		int dni = 32000006;
		LocalDate fechaDeNacimiento = LocalDate.now();
		ClienteABM abmCliente = new ClienteABM();
		try {
			long idCliente = abmCliente.agregar(nombre, apellido, dni, fechaDeNacimiento, null);
			Cliente cliente = abmCliente.traer(idCliente);
			System.out.println(cliente);
			ContactoABM abmContacto = new ContactoABM();
			try {
				abmContacto.agregar("alguien@example.com", "11-11111234", "011-11111234", cliente);
				System.out.println("Contacto agregado satisfactoriamente");
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
