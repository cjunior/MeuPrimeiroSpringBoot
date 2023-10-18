package br.edu.ifce.MeuPrimeiroSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifce.MeuPrimeiroSpringBoot.model.Cliente;
import br.edu.ifce.MeuPrimeiroSpringBoot.serviceImpl.ClienteServiceImpl;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteServiceImpl cliente;
	
	@GetMapping("/listar")
	List<Cliente> listAll(){
		return cliente.buscarTodos();
	}
	@PostMapping("/add")
	Cliente salvar(@RequestBody Cliente c) {
		return cliente.salvar(c);
	}
	

}
