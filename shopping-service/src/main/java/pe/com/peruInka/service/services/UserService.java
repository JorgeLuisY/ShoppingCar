package pe.com.peruInka.service.services;

import pe.com.peruInka.core.security.User;

public interface UserService {

	User findValidateUser(String userName, String password);
}
