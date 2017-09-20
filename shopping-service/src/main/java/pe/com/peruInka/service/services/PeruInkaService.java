package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.peruInka.core.dao.CoreInkaDAO;
import pe.com.peruInka.core.dao.PersonDAO;
import pe.com.peruInka.core.domain.StatusPerson;
import pe.com.peruInka.core.domain.StatusUser;
import pe.com.peruInka.core.domain.Ticket;
import pe.com.peruInka.core.domain.TypeDocument;
import pe.com.peruInka.core.domain.UserSystem;
import pe.com.peruInka.service.util.Person;

@Service("peruInkaService")
public class PeruInkaService {

	public static List<Person> listPerson = new ArrayList<Person>();

	@Autowired
	private PersonDAO personDAO;

	@Autowired
	private CoreInkaDAO coreInkaDAO;

	// findPersonByName

	public List<pe.com.peruInka.core.domain.Person> findPersonByName(String name) {
		return personDAO.findPersonByName(name);
	}

	public void saveTicket(Ticket ticket) {
		Ticket t =  new Ticket();
		System.out.println("ticket ID: " + ticket.getId());

		if (ticket.getId() == null) {
			coreInkaDAO.saveTicket(ticket);
		} else {
			coreInkaDAO.updateTicket(ticket);
		}
	}

	// public void UpdateTicket(Ticket ticket) {
	// }
	public void deleteTicket(Long id) {
		Ticket ticket = coreInkaDAO.findTicketById(id);
		coreInkaDAO.deleteTicket(ticket);
	}

	public Ticket findTicketById(Long id) {
		return coreInkaDAO.findTicketById(id);
	}

	public List<Ticket> findTicketAll() {
		return coreInkaDAO.findTicketAll();
	}

	public void deleteUserSystem(Long id) {
		UserSystem userSystem = personDAO.findUserSystemById(id);
		personDAO.deleteUserSystem(userSystem);
	}

	public UserSystem findUserSystemById(Long id) {
		return personDAO.findUserSystemById(id);
	}

	public List<StatusUser> findStatusUser() {
		return personDAO.findStatusUser();
	}

	public List<TypeDocument> findTypeDocument() {
		return personDAO.findTypeDocument();
	}

	public List<StatusPerson> findStatusPerson() {
		return personDAO.findStatusPerson();
	}

	public List<pe.com.peruInka.core.domain.Person> findAllPerson() {
		return personDAO.findAllPerson();
		// return listPerson;
	}

	public void savePerson(pe.com.peruInka.core.domain.Person person) {
		// listPerson.add(person);
		personDAO.savePerson(person);
	}

	public List<UserSystem> findUserSystem() {
		return personDAO.findUserSystem();
	}

	public void saveUserSystem(UserSystem userSystem) {
		if (userSystem.getId() == null) {
			personDAO.saveUserSystem(userSystem);
		} else {
			personDAO.updateUserSystem(userSystem);
		}
	}

	public void deletePerson(Long id) {
		// peruInkaDAO.deletePerson(id);
		List<Person> listPersoTemp = new ArrayList<Person>();

		for (Person person : listPerson) {
			if (id.compareTo(person.getId()) != 0) {
				listPersoTemp.add(person);
			}
		}
		listPerson = new ArrayList<Person>();
		listPerson.addAll(listPersoTemp);
	}

	public void updatePerson(Person personUpdate) {
		List<Person> listTemp = new ArrayList<Person>();

		for (Person person : listPerson) {
			if (personUpdate.getId().compareTo(person.getId()) == 0) {
				listTemp.add(personUpdate);
			} else {
				listTemp.add(person);
			}
		}
		listPerson = new ArrayList<Person>();
		listPerson.addAll(listTemp);

	}

	public pe.com.peruInka.core.domain.Person searchPerson(Long id) {
		return personDAO.findPersonById(id);
	}

	
	
	
}
