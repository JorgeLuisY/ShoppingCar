package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Ticket;

public class CoreInkaDAOImpl extends BaseDAOHibernate implements CoreInkaDAO{

	public Ticket findTicketById(Long id) {
		return findById(Ticket.class, id);
	}
	
	public void saveTicket(Ticket ticket){
		save(ticket);
	}
	
	public void updateTicket(Ticket ticket){
		update(ticket);
	}
		
	public void deleteTicket(Ticket ticket){
		delete(ticket);
	}
	
	public List<Ticket> findTicketAll(){
		return find(Ticket.class,"FROM Ticket");
	}
	
//	public void deleteUserSystem(UserSystem userSystem) {
//		delete(userSystem);
//	}

	
}
