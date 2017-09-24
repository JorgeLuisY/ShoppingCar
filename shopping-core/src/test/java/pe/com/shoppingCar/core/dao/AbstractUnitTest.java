package pe.com.shoppingCar.core.dao;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public class AbstractUnitTest extends
		AbstractTransactionalDataSourceSpringContextTests {

	@Override
	protected String[] getConfigLocations() {
		setPopulateProtectedVariables(true);
		setAutowireMode(AUTOWIRE_BY_TYPE);
		return new String[] {
				"pe/com/shoppingCar/core/config/application-config.xml",
				"pe/com/shoppingCar/core/config/applicationContext-dao.xml", 
			};
	}

	public void testApp() {
		assertTrue(true);
		
	}

}
