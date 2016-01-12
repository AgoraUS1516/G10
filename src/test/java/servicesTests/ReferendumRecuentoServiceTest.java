package servicesTests;

import java.util.ArrayList;
import java.util.List;

import utilities.AbstractTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import services.ReferendumRecuentoService;
import domain.ReferendumRecuento;

@ContextConfiguration(locations = { "classpath:spring/datasource.xml",
		"classpath:spring/config/packages.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration(defaultRollback = false)

public class ReferendumRecuentoServiceTest extends AbstractTest{
	
	String admin = "admin";

	@Autowired
	private ReferendumRecuentoService referendumRecuentoService;

	@Test
	public void testFindReferendum() {
		authenticate(admin);
	
		ReferendumRecuento ref=referendumRecuentoService.getReferemdumById(9);
		List<ReferendumRecuento> all;
		all = new ArrayList<ReferendumRecuento>(referendumRecuentoService.findAll());
		Assert.isTrue(all.contains(ref));
		
		authenticate(null);
	}


}
