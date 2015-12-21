package controllers.angular;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//No ponemos @RequestMapping porque si no el redirect de los métodos no funcionan
public class AngularMapperController{
	
	//Hay que poner el @RequestMapping completo en cada método
	@RequestMapping(value="/resultados/encuestas", method=RequestMethod.GET)
	public String resultadosEncuestas(@RequestParam(value = "encuesta", required = false) Integer encuesta){
		String redirectUrl;
		redirectUrl = "/#/error.do";
		if(encuesta==null){
			redirectUrl = "/#/resultados/encuestas.do";
		}else{
			redirectUrl = "/#/resultados/encuestas.do?encuesta="+encuesta;
		}
		return "redirect:"+redirectUrl;
	}
	
	@RequestMapping(value="/error.do",method = RequestMethod.GET)
	public String errorToIndex(){
		return "redirect:/#/";
	}

}
