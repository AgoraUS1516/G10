package servicesTests;

import java.util.Collection;
import java.util.HashSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import services.PropuestaService;
import utilities.AbstractTest;
import domain.Propuesta;

@ContextConfiguration(locations = { "classpath:spring/datasource.xml",
		"classpath:spring/config/packages.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration(defaultRollback = false)
public class PropuestaServiceTest extends AbstractTest{

	String admin = "admin";

	@Autowired
	private PropuestaService propuestaService;

	@Test
	public void testFindPropuestaSize() {
		authenticate(admin);
	
		Collection<Propuesta> all=new HashSet<Propuesta>();
		all = propuestaService.findAll();
		Assert.isTrue(all.size() == 7);
		
		authenticate(null);
	}

}
