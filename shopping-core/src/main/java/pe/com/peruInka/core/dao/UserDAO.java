package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Customer;
import pe.com.peruInka.core.domain.Hotel;
import pe.com.peruInka.core.domain.Product;
import pe.com.peruInka.core.domain.Role;
import pe.com.peruInka.core.domain.Ticket;
import pe.com.peruInka.core.domain.TicketDescription;
import pe.com.peruInka.core.domain.UserSystem;

public interface UserDAO {

	UserSystem findUserSystemByUserAndPassword(String user, String password);

	String[] findRoleByUserId(Long userId);

	void saveRole(Role role);

	void updateRole(Role role);

	void deleteRole(Role role);

	Role findRoleById(Long id);

	List<Role> findRoles();
	
//	// hotel
//	void saveHotel(Hotel hotel);
//	
//	void updateHotel(Hotel  hotel);
//	
//	void deleteHotel(Hotel hotel);
//
//	Hotel findHotelById(Long id);
//	
//	List<Hotel> findHotels();
//	
//	// product
//	
//	void saveProduct(Product product);
//	
//	void updateProduct(Product product);
//	
//	void deleteProduct(Product product);
//
//	Product findProductById(Long id);
//	
//	List<Product> findProducts();
//	
//	// ticket
//	
//	void saveTicket(Ticket ticket);
//	
//	void updateTicket(Ticket ticket);
//	
//	void deleteTicket(Ticket ticket);
//
//	Ticket findTicketById(Long id);
//	
//	List<Ticket> findTicket();
//	
//	// ticketDescripton
//	
//	void saveTicketDescription(TicketDescription ticketDescription);
//
//	void updateTicketDescription(TicketDescription ticketDescription);
//	
//	void deleteTicketDescription(TicketDescription ticketDescription);
//	
//	TicketDescription findTicketDescriptionById(Long id);
//	
//	List<TicketDescription> findTicketDescription();
//	
//	//customer
//	
//	void saveCustomer(Customer customer);
//
//	void updateCustomer(Ticket customer) ;
//	
//	void deleteCustomer(Ticket customer);
//
//	Customer findCustomerById(Long id);
//	
//	List<Customer> findCustomer();
	
}
