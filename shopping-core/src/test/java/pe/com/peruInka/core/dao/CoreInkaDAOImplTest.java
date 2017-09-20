package pe.com.peruInka.core.dao;

import java.util.Date;

import pe.com.peruInka.core.domain.StatusTicket;
import pe.com.peruInka.core.domain.Ticket;

public class CoreInkaDAOImplTest extends AbstractUnitTest {

	protected CoreInkaDAO coreInkaDAO;

	public void testTicket() {
		System.out.println("coreInkaDAO:::: " + coreInkaDAO);
	}

	public void testSaveTicket() {
		Ticket ticket = new Ticket();
		ticket.setCustomerId(1L);
		ticket.setDateIni(new Date());
		ticket.setDateEn(new Date());
		ticket.setCreatedBy("1");

		StatusTicket statusTicket = new StatusTicket();
		statusTicket.setTypeCode(StatusTicket.TICKET_ACT);

		ticket.setStatusTicket(statusTicket);

		coreInkaDAO.saveTicket(ticket);

		setComplete();
	}

	public void testUpdateTicket() {
		Ticket ticket = coreInkaDAO.findTicketById(1L);
		ticket.setLastUpdatedBy("2");
		coreInkaDAO.updateTicket(ticket);
		setComplete();
	}

}
