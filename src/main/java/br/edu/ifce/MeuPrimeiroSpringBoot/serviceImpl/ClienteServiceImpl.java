package br.edu.ifce.MeuPrimeiroSpringBoot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifce.MeuPrimeiroSpringBoot.exceptions.ClienteNotFoundException;
import br.edu.ifce.MeuPrimeiroSpringBoot.model.Cliente;
import br.edu.ifce.MeuPrimeiroSpringBoot.repository.ClienteRepository;
import br.edu.ifce.MeuPrimeiroSpringBoot.service.ClienteService;

@Service
public class ClienteServiceImpl  implements ClienteService{
	@Autowired
	ClienteRepository cliente;
	
	@Override
	public Cliente salvar(Cliente c) {
		return cliente.save(c);
	}

	@Override
	public Cliente buscarClientePorId(Long id) {
		return cliente.findById(id).orElseThrow(() -> new ClienteNotFoundException(id));
	}

	@Override
	public List<Cliente> buscarTodos() {
		return cliente.findAll();
	}

	@Override
	public Cliente editar(Long id, Cliente newinfo) {
		Cliente c = buscarClientePorId(id);
		c.setCpf(newinfo.getCpf());
		c.setNome(newinfo.getNome());
		return cliente.save(c);
	}

	@Override
	public Cliente editar(Cliente newinfo) {
		return cliente.save(newinfo);
	}

	@Override
	public void excluir(Long id) {
		cliente.deleteById(id);
		
	}
	
}
