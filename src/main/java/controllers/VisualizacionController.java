///* CustomerController.java
// *
// * Copyright (C) 2013 Universidad de Sevilla
// * 
// * The use of this project is hereby constrained to the conditions of the 
// * TDG Licence, a copy of which you may download from 
// * http://www.tdg-seville.info/License.html
// * 
// */
//
//package controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import domain.Propuesta;
//import domain.ReferendumRecuento;
//
//import services.ReferendumRecuentoService;
//
//@Controller
//@RequestMapping("/resultados")
//public class VisualizacionController extends AbstractController {
//
//	// Constructors -----------------------------------------------------------
//
//	public VisualizacionController() {
//		super();
//	}
//	
//	@Autowired
//	private ReferendumRecuentoService referendumRecuentoService;
//
//	// metodo de prueba sin tener que comunicarnos con Recuento
//	@RequestMapping("/ver")
//	public ModelAndView verResultados() {
//		ModelAndView result = new ModelAndView("results/result");
//		
//		return result;
//
//	}
//	
//	@RequestMapping("/encuestas")
//	public ModelAndView verEncuestas() {
//		ModelAndView result = new ModelAndView("results/encuestas");
//		result.addObject("encuestas", referendumRecuentoService.findAll());
//		return result;
//
//	}
//	@RequestMapping("/graficas")
//	public ModelAndView verGraficas(@RequestParam int id) {
//		ModelAndView result = new ModelAndView("results/graficas");
//		
//		ReferendumRecuento referendumRecuento;
//		
//		referendumRecuento = referendumRecuentoService.getReferemdumById(id);
//		String tituloPregunta = null;
//		Integer no=0;
//		Integer si=0;
//		for(Propuesta p: referendumRecuento.getPropuestas()){
//			tituloPregunta = p.getPregunta();
//		 no = p.getNumerosNo();
//		 si = p.getNumerosSi();
//			
//			
//		}
//	result.addObject("tituloPregunta", tituloPregunta);
//	result.addObject("numeroSi", si);
//	result.addObject("numeroNo",no);
//		return result;
//
//	}
//
//}