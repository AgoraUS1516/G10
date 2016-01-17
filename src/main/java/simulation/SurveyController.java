/* CustomerController.java
 *
 * Copyright (C) 2013 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 * 
 */

package simulation;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import controllers.AbstractController;

@Controller
@RequestMapping("/vote")
public class SurveyController extends AbstractController {

	// Constructors -----------------------------------------------------------

	public SurveyController() {
		super();
	}
	//stub
	// metodo de prueba que simula la integracion con el modulo de administración de votos
	@RequestMapping("/mine")
	public @ResponseBody
	Collection<Survey> simulaJson() {
		Survey r;
		r = new Survey();
		List<Survey> surveys = new LinkedList<Survey>();

		r.setId(1);
		r.setTitle("Probando");
		r.setCensus(1);
		r.setDescription("Dscr");
		r.setStartDate(new Date(System.currentTimeMillis()));
		r.setEndDate(new Date(System.currentTimeMillis()));
		
		surveys.add(r);
		

		return surveys;

	}
}