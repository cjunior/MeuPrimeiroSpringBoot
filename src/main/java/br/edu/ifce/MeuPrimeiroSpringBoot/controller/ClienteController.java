package br.edu.ifce.MeuPrimeiroSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifce.MeuPrimeiroSpringBoot.model.Cliente;
import br.edu.ifce.MeuPrimeiroSpringBoot.serviceImpl.ClienteServiceImpl;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteServiceImpl cliente;
	
	@GetMapping("/listar")
	String listAll(ModelMap model){
		model.addAttribute("clientes",cliente.buscarTodos());
		return "/cliente/lista";
	}
	
	@GetMapping("/cadastrar")
	String salvar(ModelMap model){
		model.addAttribute("cliente",new Cliente());
		return "/cliente/cadastro";
	}
	
	
	@PostMapping("/salvar")
	String salvar(Cliente c) { 
				cliente.salvar(c);
				return "redirect:/cliente/listar";
	}
	
	@GetMapping("/editar/{id}")
	String preEditar(@PathVariable("id") Long id, ModelMap model){
		model.addAttribute("cliente",cliente.buscarClientePorId(id));
		return "/cliente/cadastro";
	}
	
	@GetMapping("/excluir/{id}")
	String excluir(@PathVariable("id") Long id, ModelMap model){
		cliente.excluir(id);
		return "redirect:/cliente/listar";
	}
	
	@PostMapping("/editar")
	String editar(Cliente c) { 
				cliente.editar(c);
				return "redirect:/cliente/listar";
	}
	
	

}
