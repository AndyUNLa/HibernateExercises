package com.company.test;
import java.time.LocalDate;

import com.company.negocio.ClienteABM;
import com.company.funciones.LoggerWrapper;

/*
 * Test para agregar un nuevo cliente
 */
public class TestAgregarCliente {
	public static void main(String[] args) {
		String className = TestAgregarEventoACliente.class.getName();
        LoggerWrapper logger = LoggerWrapper.getInstance(className, true);
		String apellido = "Downey Jr";
		String nombre = "Robert";
		int dni = 34000001;
		LocalDate fechaDeNacimiento = LocalDate.now();
		ClienteABM abm = new ClienteABM();
		logger.info("Agregar un nuevo cliente \n\n");
		try {
			long ultimoIdCliente = abm.agregar(apellido, nombre, dni, fechaDeNacimiento);
			logger.info("Agregado satisfactoriamente. ID: " + Long.toString(ultimoIdCliente));
		} catch(Exception e) {
			logger.error(e.getMessage());
		}
	}
}
