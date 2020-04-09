package test;
import java.time.LocalDate;
import java.util.function.LongToIntFunction;

import datos.Cliente;
import negocio.ClienteABM;
import negocio.ContactoABM;

/*
 * Este test agrega los datos de contacto si 
 * el cliente ya existe.
*/
public class TestAgregarContacto {
	public static void main(String[] args) {
		ClienteABM abmCliente = new ClienteABM();
		ContactoABM abmContacto = new ContactoABM();
		long idCliente = 4;
		Cliente cliente = abmCliente.traer(idCliente);
		System.out.println(cliente);
		try {
			if (cliente == null) {
				System.out.println("No existe el cliente con ese ID");
			} else {
				abmContacto.agregar("alguien@example.com", "11-11111234", "011-11111234", cliente);
				System.out.println("Contacto agregado satisfactoriamente");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

