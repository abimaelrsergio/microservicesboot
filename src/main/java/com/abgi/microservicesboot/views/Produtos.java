package com.abgi.microservicesboot.views;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Produtos {

	@GetMapping("/products")
	public String buscarTodosMetadados() {

		return "[   {      \"id\": \"1\",      \"name\": \"Honey\"   },   {      \"id\": \"2\",      \"name\": \"Almond\"   }]";
	}
	
	@PostMapping("/products")
	public String salvarTodosMetadados() {

		return "[   {      \"id\": \"1\",      \"name\": \"Honey\"   },   {      \"id\": \"2\",      \"name\": \"Almond\"   }]";
	}
}
