package br.edu.ifce.MeuPrimeiroSpringBoot.service;

import java.util.List;

import br.edu.ifce.MeuPrimeiroSpringBoot.model.Cliente;

public interface ClienteService {
	
	Cliente salvar(Cliente c);
	
	Cliente buscarClientePorId (Long id);

	List<Cliente> buscarTodos();
	
	Cliente editar (Long id , Cliente newinfo);
}
