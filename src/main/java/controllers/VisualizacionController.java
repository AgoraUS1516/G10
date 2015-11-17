/* CustomerController.java
 *
 * Copyright (C) 2013 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 * 
 */

package controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import services.PropuestaService;
import services.ReferendumRecuentoService;
import domain.Propuesta;
import domain.ReferendumRecuento;

@Controller
@RequestMapping("/resultados")
public class VisualizacionController extends AbstractController {

	// Constructors -----------------------------------------------------------

	public VisualizacionController() {
		super();
	}

	// metodo de prueba sin tener que comunicarnos con Recuento
	@RequestMapping("/ver")
	public ModelAndView verResultados() {
		ModelAndView result = new ModelAndView("results/result");
		return result;

	}

}