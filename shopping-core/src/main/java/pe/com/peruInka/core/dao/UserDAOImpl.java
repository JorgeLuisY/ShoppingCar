package pe.com.peruInka.core.dao;

import java.util.List;

import org.hibernate.SQLQuery;

import pe.com.peruInka.core.domain.Role;
import pe.com.peruInka.core.domain.UserSystem;


public class UserDAOImpl extends BaseDAOHibernate implements UserDAO {

	public UserSystem findUserSystemByUserAndPassword(String user, String password) {
		String query = " from UserSystem WHERE userName = '" + user + "' ";
		query = query + " and userPassword = '" + password + " '";
		query = query + " AND STATUS = 'USER_ACT' ";
		return findFirst(UserSystem.class, query);
	}

	public String[] findRoleByUserId(Long userId) {
//		String[] roles = { "ROLE_CLIENT", "ROLE_ADMIN", "ROLE_SECRE" };
//		String[] roles = { "ROLE_SECRE" };
//		String[] roles = { "ROLE_ADMIN" };

		String sql = "SELECT r.roleValue "
				+ " FROM role r JOIN accessrole ar ON (r.id = ar.rolId) "
				+ " WHERE ar.userSystemId = "+userId;
		
		
		SQLQuery query = getSession().createSQLQuery(sql.toString());
		List<Object> rows = query.list();
		String [] roles = new String [rows.size()];
		for (int i = 0; i < rows.size(); i++) {
			roles[i]= rows.get(i).toString();
		}
		
		return roles;
	}
	
	public void saveRole(Role role){
		save(role);
	}
	
	public void updateRole(Role role){
		update(role);
	}
	
	public void deleteRole(Role role){
		delete(role);
	}

	public Role findRoleById(Long id){
		return findById(Role.class, id);
	}
	
	public  List<Role> findRoles(){
		return find(Role.class,"FROM Role");
	}
	
	// hotel
	
//	public void saveHotel(Hotel hotel){
//		save(hotel);
//	}
//	
//	public void updateHotel(Hotel  hotel){
//		update(hotel);
//	}
//	
//	public void deleteHotel(Hotel hotel){
//		delete(hotel);
//	}
//
//	public Hotel findHotelById(Long id){
//		return findById(Hotel.class, id);
//	}
//	
//	public  List<Hotel> findHotels(){
//		return find(Hotel.class,"FROM Hotel");
//	}
	
	// product
	
//	public void saveProduct(Product product){
//		save(product);
//	}
//	
//	public void updateProduct(Product product){
//		update(product);
//	}
//	
//	public void deleteProduct(Product product){
//		delete(product);
//	}
//
//	public Product findProductById(Long id){
//		return findById(Product.class, id);
//	}
//	
//	public  List<Product> findProducts(){
//		return find(Product.class,"FROM Product");
//	}	
//	
//	// Ticket
//	
//	public void saveTicket(Ticket ticket) {
//		saveTicket(ticket);	
//	}
//
//	public void updateTicket(Ticket ticket) {
//		update(ticket);	
//	}
//	
//	public void deleteTicket(Ticket ticket){
//		delete(ticket);
//	}
//
//	public Ticket findTicketById(Long id){
//		return findById(Ticket.class, id);
//	}
//	
//	public  List<Ticket> findTicket(){
//		return find(Ticket.class,"FROM Ticket");
//	}
//	
//	//ticket description
//	
//	public void saveTicketDescription(TicketDescription ticketDescription) {
//		saveTicketDescription(ticketDescription);	
//	}
//
//	public void updateTicketDescription(TicketDescription ticketDescription) {
//		updateTicketDescription(ticketDescription);	
//	}
//	
//	public void deleteTicketDescription(TicketDescription ticketDescription){
//		delete(ticketDescription);
//	}
//
//	public TicketDescription findTicketDescriptionById(Long id){
//		return findById(TicketDescription.class, id);
//	}
//	
//	public  List<TicketDescription> findTicketDescription(){
//		return find(TicketDescription.class,"FROM TicketDescription");
//	}
//	
//	//customer
//	
//	public void saveCustomer(Customer customer) {
//		save(customer);	
//	}
//
//	public void updateCustomer(Ticket customer) {
//		update(customer);	
//	}
//	
//	public void deleteCustomer(Ticket customer){
//		delete(customer);
//	}
//
//	public Customer findCustomerById(Long id){
//		return findById(Customer.class, id);
//	}
//	
//	public  List<Customer> findCustomer(){
//		return find(Customer.class,"FROM Customer");
//	}
	
}
