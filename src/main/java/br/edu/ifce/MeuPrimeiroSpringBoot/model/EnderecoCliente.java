package br.edu.ifce.MeuPrimeiroSpringBoot.model;

import jakarta.persistence.Entity;

@Entity
public class EnderecoCliente extends Endereco {
	
	private boolean isEntrega;

	public boolean isEntrega() {
		return isEntrega;
	}

	public void setEntrega(boolean isEntrega) {
		this.isEntrega = isEntrega;
	}
	

}
