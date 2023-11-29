package br.edu.ifce.MeuPrimeiroSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifce.MeuPrimeiroSpringBoot.model.Usuario;
import br.edu.ifce.MeuPrimeiroSpringBoot.serviceImpl.ClienteServiceImpl;
import br.edu.ifce.MeuPrimeiroSpringBoot.serviceImpl.UsuarioServiceImpl;

@SpringBootApplication
public class MeuPrimeiroSpringBootApplication implements CommandLineRunner {
	@Autowired
	UsuarioServiceImpl user;
	
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		Usuario u = new Usuario();
		u.setCpf("999.999.999-99");
		u.setPassword("$2a$12$Rz5rjxPlrR9spKLHYWNJler4vAUAUfeTB0Y0Vo9gunhTdTe1dAQ2W");
		u.setNome("Joao Jose da Silva");
		user.salvar(u);
		
		
	}

}
