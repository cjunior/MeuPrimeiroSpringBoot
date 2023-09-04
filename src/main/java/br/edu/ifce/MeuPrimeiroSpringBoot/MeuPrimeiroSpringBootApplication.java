package br.edu.ifce.MeuPrimeiroSpringBoot;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifce.MeuPrimeiroSpringBoot.model.Usuario;
import br.edu.ifce.MeuPrimeiroSpringBoot.repository.UsuaryRepository;

@SpringBootApplication
public class MeuPrimeiroSpringBootApplication implements CommandLineRunner {
	@Autowired
	private UsuaryRepository u;
	
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario user = new Usuario();
		user.setCpf("999.999.999-99");
		user.setDataNascimento(new Date());
		user.setNome("Fulano de tal");
		u.save(user);
		
		
		
	}

}
