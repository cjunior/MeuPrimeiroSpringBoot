package br.edu.ifce.MeuPrimeiroSpringBoot.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class EnderecoCliente extends Endereco {
	
	private boolean isEntrega;

	public boolean isEntrega() {
		return isEntrega;
	}

	public void setEntrega(boolean isEntrega) {
		this.isEntrega = isEntrega;
	}
	

}
