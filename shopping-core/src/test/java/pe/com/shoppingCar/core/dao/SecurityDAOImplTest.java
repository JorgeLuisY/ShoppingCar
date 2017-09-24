package pe.com.shoppingCar.core.dao;

import org.hibernate.SQLQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.Security;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import pe.com.shoppingCar.core.domain.UserSystem;
import pe.com.shoppingCar.core.util.CommonUtils;

public class SecurityDAOImplTest extends AbstractUnitTest {

	@Autowired
	protected SecurityDAOImpl securityDAOImpl;
	
	public void testfindUserSystemByLoginAndPass(){
		String user = "admin";
		String pass = "a250f064066a8468";
		
		UserSystem userSystem = securityDAOImpl.findUserSystemByLoginAndPass(user, pass);
		System.out.println(userSystem.getLogin() + " , "+ userSystem.getPassword() );
	}
	
	
//	public void testfindSmsAll(){
//		List<Sms>  sms= smsDAOImpl.findSmsAll(null, 3L, "Espera",1000);
//		for (Sms smsContact : sms) {
//			System.out.println(smsContact.getContact().getNameAll() + "\t" + smsContact.getContact().getNumPhone() +"\t"+
//					smsContact.getId() + "\t"+ smsContact.getMessage() ) ;
//		}
//	}
//	
	
//	public void testFindContact() {
//		
//		List<Contact> list = smsDAOImpl.findContactAll(18L, null);
//		System.out.println("list "+list);
//	
//	}
	
//	public void testFindGroupContactByGroupId() {
//		List<GroupContact> gc = smsDAOImpl.findGroupContactByGroupId(null, null, null);
//		for (GroupContact groupContact : gc) {
//			System.out.println(groupContact.getGroupContactPK().getContact().getNameAll() + "--"+groupContact.getGroupContactPK().getGroup().getNameGroup());
//		}
//	}
//	
//	public void testDeleteContactGroup(){
//		smsDAOImpl.deleteContactGroup(5L,7L);
//		setComplete();
//	}
//	


}
