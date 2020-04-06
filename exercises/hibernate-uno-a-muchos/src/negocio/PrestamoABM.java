package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.PrestamoDao;
import datos.Cliente;
import datos.Prestamo;


public class PrestamoABM {
	PrestamoDao dao = new PrestamoDao();

	public Prestamo traerPrestamo(long idPrestamo) throws Exception {
		Prestamo p = dao.traer(idPrestamo);
		if (p == null)
			throw new Exception("ERROR: No se pudo obtener el prestamo");
		return p;
	}

	public List<Prestamo> traerPrestamo(Cliente c) throws Exception {
		List<Prestamo> lista = null;
		try {
			lista = dao.traer(c);
		} catch(Exception e) {
			throw new Exception("ERROR: El cliente dado no posee prestamos");
		}
		return lista;
	}

	public int agregar(LocalDate fecha, double monto, double interes, int cantCuotas, Cliente cliente) throws Exception {
		Prestamo p = new Prestamo(fecha, monto, interes, cantCuotas, cliente);
		return dao.agregar(p);
	}
	
	public void modificar(Prestamo p) throws Exception {
		dao.actualizar(p);
	}
	
	public void eliminar(long idPrestamo) throws Exception {
		Prestamo p = dao.traer(idPrestamo);
		if(p == null) {
			throw new Exception("No se pudo realizar la operación. El prestamo no existe");
		}
		dao.eliminar(p);
	}
}
