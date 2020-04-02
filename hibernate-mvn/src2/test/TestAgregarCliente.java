package test;
import java.time.LocalDate;
import java.util.function.LongToIntFunction;

import negocio.ClienteABM;

public class TestAgregarCliente {
	public static void main(String[] args) {
		String apellido = "Perez";
		String nombre = "Juan";
		int dni = 32000001;
		// tu fecha de nacimiento
		LocalDate fechaDeNacimiento = LocalDate.now();
		ClienteABM abm = new ClienteABM();
		try {
			long ultimoIdCliente = abm.agregar(apellido, nombre, dni, fechaDeNacimiento);
			System.out.println("Agregado satisfactoriamente. ID: " + Long.toString(ultimoIdCliente));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
