package negocio;
import dao.ContactoDao;
import datos.Contacto;
import datos.Cliente;

public class ContactoABM {
	ContactoDao dao = new ContactoDao();

	public Contacto traer(long idContacto) {
		Contacto c = dao.traer(idContacto);
		return c;
	}

	public int agregar(String email, String movil, String fijo, Cliente cliente) throws Exception {
		Contacto c = new Contacto(email, movil, fijo, cliente);
		return dao.agregar(c);
	}
	
	public void modificar(Contacto c) throws Exception {
		dao.actualizar(c);
	}
	
	public void eliminar(long idContacto) throws Exception {
		Contacto c = dao.traer(idContacto);
		if(c == null) {
			throw new Exception("No se pudo realizar la operación. El contacto no existe");
		}
		dao.eliminar(c);
	}
}

/*

Crear la clase EventoDao
En EventoABM agregar los casos de uso:
Agregar un cliente a un evento
A partir de los parámetro idCliente y idEvento:
traer el cliente
	traer evento y sus clientes
	agregar el cliente a un evento y actualizar.
	Eliminar un cliente a un evento y actualizar

En ClienteABM agregar los casos de uso:
	Traer un cliente y los eventos
	Agregar un evento a un cliente y actualizar
	Eliminar un evento a un cliente
Realizar los test de los casos de uso
*/