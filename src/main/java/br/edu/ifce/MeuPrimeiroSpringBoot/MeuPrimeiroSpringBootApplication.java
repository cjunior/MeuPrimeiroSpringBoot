package br.edu.ifce.MeuPrimeiroSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifce.MeuPrimeiroSpringBoot.serviceImpl.ClienteServiceImpl;

@SpringBootApplication
public class MeuPrimeiroSpringBootApplication implements CommandLineRunner {
	@Autowired
	ClienteServiceImpl cliente;
	
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		
	}

}
