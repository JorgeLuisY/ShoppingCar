package pe.com.shoppingCar.core.dao;

import java.util.List;


import pe.com.shoppingCar.core.domain.UserSystem;

public interface SecurityDAO {

	UserSystem findUserSystemByLoginAndPass(String login, String password);

	String[] findRoleByUserId(Long userId);
}
