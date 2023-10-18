package br.edu.ifce.MeuPrimeiroSpringBoot.exceptions;

public class ClienteNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ClienteNotFoundException (Long id) {
		super("Não foi possível encontrar o cliente de id: " + id);
	}

}
