package com.cjhercen.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	/*
	 * Metodo que controla la página de inicio según el tipo de usuario, si es admin empezará
	 * con la página de Incidencias una vez que haya hecho login y si es usuario normal, comenzará
	 * directamente en la pagina de Fichaje nada mas se haya logueado
	 * @return pagina a la que se dirige
	 */
	@RequestMapping(value = {"/","/index"})
	public String inicio() {
	
		return "redirect:/inicio";

	}
	
}
