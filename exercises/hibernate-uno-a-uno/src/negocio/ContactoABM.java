package negocio;
import java.time.LocalDate;
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
