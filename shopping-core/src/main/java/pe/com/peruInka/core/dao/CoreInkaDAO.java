package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Ticket;

public interface CoreInkaDAO {

	public Ticket findTicketById(Long id);

	public void saveTicket(Ticket ticket);

	public void updateTicket(Ticket ticket);

	public void deleteTicket(Ticket ticket);

	public List<Ticket> findTicketAll();
}
