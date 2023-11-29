package br.edu.ifce.MeuPrimeiroSpringBoot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifce.MeuPrimeiroSpringBoot.model.Usuario;
import br.edu.ifce.MeuPrimeiroSpringBoot.repository.UsuaryRepository;
import br.edu.ifce.MeuPrimeiroSpringBoot.service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuaryRepository usuario;

	@Override
	public Usuario buscarUsuarioPorCPF(String userneme) {
		return usuario.buscarAluno(userneme);
	}

	@Override
	public Usuario salvar(Usuario u) {
		return usuario.save(u);
	}

}
