package br.edu.ifce.MeuPrimeiroSpringBoot;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifce.MeuPrimeiroSpringBoot.model.Cliente;
import br.edu.ifce.MeuPrimeiroSpringBoot.model.Endereco;
import br.edu.ifce.MeuPrimeiroSpringBoot.model.Lojas;
import br.edu.ifce.MeuPrimeiroSpringBoot.model.Usuario;
import br.edu.ifce.MeuPrimeiroSpringBoot.repository.ClienteRepository;
import br.edu.ifce.MeuPrimeiroSpringBoot.repository.EnderecoRepository;
import br.edu.ifce.MeuPrimeiroSpringBoot.repository.LojasRepository;
import br.edu.ifce.MeuPrimeiroSpringBoot.repository.UsuaryRepository;

@SpringBootApplication
public class MeuPrimeiroSpringBootApplication implements CommandLineRunner {
	@Autowired
	private UsuaryRepository u;
	
	@Autowired
	private ClienteRepository cl;
	
	@Autowired
	private LojasRepository loja;
	
	@Autowired
	private EnderecoRepository end;
	
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	Cliente c = new Cliente();
	Endereco e = new Endereco();

	
		
		

		
		
	}

}
