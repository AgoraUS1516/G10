//package testPositivos;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import utilities.AbstractTest;
//
//import org.hibernate.mapping.Collection;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.transaction.TransactionConfiguration;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.util.Assert;
//
//import services.PropuestaService;
//import services.ReferendumRecuentoService;
//import domain.Propuesta;
//import domain.ReferendumRecuento;
//
//@ContextConfiguration(locations = { "classpath:spring/datasource.xml",
//		"classpath:spring/config/packages.xml" })
//@RunWith(SpringJUnit4ClassRunner.class)
//@Transactional
//@TransactionConfiguration(defaultRollback = false)
//
//public class ReferendumRecuentoServiceTest extends AbstractTest{
//	
//	String admin = "admin";
//
//	@Autowired
//	private ReferendumRecuentoService referendumRecuentoService;
//	
//	@Autowired
//	private PropuestaService propuestaService;
//
//	
//	
//	@Test
//	public void testFindAllRederendum(){
//		authenticate(admin);
//		
//		List<ReferendumRecuento> referendumRecuentos = (List<ReferendumRecuento>) referendumRecuentoService.findAll();
//		Assert.isTrue(referendumRecuentos.size()==2);
//		
//		unauthenticate();
//	}
//
//	
//	
//	
//	
//	
//	@Test
//	public void testFindReferendum() {
//		authenticate(admin);
//	
//		ReferendumRecuento ref=referendumRecuentoService.getReferemdumById(9);
//		List<ReferendumRecuento> all;
//		all = new ArrayList<ReferendumRecuento>(referendumRecuentoService.findAll());
//		Assert.isTrue(all.contains(ref));
//		
//		authenticate(null);
//	}
//	
//	@Test
//	public void testSizeReferendum() {
//		authenticate(admin);
//	
//		List<ReferendumRecuento> all;
//		all = new ArrayList<ReferendumRecuento>(referendumRecuentoService.findAll());
//		Assert.isTrue(all.size()==2);
//		
//		authenticate(null);
//	}
//
//
//}
