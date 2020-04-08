package test;
import java.time.LocalDate;

import negocio.ClienteABM;

public class TestAgregarCliente {
	public static void main(String[] args) {
		String apellido = "Downey Jr";
		String nombre = "Robert";
		int dni = 34000001;
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
