package com.viewnext.holamundo.javaconfig.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.viewnext.holamundo.javaconfig.modelo.entidades.Persona;

@Controller
@RequestMapping("/Persona")
public class GestionPersonaController {

	//Alternativa 2, junto con el View Controller
	/*@ModelAttribute("persona")
	public Persona initPersona() {
		return new Persona();
	}*/

	
	@RequestMapping(path = "/Alta", method = RequestMethod.GET)
	public String inicializadorFormularioAltaPersona(Model model) {
		//Alternativa 1
		model.addAttribute("persona", new Persona());

		return "formularioAltaPersona";
	}

	@RequestMapping(path = "/Alta", method = RequestMethod.POST)
	public String procesarAltaPersona(
				@Valid @ModelAttribute Persona persona, 
				Errors errors,
				Model model) {

		System.out.println(persona.getNombre() + "-" + persona.getFechaNacimiento() + "-" + persona.getDni());

		if(!errors.hasErrors()){
			// Aqui se deberia invocar el servicio
			model.addAttribute("mensaje", "El alta ha ido bien");
		}

		return "formularioAltaPersona";
	}

}
