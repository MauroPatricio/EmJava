package mz.com.turmaGrande.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mz.com.turmaGrande.modelos.Conversao;

@Controller
public class TesteController {
	
	@RequestMapping("/Conversor")
	public String execute() {
		Conversao  conversor = new Conversao();
		conversor.introduzDigitos("${numero}");
	return "Formulario";
	}
}
