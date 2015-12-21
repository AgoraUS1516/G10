package controllers.angular;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import services.ReferendumRecuentoService;
import domain.ReferendumRecuento;

@Controller
@RequestMapping("/api/resultados")
public class AngularRestController{

	@Autowired
	private ReferendumRecuentoService referendumRecuentoService;
	
	@RequestMapping(value="/encuestas", method = RequestMethod.GET)
	public @ResponseBody Object encuestas(@RequestParam(value="encuesta", required=false) Integer encuestaId){
		
		if(encuestaId==null){
			//Nos devuelve todas las encuestas
			List<ReferendumRecuento> result = new ArrayList<ReferendumRecuento>();
			Collection<ReferendumRecuento> encuestas = referendumRecuentoService.findAll();
			result.addAll(encuestas);
			return result;
		}else{
			//Nos devuelve la encuesta dependiendo del id
			ReferendumRecuento result;
			result = referendumRecuentoService.getReferemdumById(encuestaId);
			return result;
		}
	}
	
	
}