package br.edu.ifce.MeuPrimeiroSpringBoot.service;
import br.edu.ifce.MeuPrimeiroSpringBoot.model.Usuario;

public interface UsuarioService {
	
	
	
	Usuario buscarUsuarioPorCPF (String userneme);

	Usuario salvar(Usuario u);
}
