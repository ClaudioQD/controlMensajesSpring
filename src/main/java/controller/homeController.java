package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Model.Mensaje;
import service.MensajeService;

@Controller
public class homeController {
	
	
	@Autowired
	private MensajeService mensajeService;
	
	@GetMapping("/mensajes")
	public String ingresoDatos() {
		
		
		return"inicio";
	}
	
	
	
	@RequestMapping(value ="/listarmensajes",method=RequestMethod.GET)
	public String mostrarMensaje(ModelMap model) {
		model.addAttribute("listaMensaje", mensajeService.obternerListaMensaje());
		return "mensajes"; //spring intentara levantar una pagina con nombre mensajes
	}
	
	
	
	@RequestMapping(value ="/guardarMensajes",method=RequestMethod.POST)
	public String guardarMensajes(ModelMap model, @ModelAttribute("mensaje") Mensaje mensaje ) { 
				mensajeService.guardarMensaje(mensaje);
		model.addAttribute("listaMensaje", mensajeService.obternerListaMensaje());
		return"mensajes"; //spring intentara levantar una pagina con nombre mensajes
	}
	
	
	
	
	

}
