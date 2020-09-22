package com.cjhercen.springboot.app.controllers;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class InicioController {
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@GetMapping(value = "/inicio")
	public String editar(Map<String, Object> model, RedirectAttributes flash) {
		log.debug("He llegado a la pagina de inicio");
		return "inicio";
	}

	
}
