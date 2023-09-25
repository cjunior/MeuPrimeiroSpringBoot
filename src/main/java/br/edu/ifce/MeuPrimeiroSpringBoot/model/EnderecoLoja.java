package br.edu.ifce.MeuPrimeiroSpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class EnderecoLoja extends Endereco {

}
