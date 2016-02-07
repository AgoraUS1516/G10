package testPositivos;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import repositories.EncuestaRepository;
import repositories.PreguntaRepository;
import services.PreguntaService;
import services.PropuestaService;
import services.ReferendumRecuentoService;
import utilities.AbstractTest;
import domain.Encuesta;
import domain.Pregunta;
import domain.Propuesta;
import domain.ReferendumRecuento;

@ContextConfiguration(locations = { "classpath:spring/datasource.xml",
		"classpath:spring/config/packages.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration(defaultRollback = false)
public class preguntaServiceTest extends AbstractTest{

	String admin = "admin";

	
	@Autowired
	private EncuestaRepository propuestaService;
	

	@Test
	public void testFindPropuestaSize() {
		
	
		Collection<Encuesta> all=new HashSet<Encuesta>();
		all = propuestaService.findAll();
		System.out.println(all);
		
		
		
	}
	
	
}
