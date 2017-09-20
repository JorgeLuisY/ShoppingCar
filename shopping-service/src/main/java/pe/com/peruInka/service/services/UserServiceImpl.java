package pe.com.peruInka.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.peruInka.core.dao.UserDAO;
import pe.com.peruInka.core.domain.UserSystem;
import pe.com.peruInka.core.security.User;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;

	public User findValidateUser(String userName, String password) {
		UserSystem userSystem = userDAO.findUserSystemByUserAndPassword(userName, password);
		User user= null;
		if(userSystem !=null){
			user = new User();
			user.setFullName(userSystem.getPerson().getName()+" "+userSystem.getPerson().getLastNameF()+ " "+userSystem.getPerson().getLastNameM());
			user.setUserId(userSystem.getId());
			String[] roles= userDAO.findRoleByUserId(userSystem.getId());
			user.setRoles(roles);
		}
		return user;
	}

}
