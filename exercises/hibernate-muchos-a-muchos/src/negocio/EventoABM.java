package negocio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import dao.EventoDao;
import datos.Cliente;
import datos.Evento;


public class EventoABM {
	EventoDao dao = new EventoDao();
	
	public Evento traerEvento(long idEvento) throws Exception {
		Evento e = dao.traer(idEvento);
		if (e == null)
			throw new Exception("ERROR: No se pudo obtener el evento");
		return e;
	}

	public List<Evento> traerEventos(Cliente c) throws Exception {
		List<Evento> lista = null;
		try {
			lista = dao.traer(c);
		} catch(Exception e) {
			throw new Exception("ERROR: El cliente dado no posee eventos");
		}
		return lista;
	}

	public int agregar(String evento, LocalDate fecha, LocalTime hora, Cliente cliente) throws Exception {
		Evento objeto = new Evento(evento, fecha, hora);
		objeto.agregar(cliente); // Agregamos un cliente
		return dao.agregar(objeto);
	}
	
	public void modificar(Evento e) throws Exception {
		dao.actualizar(e);
	}
	
	public void eliminar(long idEvento) throws Exception {
		Evento e = dao.traer(idEvento);
		if(e == null) {
			throw new Exception("No se pudo realizar la operación. El evento no existe");
		}
		dao.eliminar(e);
	}
}
