package pe.com.peruInka.service.services;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplTest extends AbstractUnitTest {

	
	@Autowired
	protected UserService userService;
	
	public void test() {
		System.out.println(userService);
	}

}
