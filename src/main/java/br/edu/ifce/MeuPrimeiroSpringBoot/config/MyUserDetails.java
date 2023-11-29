package br.edu.ifce.MeuPrimeiroSpringBoot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.edu.ifce.MeuPrimeiroSpringBoot.model.Usuario;
import br.edu.ifce.MeuPrimeiroSpringBoot.serviceImpl.UsuarioServiceImpl;

public class MyUserDetails implements  UserDetailsService{
	
	@Autowired
	UsuarioServiceImpl usuario;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario u = this.usuario.buscarUsuarioPorCPF(username);
		
		String[] authorities = new String[1];
		authorities[0]="ROLE_USER";
		
		
		return new org.springframework.security.core.userdetails.User (
				u.getCpf(),	
				u.getPassword(),
				AuthorityUtils.createAuthorityList(authorities));
		
}
	
		
		

	

}
