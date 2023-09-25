package br.edu.ifce.MeuPrimeiroSpringBoot.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "C")
public class EnderecoCliente extends Endereco {

}
