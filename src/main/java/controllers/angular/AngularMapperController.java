package controllers.angular;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//No ponemos @RequestMapping porque si no el redirect de los métodos no funcionan
public class AngularMapperController{
	
	//Hay que poner el @RequestMapping completo en cada método
	@RequestMapping(value="/resultados/encuestas", method=RequestMethod.GET)
	public String resultadosEncuestas(){
		String redirectUrl;
		redirectUrl = "/#/resultados/encuestas.do";
		return "redirect:"+redirectUrl;
	}

}
