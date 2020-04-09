package com.company.test;
import com.company.datos.Cliente;
import com.company.funciones.LoggerWrapper;
import com.company.negocio.ClienteABM;

/*
 * Test que actualiza un cliente dado su ID
 */
public class TestActualizarCliente {
	public static void main(String[] args) {
		String className = TestActualizarCliente.class.getName();
        LoggerWrapper logger = LoggerWrapper.getInstance(className, true);
		ClienteABM abm = new ClienteABM();
		long id = 1;
		// traer el obj a modificar
		Cliente c = abm.traer(id);
		logger.info("Modificar cliente: " + c + "\n\n");
		// modificar por set los atributos
		c.setDni(35000001);
		try {
			abm.modificar(c);
			logger.info("Cliente modificado exitosamente");
		} catch(Exception e) {
			logger.error(e.getMessage());
		}
		
		// Comprobar cliente modificado
		int dni = 35000001;
		Cliente cModif = abm.traer(dni);
		logger.info("Cliente Modificado -->" + cModif);
	}
}
