package testNegativos;

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

import domain.Propuesta;
import domain.ReferendumRecuento;

import services.PropuestaService;
import services.ReferendumRecuentoService;
import utilities.AbstractTest;


@ContextConfiguration(locations = { "classpath:spring/datasource.xml",
"classpath:spring/config/packages.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class TestPropuesta extends AbstractTest{
	
	String admin = "admin";
	
	
	@Autowired
	private ReferendumRecuentoService referendumRecuentoService;
	
	@Autowired
	private PropuestaService propuestaService;
	
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testFindPropuestaSize() {
		authenticate(admin);
	
		Collection<Propuesta> all=new HashSet<Propuesta>();
		all = propuestaService.findAll();
		Assert.isTrue(all.size() == 6);
		
		authenticate(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testFindPropuestaFalsa(){
	authenticate(admin);
	
	ReferendumRecuento referendumRecuento;
	referendumRecuento = referendumRecuentoService.findIdVotacionModificacion(1);
	Collection<Propuesta> propuestas;
	propuestas = referendumRecuento.getPropuestas();
	
	Propuesta propuesta;
	propuesta = propuestaService.find(12);
	
	Assert.isTrue(propuestas.contains(propuesta));
	authenticate(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testFindPropuestaFalsa2(){
		
		authenticate(admin);
		Propuesta propuesta;
		propuesta = propuestaService.find(9);
		
		
		ReferendumRecuento referendumRecuento;
		referendumRecuento = referendumRecuentoService.findIdVotacionModificacion(1);
		Collection<Propuesta> propuestas;
		propuestas = referendumRecuento.getPropuestas();
		Assert.isTrue(propuestas.contains(propuesta));
		unauthenticate();
		
	}
	
	
//	@Test(expected=IllegalArgumentException.class)
//	public void testFindPropuestaFalsa2(){
//	authenticate(admin);
//	
//	Collection<Propuesta>propuestas;
//	propuestas = propuestaService.findAll();
//	Propuesta propuesta;
//	
//	Assert.isTrue(propuestas.contains(propuesta));
//	authenticate(null);
//	}
	
	
	
	
	
}
