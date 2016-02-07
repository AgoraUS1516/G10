//package testNegativos;
//
//import java.util.Collection;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.transaction.TransactionConfiguration;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.util.Assert;
//
//import domain.Propuesta;
//import domain.ReferendumRecuento;
//
//import services.PropuestaService;
//import services.ReferendumRecuentoService;
//import utilities.AbstractTest;
//
//
//@ContextConfiguration(locations = { "classpath:spring/datasource.xml",
//"classpath:spring/config/packages.xml" })
//@RunWith(SpringJUnit4ClassRunner.class)
//@Transactional
//@TransactionConfiguration(defaultRollback = true)
//public class ReferendumRecuentoTest extends AbstractTest{
//
//	
//	String admin = "admin";
//	
//	
//	@Autowired
//	private ReferendumRecuentoService referendumRecuentoService;
//	
//	@Autowired
//	private PropuestaService propuestaService;
//	
//	
//	@Test(expected=NullPointerException.class)
//	public void testReferendumFalse1(){
//		authenticate(admin);
//		
//		ReferendumRecuento referendumRecuento;
//		referendumRecuento = referendumRecuentoService.findIdVotacionModificacion(10);
//		Assert.isTrue(referendumRecuento.getNombre()=="ReferendumInventado");
//				
//		unauthenticate();
//	}
//	
//	@Test(expected=IllegalArgumentException.class)
//	public void testReferendumFalse2(){
//		authenticate(admin);
//		
//		Propuesta propuesta;
//		propuesta = propuestaService.find(5);
//		
//		ReferendumRecuento referendumRecuento;
//		referendumRecuento = referendumRecuentoService.getReferemdumById(9);
//		
//		Collection<Propuesta> propuestas;
//		propuestas = referendumRecuento.getPropuestas();
//		
//		Assert.isTrue(propuestas.contains(propuesta));
//		unauthenticate();
//		
//		
//	}
//
//}
