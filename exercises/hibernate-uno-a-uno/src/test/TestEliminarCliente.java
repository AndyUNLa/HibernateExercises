package test;

import funciones.LoggerWrapper;
import negocio.ClienteABM;

/*
 * Test que elimina un cliente dado su ID
 */
public class TestEliminarCliente {
	public static void main(String[] args) {
		String className = TestEliminarCliente.class.getName();
        LoggerWrapper logger = LoggerWrapper.getInstance(className, true);
		ClienteABM abm = new ClienteABM();
		long id = 1;
		logger.info("Eliminar cliente con id: " + id + "\n\n");
		try {
			abm.eliminar(id);
			logger.info("Cliente eliminado satisfactoriamente");
		} catch(Exception e) {
			logger.error(e.getMessage());
		}
	}
}
